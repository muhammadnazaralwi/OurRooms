package menu;

import feature.Printer;
import utils.Parser;

public class MenuPrinter implements Printer {
    public void show() throws Exception {
        // Membuat object parser
        Parser parser = new Parser();

        // Mengurai JSON dengan method parse melalui object parser
        // Nilai yang dikembalikan berupa array dari Menu
        // Nilai tersebut akan ditampung oleh variabel menus
        Menu[] menus = parser.parse(Menu[].class, "src/main/resources/menu.json");

        // For each menu untuk mencetak list menu
        for (Menu menu : menus) {
            System.out.println(menu.getId() + ". " + menu.getName());
        }
    }
}
