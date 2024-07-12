package reference.constructorReference;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Leaning constructor reference");

//        Provider provider = ()-> {
//            return  new Student();
//        };

        //constructor reference
        //ClassName::new
        Provider provider = Student::new;

        Student student = provider.getStudent();
        student.display();
    }
}
