package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);

//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList =  stream.filter(i-> i%2 ==0).collect(Collectors.toList());
//        System.out.println(newList);

//        List<Integer> newList = list1.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
//        System.out.println(newList);

        List<Integer> newList1 = list1.stream().filter(i -> i>50).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
