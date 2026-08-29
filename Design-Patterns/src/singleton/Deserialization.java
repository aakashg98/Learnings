package singleton;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode());

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        out.writeObject(instance);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.ob"));
        Singleton instance2 = (Singleton) in.readObject();
        System.out.println(instance2.hashCode());
    }
}
