package factory;

//When there is a superclass and multiple sub-classes and
// we want to get object of subclasses based on input and requirement
public class DeveloperClient {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println("Android developer salary: " + employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println("Web developer salary: " + employee.salary());
    }
}
