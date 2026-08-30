package abstractFactory;

public class WebDeveloper implements Employee {

    @Override
    public String name() {
        System.out.println("I am a Web Developer");
        return "WEB DEVELOPER";
    }

    @Override
    public int salary() {
        return 40000;
    }
}
