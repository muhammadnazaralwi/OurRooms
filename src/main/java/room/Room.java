package room;

// Class Menu merepresentasikan data room seperti di JSON
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

    public String getName() {
        return name;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public int getPrice() {
        return price;
    }

    public boolean isBreakfast() {
        return breakfast;
    }
}
