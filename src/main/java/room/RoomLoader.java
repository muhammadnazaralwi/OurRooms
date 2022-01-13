package room;

import feature.Loader;
import utils.Parser;

public class RoomLoader implements Loader<Room> {
    public Room[] load() throws Exception {
        Parser parser = new Parser();

        return parser.parse(Room[].class, "src/main/resources/room.json");
    }

    public void showRoomList() throws Exception {
        Room[] rooms = load();

        for (Room room : rooms) {
            System.out.println(room.id + ". " + room.name);
        }
    }

    public void showDetailList(int id) throws Exception {
        Room[] rooms = load();

        int index = id-1;
        System.out.println(rooms[index].name.toUpperCase());
        for (String facility : rooms[index].facilities) {
            System.out.println("\t- " + facility);
        }
        System.out.println("\tHarga: Rp" + rooms[index].price);
    }
}
