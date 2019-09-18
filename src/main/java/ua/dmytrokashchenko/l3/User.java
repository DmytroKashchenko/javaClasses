package ua.dmytrokashchenko.l3;

public class User {
    private final String name;
    private final String surname;
    private final String password;
    private final String email;
    // більше 4 полів в конструкторі - патерн проектування використовується (патерн Builder) ??

//    public User(String name, String surname, String password, String email) {
//        this.name = name;
//        this.surname = surname;
//        this.password = password;
//        this.email = email;
//    }

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.password = builder.password;
        this.email = builder.email;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder {
        private String name;
        private String surname;
        private String password;
        private String email;

        public Builder() {
        }

        public User build(){
            return new User(this);
        }


        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }
    }

}
