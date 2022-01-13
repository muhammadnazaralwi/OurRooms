package room;

import feature.Loader;
import utils.Parser;

public class RoomLoader implements Loader<Room> {
    public Room[] load() throws Exception {
        Parser parser = new Parser();

        return parser.parse(Room[].class, "src/main/resources/room.json");
    }
}
