package singleton;

public class Cloning {
    public static void main (String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode());

        Singleton instance2 = (Singleton) instance.clone();
        System.out.println(instance2.hashCode());
    }
}
