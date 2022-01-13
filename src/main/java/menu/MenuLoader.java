package menu;

import com.google.gson.Gson;
import feature.Loader;
import utils.FileReader;

import java.io.BufferedReader;

public class MenuLoader implements Loader<Menu> {
    public Menu[] load() throws Exception {
        return parse();
    }

    public void showMenuList() throws Exception {
        Menu[] menus = parse();

        for (Menu menu : menus) {
            System.out.println(menu.id + ". " + menu.name);
        }
    }

    private static Menu[] parse() throws Exception {
        Gson gson = new Gson();
        BufferedReader menuJson = FileReader.readFile("src/main/resources/menu.json");

        return gson.fromJson(menuJson, Menu[].class);
    }
}
