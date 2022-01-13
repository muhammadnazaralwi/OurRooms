package menu;

import feature.Loader;
import utils.Parser;

public class MenuLoader implements Loader<Menu> {
    public Menu[] load() throws Exception {
        Parser parser = new Parser();

        return parser.parse(Menu[].class, "src/main/resources/menu.json");
    }
}
