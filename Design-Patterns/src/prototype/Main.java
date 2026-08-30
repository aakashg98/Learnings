package prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadData();

        System.out.println(networkConnection);

        try {
            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();

            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection);
            System.out.println(networkConnection1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
