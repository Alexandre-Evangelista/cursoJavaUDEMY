import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d01= LocalDate.parse("2024-04-01");
        LocalDateTime d02 = LocalDateTime.parse("2024-04-01T01:30:26");
        Instant d03= Instant.parse("2024-04-01T01:30:26Z");

        System.out.println(d01);
        LocalDate pastweek= d01.minusWeeks(1);
        System.out.println("past week: "+pastweek);
        LocalDateTime nextweek= d02.plusWeeks(1);
        System.out.println("next week: "+nextweek);
        System.out.println(d01.minus(2, ChronoUnit.DECADES));

        Duration t1 = Duration.between(d02, nextweek);
        // o primerio para converter e gambiarra o segundo e a melhor opçao
        Duration t2 = Duration.between(pastweek.atTime(0,0,5),d01.atStartOfDay());
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());

    }
}