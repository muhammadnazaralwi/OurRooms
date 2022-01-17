package room;

// Class Menu merepresentasikan data room seperti di JSON
public class Room {
    private int id;
    private String name;
    private String[] facilities;
    private int price;
    private boolean breakfast;

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
