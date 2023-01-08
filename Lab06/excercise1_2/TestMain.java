package excercise1_2;

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student("Nam Nguyen", "Hanoi", "Java", 2022, 1.1);
        System.out.println(s1);
        s1.setProgram("Python");
        s1.setYear(2021);
        s1.setFee(2.2);
        System.out.println(s1);

        Staff s2 = new Staff("Nam Nguyen", "Hanoi", "KHTN", 1.1);
        System.out.println(s2);
        s2.setSchool("KHXHNV");
        s2.setPay(2.2);
        System.out.println(s2);
    }
}
