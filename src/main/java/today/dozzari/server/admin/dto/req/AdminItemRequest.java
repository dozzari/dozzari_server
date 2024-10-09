package today.dozzari.server.admin.dto.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;

@Builder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record AdminItemRequest(
        Long id,
        String name,
        Integer stock,
        Integer price
) {
}
