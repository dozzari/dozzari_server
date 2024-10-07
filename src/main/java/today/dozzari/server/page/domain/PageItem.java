package today.dozzari.server.page.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;

@Builder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record PageItem(
        Integer index,
        String name,
        Integer price,
        PageItemType itemType
) {
}
