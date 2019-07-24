package Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task1_2 {
    public static void DifferenceBetweenDates(String date1, String date2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localdate1 = LocalDate.parse(date1, formatter);
        LocalDate localDate2 = LocalDate.parse(date2, formatter);
        long days = ChronoUnit.DAYS.between(localdate1, localDate2);
        System.out.println("Дано: " + localdate1 + ", " + localDate2);
        System.out.println("Разница в днях: " + days);

    }
}
