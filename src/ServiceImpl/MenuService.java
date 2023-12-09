package ServiceImpl;

import models.Menu;

import java.util.LinkedList;

public interface MenuService {
    String addNewmeal(String string);
    LinkedList<Menu> getAll();
    String removeMeal (String name);

    LinkedList<Menu>sortByPrice(String meal);
    Menu getByName();
}
