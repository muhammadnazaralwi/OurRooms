package menu;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MenuLoader {
    public void load() throws FileNotFoundException {
        Menu[] menus = parse();

        for (int i = 0; i < menus.length; i++) {
            System.out.println(menus[i].id + ". " + menus[i].name);
        }
    }

    private static Menu[] parse() throws FileNotFoundException {
        Gson gson = new Gson();

        return gson.fromJson(readFile("src/main/resources/menu.json"), Menu[].class);
    }

    private static BufferedReader readFile(String fileName) throws FileNotFoundException {
        return new BufferedReader(new FileReader(fileName));
    }
}
