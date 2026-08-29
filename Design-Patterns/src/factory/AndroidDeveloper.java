package factory;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Returning Android developer's salary");
        return 50000;
    }
}
