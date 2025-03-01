package generics;

public class Box<T> {

    T container;

    public Box(T container) {
        this.container = container;
    }

    public Object getValue() {
        return this.container;
    }

    public void performSomeTask() {
        if(container instanceof String){
            System.out.println("String: " + ((String) container).length());
        } else if (container instanceof Integer) {
            System.out.println("Integer: " + container);
        }
    }
}
