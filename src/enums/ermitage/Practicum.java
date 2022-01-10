package enums.ermitage;

import java.time.DayOfWeek;

public class Practicum {
    public static void main(String[] args) {
        printHoursForDay(DayOfWeek.FRIDAY);
    }
    public static void printHoursForDay(DayOfWeek day) {
        if (DayOfWeek.TUESDAY.equals(day) || DayOfWeek.THURSDAY.equals(day)
        || DayOfWeek.SUNDAY.equals(day)) {
            System.out.println("В этот день музей работает с 11:00 до 19:00. Ждем вас!");
        } else if (DayOfWeek.WEDNESDAY.equals(day) || DayOfWeek.FRIDAY == day
        || DayOfWeek.SATURDAY.equals(day)) {
            System.out.println("В этот день музей работает с 11:00 до 20:00. Ждём вас!");
        } else {
            System.out.println("Понедельник — выходной. Будем рады видеть вас в другой день!");
        }
    }
}

enum dayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}