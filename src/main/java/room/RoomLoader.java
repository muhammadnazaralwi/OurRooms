package room;

import com.google.gson.Gson;
import detail.RoomDetail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RoomLoader {
    public Room[] load() throws FileNotFoundException {
        return parse();
    }

    public void showRoomList() throws FileNotFoundException {
        Room[] rooms = load();

        for (Room room : rooms) {
            System.out.println(room.id + ". " + room.name);
        }
    }

    public void showDetailList(int id) throws FileNotFoundException {
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

        return gson.fromJson(readFile("src/main/resources/room.json"), Room[].class);
    }

    private static BufferedReader readFile(String fileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(fileName));
    }
}
