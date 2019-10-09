package ua.dmytrokashchenko.lesson11;

public class example1 {
    public static class User {
        private final String name;

        public User(UserBuilder builder) {
            this.name = builder.name;
        }

        public static class UserBuilder {
            private String name;

            public UserBuilder() {
            }

            public User build() {
                return new User(this);
            }
        }
    }
}
