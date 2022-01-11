package user;

public class User {
    String nin;
    String name;

    public User(String nin, String name) {
        this.nin = nin;
        this.name = name;
    }

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
