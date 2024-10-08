package today.dozzari.server.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import today.dozzari.server.admin.dto.req.AdminItemRequest;
import today.dozzari.server.admin.dto.req.AdminItemUpdateRequest;
import today.dozzari.server.admin.dto.res.AdminItemResponse;
import today.dozzari.server.admin.service.AdminItemService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminItemController {
    private final AdminItemService adminItemService;

    @PostMapping("/admin/item") // 아이템 등록하기 -> Create
    public ResponseEntity<?> postItem(@RequestBody AdminItemRequest request) {
        adminItemService.postItem(request);

        return ResponseEntity.ok(request);
    }

    @GetMapping("/admin/item") // 모든 아이템 가져오기 -> Read
    public ResponseEntity<List<AdminItemResponse>> getItem() {
        return ResponseEntity.ok(adminItemService.readAll());
    }

    @PutMapping("/admin/item") // 아이템의 재고 값 수정하기 -> Update
    public ResponseEntity<AdminItemResponse> updateItem(@RequestBody AdminItemUpdateRequest request) {
        AdminItemResponse response = adminItemService.updateItem(request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/admin/item/{id}") // 아이템 id 값으로 삭제하기 -> Delete
    public ResponseEntity<?> deleteItem(@PathVariable Long id) {
        adminItemService.deleteItem(id);
        return ResponseEntity.ok(null);
    }
}
