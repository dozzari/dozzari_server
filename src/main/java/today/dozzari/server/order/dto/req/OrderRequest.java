package today.dozzari.server.order.dto.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import today.dozzari.server.order.domain.OrderPickUpLocation;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record OrderRequest(
        @Schema(description = "도짜리 id")
        String dozzariId,

        @Schema(description = "피크닉 시작 시간")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
        LocalDateTime startAt,

        @Schema(description = "피크닉 마치는 시간")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
        LocalDateTime endAt,

        @Schema(description = "수령 및 반납 위치")
        OrderPickUpLocation location,

        @Schema(description = "추가 물품")
        List<OrderItemsRequest> orderItems //아이템들
) {
}
