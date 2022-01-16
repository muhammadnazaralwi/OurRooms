package room;

import feature.Printer;

public class RoomPrinter implements Printer {
    RoomLoader roomLoader = new RoomLoader();
    public void show() throws Exception {
        Room[] rooms = roomLoader.load();

        for (Room room : rooms) {
            System.out.println(room.id + ". " + room.name);
        }
    }

    public void showDetail(int id) throws Exception {
        Room[] rooms = roomLoader.load();;

        int index = id-1;
        System.out.println(rooms[index].name.toUpperCase());
        for (String facility : rooms[index].facilities) {
            System.out.println("\t- " + facility);
        }
        System.out.println("\tHarga: Rp" + rooms[index].price);
    }
}
