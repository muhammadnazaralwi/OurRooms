package room;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RoomLoader {
    public void load() throws FileNotFoundException {
        Room[] rooms = parse();

        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i].id + ". " + rooms[i].name);
        }
    }

    private static Room[] parse() throws FileNotFoundException {
        Gson gson = new Gson();

        return gson.fromJson(readFile("src/main/resources/room.json"), Room[].class);
    }

    private static BufferedReader readFile(String fileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(fileName));
    }
}
