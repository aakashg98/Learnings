public class Company {

    int n;

    boolean f = false;

//    f = false -> chance of producer
//    f = true -> chance of consumer

    synchronized public void produce_item(int n) throws InterruptedException{
            if(f) {
                wait();
            }
            this.n = n;
            System.out.println("Producer produced: " + n);
            f = true;
            notify();
    }

    synchronized public void consume_item() throws  InterruptedException{
        if(!f) {
            wait();
        }
        System.out.println("Consumer consumed: " + n);
            f = false;
            notify();
    }
}
