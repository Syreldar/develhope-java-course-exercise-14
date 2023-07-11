import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class DateTime
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();

        LocalDate endOfMonth = today.withDayOfMonth(today.lengthOfMonth());
        long daysLeftInMonth = ChronoUnit.DAYS.between(today, endOfMonth);
        System.out.printf("Days left until the end of the month: %d.%n", daysLeftInMonth);

        Year currentYear = Year.of(today.getYear());
        LocalDate endOfYear = LocalDate.of(currentYear.getValue(), 12, 31);
        long daysLeftInYear = ChronoUnit.DAYS.between(today, endOfYear);
        System.out.printf("Days left until the end of the year: %d.%n", daysLeftInYear);
    }
}
