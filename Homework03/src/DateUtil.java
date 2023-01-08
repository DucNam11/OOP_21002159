import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {

    public static int MIN_YEAR = 1;
    public static int MAX_YEAR = 9999;

    // Month's name – for printing
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    // Day's name - for printing
    public static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    // Number of days in each month (for non-leap years)
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //Numbers of month table
    public static int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};


    public static void main(String[] args) {

        System.out.println(isLeapYear(1900));  // false
        System.out.println(isLeapYear(2000));  // true
        System.out.println(isLeapYear(2011));  // false
        System.out.println(isLeapYear(2012));  // true

        System.out.println(isValidDate(2012, 2, 29));  // true
        System.out.println(isValidDate(2011, 2, 29));  // false
        System.out.println(isValidDate(2099, 12, 31)); // true
        System.out.println(isValidDate(2099, 12, 32)); // false

        System.out.println(getDayOfWeek(1982, 4, 24));  // 6:Sat
        System.out.println(getDayOfWeek(2000, 1, 1));   // 6:Sat
        System.out.println(getDayOfWeek(2054, 6, 19));  // 5:Fri
        System.out.println(getDayOfWeek(2012, 2, 17));  // 5:Fri

        compareTo(1982, 4, 24);
        compareTo(2000, 1, 1);
        compareTo(2054, 6, 19);
        compareTo(2012, 2, 17);

        System.out.println(toString(2012, 2, 14)); // Tuesday 14 Feb 2012
        System.out.println(toString(2014, 2, 26)); // Wednesday 26 Feb 2014
    }


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= monthDays;
    }

    // Return the day of the week, 0:Sun, 1:Mon, ..., 6:Sat
    public static int getDayOfWeek(int year, int month, int day) {
        // 1. Based on the first two digit of the year, get the number from the "century" table.
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);

        // 2. Add to the last two digit of the year.
        int lastTwoDigitsOfYear = year % 100;

        // 3. Add to "the last two digit of the year divide by 4, truncate the fractional part".
        int magicYearNumber = lastTwoDigitsOfYear / 4;

        // 4. Add to the number obtained from the month table.
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];

        // 5. Add to the day.

        // 6. The sum modulus 7 gives the day of the week, where 0 for SUN, 1 for MON, ..., 6 for SAT.
        return (magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + day) % 7;
    }

    public static void compareTo(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);  // month is 0-based
        // Get the day of the week number: 1 (Sunday) to 7 (Saturday)
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        String[] calendarDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // Print result
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }

    public static String toString(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, month, day);
        return strDays[d] + " " + day + " " + strMonths[month - 1] + " " + year;
    }
}

