package room;

import com.google.gson.Gson;
import feature.Loader;
import utils.FileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class RoomLoader implements Loader<Room> {
    public Room[] load() throws Exception {
        return parse();
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

    private static Room[] parse() throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader roomJson = FileReader.readFile("src/main/resources/room.json");

        return gson.fromJson(roomJson, Room[].class);
    }
}
