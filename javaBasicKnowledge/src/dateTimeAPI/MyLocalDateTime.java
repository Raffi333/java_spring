package dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/*
yyyy-MM-dd-HH-mm-ss.zzz
*/
public class MyLocalDateTime {
    public static void main(String[] args) {

        // Create a LocalDateTime object representing the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);

//         Create a LocalDateTime object for a specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 5, 12, 10, 30, 15);
        System.out.println("Specific date and time: " + specificDateTime);

//         Create a LocalDateTime object for a specific date and time using LocalDate and LocalTime
        LocalDateTime specificDateTimeWithLocalDateAndLocalTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());

//         Retrieve individual components of a LocalDateTime
        int year = specificDateTime.getYear();
        int month = specificDateTime.getMonthValue();
        int day = specificDateTime.getDayOfMonth();
        int hour = specificDateTime.getHour();
        int minute = specificDateTime.getMinute();
        int second = specificDateTime.getSecond();
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        // Perform operations on LocalDateTime objects
        LocalDateTime futureDateTime = specificDateTime.plusDays(2).minusHours(1);
        System.out.println("Future date and time: " + futureDateTime);

        LocalDateTime pastDateTime = specificDateTime.minusMonths(1).plusMinutes(15);
        System.out.println("Past date and time: " + pastDateTime);

        System.out.println("---------------------------------");

        LocalDateTime _currentDateTime = LocalDateTime.now();
        LocalDateTime _specificDateTime = LocalDateTime.of(2023, 5, 12, 10, 30);
        LocalDateTime _pastDateTime = LocalDateTime.of(2023, 4, 1, 8, 0);
        LocalDateTime _futureDateTime = LocalDateTime.of(2023, 6, 1, 12, 0);

        System.out.println("Current DateTime: " + _currentDateTime);
        System.out.println("Specific DateTime: " + _specificDateTime);
        System.out.println("Past DateTime: " + _pastDateTime);
        System.out.println("Future DateTime: " + _futureDateTime);

        // Comparing DateTimes using isEqual()
        System.out.println("Is specificDateTime equal to currentDateTime? " + _specificDateTime.isEqual(_currentDateTime));
        System.out.println("Is specificDateTime equal to specificDateTime? " + _specificDateTime.isEqual(_specificDateTime));

        // Comparing DateTimes using isBefore()
        System.out.println("Is specificDateTime before currentDateTime? " + _specificDateTime.isBefore(_currentDateTime));
        System.out.println("Is specificDateTime before pastDateTime? " + _specificDateTime.isBefore(_pastDateTime));
        System.out.println("Is specificDateTime before futureDateTime? " + _specificDateTime.isBefore(_futureDateTime));

        // Comparing DateTimes using isAfter()
        System.out.println("Is specificDateTime after currentDateTime? " + _specificDateTime.isAfter(_currentDateTime));
        System.out.println("Is specificDateTime after pastDateTime? " + _specificDateTime.isAfter(_pastDateTime));
        System.out.println("Is specificDateTime after futureDateTime? " + _specificDateTime.isAfter(_futureDateTime));

    }
}
