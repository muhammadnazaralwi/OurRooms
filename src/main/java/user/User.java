package user;

public class User {
    String nin;
    String name;

    public User(String nin, String name) {
        this.nin = nin;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "nin='" + nin + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
