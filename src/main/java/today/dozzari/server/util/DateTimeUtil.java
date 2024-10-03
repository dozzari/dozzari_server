package today.dozzari.server.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DateTimeUtil {

    public LocalDateTime parseDateTime(String dateTime) {
        return LocalDateTime.parse(dateTime);
    }
}
