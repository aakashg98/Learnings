package reference;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(14,12352,5625,367356,347,457);
        System.out.println(integers);

        integers.stream().forEach(System.out::println);
    }
}
