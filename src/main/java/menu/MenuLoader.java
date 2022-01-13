package menu;

import com.google.gson.Gson;
import feature.Loader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MenuLoader implements Loader<Menu> {
    public Menu[] load() throws FileNotFoundException {
        return parse();
    }

    public void showMenuList() throws FileNotFoundException {
        Menu[] menus = parse();

        for (Menu menu : menus) {
            System.out.println(menu.id + ". " + menu.name);
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
