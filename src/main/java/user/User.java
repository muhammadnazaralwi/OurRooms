package user;

// Representasi dari user
public class User {
    private String nin;
    private String name;

    public User(String nin, String name) {
        this.nin = nin;
        this.name = name;
    }

    public String getNin() {
        return nin;
    }

    public String getName() {
        return name;
    }
}

