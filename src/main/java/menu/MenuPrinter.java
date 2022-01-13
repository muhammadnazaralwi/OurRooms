package menu;

import utils.Parser;

public class MenuPrinter {
    public void showMenuList() throws Exception {
        Parser parser = new Parser();
        Menu[] menus = parser.parse(Menu[].class, "src/main/resources/menu.json");

        for (Menu menu : menus) {
            System.out.println(menu.id + ". " + menu.name);
        }
    }
}
