package room;

public class Room {
    int id;
    String name;
    String[] facilities;
    int price;
    boolean breakfast;

    public Room(int id, String name, String[] facilities, int price, boolean breakfast) {
        this.id = id;
        this.name = name;
        this.facilities = facilities;
        this.price = price;
        this.breakfast = breakfast;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBreakfast() {
        return breakfast;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }
}
