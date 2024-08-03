import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01= LocalDate.now();

        LocalDateTime d02= LocalDateTime.now();

        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-04-20");

        LocalDateTime d05 = LocalDateTime.parse("2022-04-10T12:30:35");

        Instant d06 = Instant.parse("2024-03-12T10:20:40.797169Z");

        Instant d07 = Instant.parse("2024-03-12T10:20:40.797169-03:00");

         LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);

        LocalDateTime d09 = LocalDateTime.parse("20/03/2024 12:30",fmt2);

        LocalDate d10= LocalDate.of(2027,04,13);



        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);

    }
}