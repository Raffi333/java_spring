package dateTimeAPI;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
hh:mm:ss.zzz
*/
public class MyLocalTime {


    public static void main(String[] args) {

    /*
    plusHours(long hours), plusMinutes(long minutes), plusSeconds(long seconds):
     Adds the specified number of hours, minutes, or seconds to the current time and returns a new LocalTime object.
    minusHours(long hours), minusMinutes(long minutes), minusSeconds(long seconds):
     Subtracts the specified number of hours, minutes, or seconds from the current time and returns a new LocalTime object.
    getHour(), getMinute(), getSecond():
     Retrieves the hour, minute, and second components of a LocalTime.
    */

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // Create a LocalTime object for a specific time
        LocalTime specificTime = LocalTime.of(10, 30, 15);
        System.out.println("Specific time: " + specificTime);

        // Retrieve individual components of a time
        int hour = specificTime.getHour();
        int minute = specificTime.getMinute();
        int second = specificTime.getSecond();
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

        // Perform operations on LocalTime objects
        LocalTime futureTime = specificTime.plusHours(2);
        System.out.println("Future time: " + futureTime);

        LocalTime pastTime = specificTime.minusMinutes(15);
        System.out.println("Past time: " + pastTime);

        System.out.println("----------------------------------");

        LocalTime _currentTime = LocalTime.now();
        LocalTime _specificTime = LocalTime.of(15, 30);
        LocalTime _pastTime = LocalTime.of(12, 0);
        LocalTime _futureTime = LocalTime.of(18, 45);

        System.out.println("Current Time: " + _currentTime);
        System.out.println("Specific Time: " + _specificTime);
        System.out.println("Past Time: " + _pastTime);
        System.out.println("Future Time: " + _futureTime);

        // Comparing times using isEqual()
        System.out.println("Is specificTime equal to currentTime? " + _specificTime.equals(_currentTime));
        System.out.println("Is specificTime equal to specificTime? " + _specificTime.equals(_specificTime));

        // Comparing times using isBefore()
        System.out.println("Is specificTime before currentTime? " + _specificTime.isBefore(_currentTime));
        System.out.println("Is specificTime before pastTime? " + _specificTime.isBefore(_pastTime));
        System.out.println("Is specificTime before futureTime? " + _specificTime.isBefore(_futureTime));

        // Comparing times using isAfter()
        System.out.println("Is specificTime after currentTime? " + _specificTime.isAfter(_currentTime));
        System.out.println("Is specificTime after pastTime? " + _specificTime.isAfter(_pastTime));
        System.out.println("Is specificTime after futureTime? " + _specificTime.isAfter(_futureTime));

        System.out.println("-----------------------------------");

        //using time zone
        ZoneId yerevanZone = ZoneId.of("Asia/Yerevan");
        ZoneId parisZone = ZoneId.of("Europe/Paris");
        ZoneId losAngelesZone = ZoneId.of("America/Los_Angeles");
        System.out.println("Yerevan time by ZoneID: " + LocalTime.now(yerevanZone));
        System.out.println("Paris time by ZoneID: " + LocalTime.now(parisZone));
        System.out.println("Los_Angeles time by ZoneID: " + LocalTime.now(losAngelesZone));

        System.out.println("-----------------------------------");

        //using date time formatter
        System.out.println("Formatter HH::mm::ss"+LocalTime.now().format(DateTimeFormatter.ofPattern("HH::mm::ss")));
    }
}
