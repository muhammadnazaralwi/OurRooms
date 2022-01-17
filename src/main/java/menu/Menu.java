package menu;

// Class Menu merepresentasikan data menu seperti di JSON
public class Menu {
    private int id;
    private String name;

    public Menu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
