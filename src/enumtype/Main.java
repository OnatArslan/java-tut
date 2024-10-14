package enumtype;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        System.out.printf("Name is %s, Ordinary Value = %d%n", weekDay.name(), weekDay.ordinal());

        DayOfTheWeek[] allDays = DayOfTheWeek.values();
        System.out.println(Arrays.toString(allDays));
    }
}
