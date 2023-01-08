package excercise1_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(16, 59, 59);
        System.out.println("Time: " + t1);
        System.out.println("Next second: " + t1.nextSecond());
        System.out.println("Next minute: " + t1.nextMinute());
        System.out.println("Next hour: " + t1.nextHour());
        System.out.println("Previous second: " + t1.previousSecond());
        System.out.println("Previous minute: " + t1.previousMinute());
        System.out.println("Previous hour: " + t1.previousHour());

        t1 = new MyTime(16, 59, 0);
        System.out.println("Time: " + t1);
        System.out.println("Previous second: " + t1.previousSecond());

        t1 = new MyTime(16, 0, 59);
        System.out.println("Time: " + t1);
        System.out.println("Previous minute: " + t1.previousMinute());

        t1 = new MyTime(0, 59, 59);
        System.out.println("Time: " + t1);
        System.out.println("Previous hour: " + t1.previousHour());
    }
}
