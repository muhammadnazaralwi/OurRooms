package menu;

import feature.Loader;
import utils.Parser;

public class MenuLoader implements Loader<Menu> {
    Parser<Menu> parser = new Parser<>();

    public Menu[] load() throws Exception {
        return parser.parse("src/main/resources/menu.json");
    }

    public void showMenuList() throws Exception {
        Menu[] menus = parser.parse("src/main/resources/menu.json");

        for (Menu menu : menus) {
            System.out.println(menu.id + ". " + menu.name);
        }
    }
}
