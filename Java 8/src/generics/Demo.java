package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("LCWD");

        List list2 = new ArrayList();
        list2.add("LCWD");
        list2.add(12);
        list2.add(12.12);

        System.out.println(list1);
        System.out.println(list2);
    }
}
