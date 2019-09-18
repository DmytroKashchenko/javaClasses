package ua.dmytrokashchenko.l2;

public class User {
    private String name;
    private String surname;
    private int age;
    private boolean active;

    public User() {
        this.name = "DefaultName";
        this.surname = "DefaultSurname";
        this.active = false;
        this.age = 1;
    }

    public User(String name, String surname, int age, boolean active) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        User that = (User)obj;
//        if (that.name == null || that.surname == null || this.name == null || this.surname == null) {
//            return false;
//        }

//        return this.name.equals(that.name) && this.surname.equals(that.surname)
//                && (this.age == that.age) && (this.active == that.active);

        return this.name == null ? (this.name == null && that.name == null) : this.name.equals(that.name)
                && this.surname == null ? (this.surname == null && that.surname == null) : this.surname.equals(that.surname)
                && (this.age == that.age) && (this.active == that.active);// закінчити ??
    }

    @Override
    public int hashCode() {
        if (this.name != null && this.surname != null) {
            return (this.name + this.surname).hashCode() + this.age + (this.active ? 89 : 97);
        }
        else
            return 89 * ( this.name == null ? 1 : this.name.length() ) +
                97 * (this.surname == null ? 1 : this.surname.length() ) *
                this.age * (this.active ? 3 : 5);
    }
}
