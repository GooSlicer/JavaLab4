package thirdTask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class thirdTask {
    public static void Action() {
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
    }
}
