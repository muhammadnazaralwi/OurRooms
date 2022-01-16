package room;

import feature.Loader;
import utils.Parser;

// RoomLoader mengimplementasikan interface Loader
// dengan mengisi Room sebagai generics T
public class RoomLoader implements Loader<Room> {
    public Room[] load() throws Exception {
        // Membuat object parser
        Parser parser = new Parser();

        // Mengurai JSON dengan method parse melalui object parser
        // Nilai yang dikembalikan berupa array dari Menu
        return parser.parse(Room[].class, "src/main/resources/room.json");
    }
}
