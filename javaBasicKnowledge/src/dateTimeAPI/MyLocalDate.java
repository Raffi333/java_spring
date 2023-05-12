package dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/*
 * default yyy-MM-dd
 * LocalDate is an immutable class
 */
public class MyLocalDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Create a LocalDate object for a specific date
        LocalDate specificDate = LocalDate.of(1998, Month.JUNE, 3);
        System.out.println("Specific date: " + specificDate);


        /*
        getYear(), getMonthValue(), getDayOfMonth():
        Retrieves the year, month, and day components of a LocalDate.
        */
        int year = specificDate.getYear();
        int month = specificDate.getMonthValue();
        int day = specificDate.getDayOfMonth();
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        /*
         * plusYears(long years), plusMonths(long months), plusDays(long days):
         * Adds the specified number of years, months, or days to the current date and returns a
         */
        LocalDate futureDate = specificDate.plusDays(10);
        System.out.println("Future date: " + futureDate);

        /*
         * minusYears(long years), minusMonths(long months), minusDays(long days):
         * Subtracts the specified number of years, months, or days from the current date and returns a new LocalDate object.
         */
        LocalDate pastDate = specificDate.minusMonths(2);
        System.out.println("Past date: " + pastDate);

        System.out.println("---------------------------");

        /*
        isEqual(LocalDate otherDate), isBefore(LocalDate otherDate), isAfter(LocalDate otherDate):
         Compares the LocalDate object with another LocalDate to check for equality, whether it is before or after the other date.
        */
        LocalDate _currentDate = LocalDate.now();
        LocalDate _specificDate = LocalDate.of(2023, 5, 12);
        LocalDate _pastDate = LocalDate.of(2022, 10, 1);
        LocalDate _futureDate = LocalDate.of(2023, 7, 30);

        System.out.println("Current Date: " + _currentDate);
        System.out.println("Specific Date: " + _specificDate);
        System.out.println("Past Date: " + _pastDate);
        System.out.println("Future Date: " + _futureDate);

        // Comparing dates using isEqual()
        System.out.println("Is specificDate equal to currentDate? " + _specificDate.isEqual(_currentDate));
        System.out.println("Is specificDate equal to specificDate? " + _specificDate.isEqual(_specificDate));

        // Comparing dates using isBefore()
        System.out.println("Is specificDate before currentDate? " + _specificDate.isBefore(_currentDate));
        System.out.println("Is specificDate before pastDate? " + _specificDate.isBefore(_pastDate));
        System.out.println("Is specificDate before futureDate? " + _specificDate.isBefore(_futureDate));

        // Comparing dates using isAfter()
        System.out.println("Is specificDate after currentDate? " + _specificDate.isAfter(_currentDate));
        System.out.println("Is specificDate after pastDate? " + _specificDate.isAfter(_pastDate));
        System.out.println("Is specificDate after futureDate? " + _specificDate.isAfter(_futureDate));

        System.out.println("-----------------------------------");

        //using date time formatter
        System.out.println("Formatter d::MM:yyyy-> "+ LocalDate.now().format(DateTimeFormatter.ofPattern("d::MM:yyyy")));
    }
}
