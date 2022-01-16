package menu;

// Class Menu merepresentasikan data menu seperti di JSON
public class Menu {
    int id;
    String name;

    public Menu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
