package reference.methodReference;

public class ReffDemo {
    public static void main(String[] args) {
//        System.out.println("Learning method reference");

        //static method reference
        //ClassName::methodName
//        WorkInter work = Stuff::doStuff;
//        work.doTask();
//
//        Runnable thread1 = Stuff::threadTask;
//        Thread t1 = new Thread(thread1);
//        t1.start();

        //non-static method reference
        //Object::methodName
        Stuff stuff = new Stuff();
        Runnable thread2 = stuff::printNumber;
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
