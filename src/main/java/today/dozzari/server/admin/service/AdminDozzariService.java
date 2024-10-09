package today.dozzari.server.admin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.admin.dto.req.AdminDozzariRequest;
import today.dozzari.server.admin.dto.res.AdminDozzariResponse;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.dozzari.repository.DozzariRepository;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdminDozzariService {
    private final DozzariRepository dozzariRepository;

    @Transactional
    public AdminDozzariResponse postDozzari(AdminDozzariRequest request) {
        // id에 중복된 값이 있는지 확인
        if (dozzariRepository.findById(request.id()).isPresent()) {
            throw new BusinessException(ExceptionCode.ILLEGAL_POST_DOZZARI);
        }

        Dozzari dozzari = dozzariRepository.save(Dozzari.builder()
                .id(request.id())
                .name(request.name())
                .imageUrl(request.imageUrl())
                .build());

        return AdminDozzariResponse.builder()
                .id(dozzari.getId())
                .name(dozzari.getName())
                .imageUrl(dozzari.getImageUrl())
                .build();
    }

    @Transactional(readOnly = true)
    public List<AdminDozzariResponse> getDozzari() {
        List<Dozzari> dozzaris = dozzariRepository.findAll();

        return dozzaris.stream()
                .map(dozzari -> AdminDozzariResponse.builder()
                        .id(dozzari.getId())
                        .name(dozzari.getName())
                        .imageUrl(dozzari.getImageUrl())
                        .build())
                .collect(Collectors.toList());
    }

    @Transactional
    public void deleteDozzari(String id) {
        Dozzari targetDozzari = dozzariRepository.findById(id)
                .orElseThrow(() -> new BusinessException(ExceptionCode.ILLEGAL_DELETE_DOZZARI));

        dozzariRepository.delete(targetDozzari);
    }
}
