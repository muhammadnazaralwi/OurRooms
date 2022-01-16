package menu;

import feature.Loader;
import utils.Parser;

// MenuLoader mengimplementasikan interface Loader
// dengan mengisi Menu sebagai generics T
public class MenuLoader implements Loader<Menu> {
    public Menu[] load() throws Exception {
        // Membuat object parser
        Parser parser = new Parser();

        // Mengurai JSON dengan method parse melalui object parser
        // Nilai yang dikembalikan berupa array dari Menu
        return parser.parse(Menu[].class, "src/main/resources/menu.json");
    }
}
