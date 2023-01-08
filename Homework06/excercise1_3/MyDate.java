package excercise1_3;

public class MyDate {
    private int year, month, day;
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


    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
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

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        if (year < MIN_YEAR || year > MAX_YEAR) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (day <= 1 || day >= monthDays) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public MyDate nextDay() {
        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (monthDays == day && month == 12 && MAX_YEAR == year) {
            return this;
        }

        if (day == monthDays && month == 12) {
            setDate(year + 1, 1, 1);
            return this;
        }

        if (monthDays == day) {
            setDate(year, month + 1, 1);
            return this;
        }

        setDate(year, month, day + 1);
        return this;

    }

    public MyDate nextMonth() {
        if (month == 12 && year == MAX_YEAR) {
            return this;
        }

        int nextMonthDays = daysInMonths[month] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (day > nextMonthDays) {
            day = nextMonthDays;
        }

        if (month == 12) {
            nextMonthDays = daysInMonths[0];
            if (day > nextMonthDays) {
                day = nextMonthDays;
            }
            setDate(year + 1, 1, day);
            return this;
        }

        setDate(year, month + 1, day);
        return this;
    }

    public MyDate nextYear() {
        if (MAX_YEAR == year) {
            return this;
        }

        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (day > monthDays) {
            day = monthDays;
        }
        setDate(year + 1, month, day);
        return this;
    }

    public MyDate previousDay() {
        if (day == 1 && month == 1 && year == MIN_YEAR) {
            return this;
        }

        if (day == 1 && month == 1) {
            setDate(year - 1, 12, daysInMonths[11]);
            return this;
        }

        if (day == 1) {
            int monthDays = daysInMonths[month - 2] + (month == 2 && isLeapYear(year) ? 1 : 0);
            setDate(year, month - 1, monthDays);
            return this;
        }

        setDate(year, month, --day);
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1 && year == MIN_YEAR) {
            return this;
        }

        int previousMonthDays = daysInMonths[month - 2] + (month == 2 && isLeapYear(year) ? 1 : 0);
        if (month == 1) {
            setDate(year - 1, 12, previousMonthDays);
            return this;
        }

        setDate(year, month - 1, previousMonthDays);
        return this;
    }

    public MyDate previousYear() {
        if (year == MIN_YEAR) {
            return this;
        }

        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year - 1) ? 1 : 0);
        setDate(year - 1, month, monthDays);
        return this;
    }

    public String toString() {
        int weekDay = getDayOfWeek(year, month, day);
        return String.format("%1$s %2$d %3$s %4$d", strDays[weekDay], day, strMonths[month - 1], year);
    }

}