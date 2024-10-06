package today.dozzari.server.order.dto.res;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import today.dozzari.server.common.entity.Item;
import today.dozzari.server.order.domain.OrderPickUpLocation;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record OrderResponse(
        String picnicSetName,
        LocalDateTime startAt,
        LocalDateTime endAt,
        List<Item> items,

        OrderPickUpLocation location,
        
        Integer price
) {
}
