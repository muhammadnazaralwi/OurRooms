package detail;

import com.google.gson.Gson;
import menu.Menu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RoomDetailLoader {
    public void load(int id) throws FileNotFoundException {
        RoomDetail[] roomDetails = parse();

        System.out.println(roomDetails[id].name.toUpperCase());
        for (String facility : roomDetails[id].facility ) {
            System.out.println("\t- " + facility);
        }
    }

    private static RoomDetail[] parse() throws FileNotFoundException {
        Gson gson = new Gson();

        return gson.fromJson(readFile("src/main/resources/detailroom.json"), RoomDetail[].class);
    }

    private static BufferedReader readFile(String fileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(fileName));
    }
}
