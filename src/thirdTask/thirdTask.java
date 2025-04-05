package thirdTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class thirdTask {
    public static void Action() {
        Scanner scanner = new Scanner(System.in);
        // Тест 1
        System.out.println("1. Тест getMonthName:");
        System.out.println("\t3: " + DateTime.getMonthName(3));

        // Тест 2
        System.out.println("\n2. Тест findFridayThe13ths:");
        LocalDate[] fridays13 = DateTime.findFridayThe13ths(2025);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy (EEEE)");
        System.out.println("\tПятницы 13-го в 2023 году:");
        for (LocalDate date1 : fridays13) {
            System.out.println("\t" + date1.format(formatter));
        }

        // Тест 3
        System.out.println("\n3. Тест getLastDayOfMonth:");
        LocalDate date = LocalDate.of(2024, 2, 15);
        System.out.println("\tПоследний день месяца: " + DateTime.getLastDayOfMonth(date));

        // Тест 4
        System.out.println("\n4. Тест convertTimeFormat:");
        System.out.println("\tВстречаемся в 07:25 и 19:30: " + DateTime.convertTimeFormat("Встречаемся в 07:25 и 19:30"));

        // Тест 5
        System.out.println("\n5. Тест findFarthestDateTime:");
        LocalDateTime[] dates = {
                LocalDateTime.of(2023, 1, 1, 0, 0),
                LocalDateTime.of(2023, 6, 1, 0, 0),
                LocalDateTime.of(2024, 1, 1, 0, 0)
        };
        System.out.println("\tНаиболее удаленная дата: " + DateTime.findFarthestDateTime(LocalDateTime.now(), dates));

        // Тест 6
        System.out.println("\n6. Тест daysUntilNextSeptemberFirst:");
        System.out.println("\tСегодня до 1 сентября: " + DateTime.daysUntilNextSeptemberFirst(LocalDate.now()));

        // Тест 7
        System.out.println("\n7. Тест hoursUntilMidnight:");
        System.out.println("\nВведите часы");
        int hours = scanner.nextInt();
        System.out.println("\nВведите минуты");
        int minutes = scanner.nextInt();

        System.out.println("\t" + DateTime.hoursUntilMidnight(LocalTime.of(hours, minutes)) + " часов");

        // Тест 8
        //System.out.println("\n8. Тест getDayOfWeekStartingSunday:");
        //System.out.println("\t" + DateTime.getWeekAndDay(LocalDate.of(2023, 5, 15), DayOfWeek.WEDNESDAY));

        // Тест 9
        System.out.println("\n9. Тест getWeekBoundaries:");
        System.out.println("\t" + DateTime.getWeekBoundaries(LocalDate.of(2025, 3, 30), DayOfWeek.SATURDAY));
    }
}
