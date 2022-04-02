package menu;

import feature.Printer;
import utils.Parser;

public class MenuPrinter implements Printer {
    public void show() throws Exception {
        Parser parser = new Parser();

        Menu[] menus = parser.parse(Menu[].class, "src/main/resources/menu.json");

        for (Menu menu : menus) {
            System.out.println(menu.getId() + ". " + menu.getName());
        }
    }
}
