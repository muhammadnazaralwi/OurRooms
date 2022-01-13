package menu;

import feature.Loader;
import utils.Parser;

public class MenuLoader implements Loader<Menu> {
    Parser parser = new Parser();

    public Menu[] load() throws Exception {
        return parser.parse(Menu[].class, "src/main/resources/menu.json");
    }

    public void showMenuList() throws Exception {
        Menu[] menus = parser.parse(Menu[].class, "src/main/resources/menu.json");

        for (Menu menu : menus) {
            System.out.println(menu.id + ". " + menu.name);
        }
    }
}
