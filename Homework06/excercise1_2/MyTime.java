package excercise1_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(int hour, int minute, int second) {
        try {
            setTime(hour, minute, second);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Not valid hour's value");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Not valid minute's value");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Not valid second's value");
        }
        this.second = second;
    }

    public MyTime nextSecond() {
        try {
            setTime(hour, minute, ++second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        second = 0;
        return nextMinute();
    }

    public MyTime nextMinute() {
        try {
            setTime(hour, ++minute, second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        minute = 0;
        return nextHour();
    }

    public MyTime nextHour() {
        try {
            setTime(++hour, minute, second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        hour = 0;
        return this;
    }

    public MyTime previousSecond() {
        try {
            setTime(hour, minute, --second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        second = 59;
        return previousMinute();
    }

    public MyTime previousMinute() {
        try {
            setTime(hour, --minute, second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        minute = 59;
        return previousHour();
    }

    public MyTime previousHour() {
        try {
            setTime(--hour, minute, second);
            return this;
        } catch (IllegalArgumentException e) {
        }

        hour = 23;
        return this;
    }

    public String toString() {
        return String.format("%1$02d:%2$02d:%3$02d", hour, minute, second);
    }
}
