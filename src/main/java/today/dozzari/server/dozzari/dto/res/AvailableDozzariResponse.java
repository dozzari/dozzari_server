package today.dozzari.server.dozzari.dto.res;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;

@Builder
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public record AvailableDozzariResponse(
        String dozzariId,
        String dozzariImageUrl,
        String setInfo,
        String availableTimes
) {
}
