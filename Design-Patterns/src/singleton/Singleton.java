package singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static Singleton instance;

    private Singleton(){
//        ReflectionApi safe
        if (instance != null) {
            throw new RuntimeException("Use existing instance");
        }
    };

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

//    Serialization safe
    public Object readResolve() {
        return instance;
    }

//    Clone safe
    @Override
    public Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
