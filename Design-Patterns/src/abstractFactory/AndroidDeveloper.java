package abstractFactory;

public class AndroidDeveloper implements Employee {

    @Override
    public String name() {
        System.out.println("This is an Android Developer");
        return "ANDROID DEVELOPER";
    }

    @Override
    public int salary() {
        return 50000;
    }
}
