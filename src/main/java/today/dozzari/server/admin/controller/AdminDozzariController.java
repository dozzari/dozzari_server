package today.dozzari.server.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import today.dozzari.server.admin.dto.req.AdminDozzariRequest;
import today.dozzari.server.admin.dto.res.AdminDozzariResponse;
import today.dozzari.server.admin.service.AdminDozzariService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminDozzariController {
    private final AdminDozzariService adminDozzariService;

    // Dozzari 만들면 item 은 안만들어짐.
    @PostMapping("/admin/dozzari")
    public ResponseEntity<AdminDozzariResponse> postDozzari(@RequestBody AdminDozzariRequest request) {
        AdminDozzariResponse response = adminDozzariService.postDozzari(request);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/admin/dozzari")
    public ResponseEntity<List<AdminDozzariResponse>> getDozzari() {
        return ResponseEntity.ok(adminDozzariService.getDozzari());
    }

    @DeleteMapping("/admin/dozzari/{id}")
    public ResponseEntity<?> deleteDozzari(@PathVariable String id) {
        adminDozzariService.deleteDozzari(id);
        return ResponseEntity.ok(null);
    }
}
