package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh");
//        List<String> newNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
//        System.out.println(newNames);
//
//        names.stream().forEach(e-> System.out.println(e));
//        names.stream().forEach(System.out::println);

        List<Integer> numbers = List.of(23,4,2,5,7,4);
//        List<Integer> squares = numbers.stream().map(number -> number*number).collect(Collectors.toList());
//        System.out.println(squares);

        //sort
//        numbers.stream().sorted(()).forEach(System.out::println);

        //reverse sorting
//        numbers.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);

        //min
//        Integer min = numbers.stream().min((x,y)-> x.compareTo(y)).get();
//        System.out.println(min);

        //max
//        Integer max = numbers.stream().max((x,y) -> x.compareTo(y)).get();
//        System.out.println(max);
    }
}
