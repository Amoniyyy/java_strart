package switch_case;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        WeekDays days = WeekDays.SUNDAY;
        switch (days) {
            case MONDAY -> System.out.println("Today is Monday");
            case TUESDAY -> System.out.println("Today is Tuesday");
            case WEDNESDAY -> System.out.println("Today is Wednesday");
            case THURSDAY -> System.out.println("Today is Thursday");
            case FRIDAY -> System.out.println("Today is Friday");
            case SATURDAY -> System.out.println("Today is Saturday");
            case SUNDAY -> System.out.println("Today is Sunday");
        }
    }

    enum WeekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
