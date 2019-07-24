package Task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task1_1 {
    public static void main(String[] args) {
        String myBirthday = "29.06.1990";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate myBday = LocalDate.parse(myBirthday, formatter);
        LocalDateTime Bday = LocalDateTime.of(myBday, LocalTime.of(4, 30, 33, 0));
        long years = ChronoUnit.YEARS.between(Bday, LocalDateTime.now());
        long months = ChronoUnit.MONTHS.between(Bday, LocalDateTime.now());
        long weeks = ChronoUnit.WEEKS.between(Bday, LocalDateTime.now());
        long days = ChronoUnit.DAYS.between(Bday, LocalDateTime.now());
        long hours = ChronoUnit.HOURS.between(Bday, LocalDateTime.now());
        long minutes = ChronoUnit.MINUTES.between(Bday, LocalDateTime.now());
        long seconds = ChronoUnit.SECONDS.between(Bday, LocalDateTime.now());
        long millis = ChronoUnit.MILLIS.between(Bday, LocalDateTime.now());
        long nanos = ChronoUnit.NANOS.between(Bday, LocalDateTime.now());

        System.out.println("Сейчас: " + LocalDateTime.now());
        System.out.println("Мой ДР: " + Bday);
        System.out.println("Разница между датами:");
        System.out.println("- " + years + " лет;");
        System.out.println("- " + months + " месяцев;");
        System.out.println("- " + weeks + " недель;");
        System.out.println("- " + days + " дней;");
        System.out.println("- " + hours + " часов;");
        System.out.println("- " + minutes + " минут;");
        System.out.println("- " + seconds + " секунд;");
        System.out.println("- " + millis + " миллисекунд;");
        System.out.println("- " + nanos + " наносекунд;");

    }

}
