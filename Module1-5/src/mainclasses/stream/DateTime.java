package mainclasses.stream;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long now = date.getTime();
        System.out.println(now);

        Instant instantNow = Instant.ofEpochMilli(now);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instantNow, ZoneId.of("Europe/Berlin"));

        System.out.println(localDateTime);

    }
}
