package menu;

public class Menu {
    int id;
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
