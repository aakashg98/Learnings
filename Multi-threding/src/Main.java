public class Main {

    public static void main(String[] args) {
        Company c = new Company();
        Consumer consumer = new Consumer(c);
        Producer producer = new Producer(c);

        consumer.start();
        producer.start();
    }
}
