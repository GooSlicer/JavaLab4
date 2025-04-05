package thirdTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.temporal.TemporalAdjusters;

public class DateTime {
    public static String getMonthName(int month) {
        if (month < 1 || month > 12) return null;
        return new java.text.DateFormatSymbols().getMonths()[month-1]; // потому что month это массив, а массив с нуля
    }

    public static LocalDate[] findFridayThe13ths(int year) {
        int count = 0;
        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, month, 13);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                count++;
            }
        }

        LocalDate[] result = new LocalDate[count];
        int index = 0;
        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, month, 13);
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                result[index++] = date;
            }
        }

        return result;
    }

    public static String getLastDayOfMonth(LocalDate date) {
        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMM dd, yyyy");
        return lastDay.format(formatter);
    }

    public static String convertTimeFormat(String input) {
        Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2})");
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            int hours = Integer.parseInt(matcher.group(1));
            int minutes = Integer.parseInt(matcher.group(2));
            String period = hours < 12 ? "AM" : "PM";
            hours = hours % 12;
            if (hours == 0) hours = 12;
            matcher.appendReplacement(result, hours + ":" + String.format("%02d", minutes) + " " + period);
        }
        matcher.appendTail(result);

        return result.toString();
    }

    public static String findFarthestDateTime(LocalDateTime reference, LocalDateTime[] dates) {
        LocalDateTime farthest = dates[0];
        long maxDiff = Math.abs(ChronoUnit.SECONDS.between(reference, farthest));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MMM yyyy (EEEE)");

        for (LocalDateTime date : dates) {
            long diff = Math.abs(ChronoUnit.SECONDS.between(reference, date));
            if (diff > maxDiff) {
                maxDiff = diff;
                farthest = date;
            }
        }
        return farthest.format(formatter);
    }

    public static long daysUntilNextSeptemberFirst(LocalDate date) {
        LocalDate nextSep1 = LocalDate.of(date.getYear(), 9, 1);
        if (date.isAfter(nextSep1)) {
            nextSep1 = nextSep1.plusYears(1);
        }
        return ChronoUnit.DAYS.between(date, nextSep1);
    }
}
