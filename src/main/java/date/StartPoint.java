package date;

import java.time.*;

public class StartPoint {
    public static void main(String[] args) {
//        System.out.println(isPreviousDay(LocalDateTime.now()));
//        naturalNextDate();
        System.out.println(durationMethod());
    }

    static long durationMethod() {
        ZonedDateTime newDay = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).withHour(0).withMinute(0).withSecond(0).withNano(0);
        ZonedDateTime now = ZonedDateTime.now();
        return Duration.between(newDay, now).toHours();
    }
    static void naturalNextDate() {
        Instant now = Instant.now();
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
        ZonedDateTime tomorrowSameTime = zonedDateTime.plusDays(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
        System.out.println(tomorrowSameTime.toString());
    }

    static boolean isPreviousDay(LocalDateTime localDateTime) {
        Instant now = Instant.now();
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault());
        ZonedDateTime today = zonedDateTime.withHour(0).withMinute(0).withSecond(0).withNano(0);
        return localDateTime.isBefore(today.toLocalDateTime());

    }
}
