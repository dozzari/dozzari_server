package today.dozzari.server.page.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import today.dozzari.server.common.entity.Item;
import today.dozzari.server.common.repository.ItemRepository;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.dozzari.entity.DozzariItem;
import today.dozzari.server.dozzari.repository.DozzariRepository;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;
import today.dozzari.server.page.domain.Category;
import today.dozzari.server.page.domain.CategoryType;
import today.dozzari.server.page.domain.PageItem;
import today.dozzari.server.page.domain.PageItemType;
import today.dozzari.server.page.dto.res.PageResponse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PageService {

    private final DozzariRepository dozzariRepository;
    private final ItemRepository itemRepository;

    public PageResponse getOrderPage(String dozzariId, LocalDateTime start, LocalDateTime end) {
        // 만약, end와 start의 차이가 2시간이내라면 예외 발생
        if (end.minusHours(2).isBefore(start)) {
            throw new BusinessException(ExceptionCode.ILLEGAL_DATE);
        }

        Dozzari dozzari = dozzariRepository.findById(dozzariId)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_DOZZARI));

        List<Category> categories = new ArrayList<>();

        List<Item> defaultItems = dozzari.getDozzariItems().stream().map(DozzariItem::getItem).toList();
        List<PageItem> defaultPageItems = new ArrayList<>();
        for (int idx = 0; idx < defaultItems.size(); idx++) {
            Item item = defaultItems.get(idx);
            PageItem pageItem = PageItem.builder()
                    .index(idx)
                    .name(item.getName())
                    .price(item.getPrice())
                    .itemType(PageItemType.DEFAULT)
                    .build();

            defaultPageItems.add(pageItem);
        }
        Category defaultCategory = new Category(CategoryType.DEFAULT, defaultPageItems);
        categories.add(defaultCategory);

        List<Item> addableItems = itemRepository.findAll().stream().filter(item -> item.getId() >= 200).toList();
        List<PageItem> addablePageItems = new ArrayList<>();
        for (int idx = 0; idx < addableItems.size(); idx++) {
            Item item = addableItems.get(idx);
            PageItem pageItem = PageItem.builder()
                    .index(idx)
                    .name(item.getName())
                    .price(item.getPrice())
                    .itemType(PageItemType.CHECK)
                    .build();

            addablePageItems.add(pageItem);
        }
        Category addableCategory = new Category(CategoryType.UNNECESSARY, addablePageItems);
        categories.add(addableCategory);

        return PageResponse.builder()
                .dozzariId(dozzari.getId())
                .name(dozzari.getName())
                .price((end.getHour() - start.getHour() - 2) * 3000 + 5000)
                .categories(categories)
                .build();
    }
}
