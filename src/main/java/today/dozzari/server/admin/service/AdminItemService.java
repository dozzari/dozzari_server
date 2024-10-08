package today.dozzari.server.admin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.admin.dto.req.AdminItemRequest;
import today.dozzari.server.admin.dto.req.AdminItemUpdateRequest;
import today.dozzari.server.admin.dto.res.AdminItemResponse;
import today.dozzari.server.common.entity.Item;
import today.dozzari.server.common.repository.ItemRepository;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdminItemService {
    private final ItemRepository itemRepository;

    @Transactional
    public void postItem(AdminItemRequest request) {
        // id에 중복된 값이 있는지 확인
        if (itemRepository.findById(request.id()).isPresent()) {
            throw new BusinessException(ExceptionCode.ILLEGAL_POST_ITEM);
        }

        itemRepository.save(Item.builder()
                .id(request.id())
                .name(request.name())
                .stock(request.stock())
                .price(request.price())
                .build());
    }

    @Transactional(readOnly = true)
    public List<AdminItemResponse> readAll() {
        List<Item> items = itemRepository.findAll();

        return items.stream()
                .map(item -> AdminItemResponse.builder()
                        .id(item.getId())
                        .name(item.getName())
                        .stock(item.getStock())
                        .price(item.getPrice())
                        .build())
                .collect(Collectors.toList());
    }

    @Transactional
    public AdminItemResponse updateItem(AdminItemUpdateRequest request) {
        // id 값을 기준으로 없는 아이템의 id를 보냈는지 확인
        Item targetItem = itemRepository.findById(request.id())
                .orElseThrow(() -> new BusinessException(ExceptionCode.ILLEGAL_DELETE_ITEM));
        // 조회한 id 값을 기준으로 재고값 추가 ex. 원래 재고값이 5개 request 에 들어온 값이 5이면 총 10개의 재고로 수정
        targetItem.addStock(request.stock());
        itemRepository.save(targetItem);
        return AdminItemResponse.builder()
                .id(targetItem.getId())
                .name(targetItem.getName())
                .stock(targetItem.getStock())
                .price(targetItem.getPrice())
                .build();
    }

    @Transactional
    public void deleteItem(Long id) {
        // id 값을 기준으로 없는 아이템의 id를 보냈는지 확인
        Item targetItem = itemRepository.findById(id)
                .orElseThrow(() -> new BusinessException(ExceptionCode.ILLEGAL_DELETE_ITEM));

        itemRepository.delete(targetItem);
    }
}
