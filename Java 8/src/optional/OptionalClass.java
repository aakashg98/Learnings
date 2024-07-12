package optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
//        String str = "Java is my language";
//        Optional<String> optional = Optional.ofNullable(str);
//
//        System.out.println(optional.isPresent());
//        System.out.println(optional.get());
//        System.out.println(optional.orElse("No value present"));

        Optional<String> name = getName();
        System.out.println(name.orElse("Null value"));
    }

    public static Optional<String> getName() {
        String name = "durgesh";
        return Optional.ofNullable(name);
    }
}
