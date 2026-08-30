package builder;

class User {

    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
    };

    public String getEmailId() {
        return emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "emailId='" + emailId + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    //    Inner class to create object
    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
