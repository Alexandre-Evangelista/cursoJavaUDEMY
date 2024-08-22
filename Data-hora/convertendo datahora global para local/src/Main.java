import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Main {
    public static void main(String[] args) {
        LocalDate d01= LocalDate.parse("2024-04-01");
        LocalDateTime d02 = LocalDateTime.parse("2024-04-01T01:30:26");
        Instant d03= Instant.parse("2024-04-01T01:30:26Z");

        LocalDate r1 =LocalDate.ofInstant(d03,ZoneId.systemDefault());
        LocalDate r2 =LocalDate.ofInstant(d03,ZoneId.of("Portugal"));
        LocalDateTime r3 =LocalDateTime.ofInstant(d03,ZoneId.of("Portugal"));
        System.out.println(d03);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        LocalDate dt1= LocalDate.parse("2040-04-13");
        System.out.println(dt1.getDayOfWeek());



    }
}