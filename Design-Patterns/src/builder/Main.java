package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.UserBuilder.builder()
                .setUserName("ABC")
                .setUserId("123")
                .setEmailId("abc.xyz.com")
                .build();

        System.out.println(user.toString());
    }
}
