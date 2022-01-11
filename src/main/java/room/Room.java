package room;

public class Room {
    int id;
    String name;
    String[] facilities;
    int price;
    boolean isFreeBreakfast;

    public Room(int id, String name, String[] facilities, int price, boolean isFreeBreakfast) {
        this.id = id;
        this.name = name;
        this.facilities = facilities;
        this.price = price;
        this.isFreeBreakfast = isFreeBreakfast;
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

    public boolean isFreeBreakfast() {
        return isFreeBreakfast;
    }

    public void setFreeBreakfast(boolean freeBreakfast) {
        isFreeBreakfast = freeBreakfast;
    }
}
