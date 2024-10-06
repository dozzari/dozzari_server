package today.dozzari.server.order.dto.req;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import today.dozzari.server.dozzari.entity.Dozzari;
import today.dozzari.server.order.domain.OrderPickUpLocation;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record OrderRequest(
        Dozzari dozzari, //도짜리 id
        LocalDateTime startAt, //피크닉 시작 시간
        LocalDateTime endAt, //피크닉 마치는 시간
        OrderPickUpLocation location,//수령 및 반납 위치
        List<OrderItemsRequest> orderItems //아이템들
) {
}
