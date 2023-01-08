package singleton;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM K66A5");
        foo.query("SELECT * FROM K66A5 WHERE 1 = 1");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM K65A5");

        System.out.println(foo == bar);
    }
}
