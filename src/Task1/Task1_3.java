package Task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Task1_3 {
    public static void main(String[] args) {
        String date = "Friday, Aug 12, 2016 12:10:56 PM";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("cccc, MMM dd, yyyy hh:mm:ss");
        LocalDateTime date1 = LocalDateTime.now();

        String text = date1.format(formatter);
        //LocalDateTime x = LocalDateTime.parse(date, formatter);

        System.out.println(text);
    }
}
https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html