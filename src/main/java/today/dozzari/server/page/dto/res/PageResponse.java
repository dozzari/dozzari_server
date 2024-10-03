package today.dozzari.server.page.dto.res;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import today.dozzari.server.page.domain.Category;

import java.util.List;

@Builder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record PageResponse(
        Long dozzariId,
        String name,
        Integer price,
        List<Category> categories
) {
}
