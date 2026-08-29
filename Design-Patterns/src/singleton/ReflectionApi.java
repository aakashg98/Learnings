package singleton;

import java.lang.reflect.Constructor;

public class ReflectionApi {
    public static void main(String[] args) throws Exception {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode());

        Constructor<Singleton> constructor= Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2 =  constructor.newInstance();
        System.out.println(instance2.hashCode());
    }
}
