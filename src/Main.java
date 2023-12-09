import ServiceImpl.MenuService;
import ServiceImpl.MenuServiceImpl;
import models.Menu;

import java.util.LinkedList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MenuServiceImpl menuService = new MenuServiceImpl();
        System.out.println("Welcome to RESTAURAN!!!");
        while (true) {
            System.out.println("""
                    1.Add new meal.
                    2.Get all meals.
                    3.Remove meal.
                    4.Sort by price.
                    5.Get by name.
                    6.Exit.
                    Enter tour choice:         
                    """);
            String ddd = new Scanner(System.in).nextLine();
            switch (ddd) {
                case "1" -> {
                    System.out.print("Enter type of meal: ");
                    String name = new Scanner(System.in).nextLine();
                    menuService.addNewmeal(name);

                }case "2"->{
                    menuService.getAll();
                }case "3"->{
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter type of meal: ");
                    String type = scanner.nextLine();
                    if (menuService.removeMeal(type)==null){
                        System.out.println("Meal type with this name not found!!!");
                    } else {
                        System.out.println(menuService.removeMeal(type));
                    }
                }case "4"->{
                    System.out.print("Enter type of meal: ");
                    String meal = new Scanner(System.in).nextLine();
                    LinkedList<Menu> dd= menuService.sortByPrice(meal);
                    if (dd == null){
                        System.out.println("Meal type with this name not found!!!");
                    } else {
                        System.out.println(dd);
                    }
                }case "5"->{
                    Menu menu2 = menuService.getByName();
                    if (menu2==null){
                        System.out.println("Meal type with this name not found!!!");
                    }else {
                        System.out.println(menu2);
                    };
                }case "6"->{
                    System.exit(0);
                }
            }
        }
    }
}