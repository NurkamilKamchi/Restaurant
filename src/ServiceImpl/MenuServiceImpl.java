package ServiceImpl;

import Database.Database;
import models.Menu;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class MenuServiceImpl implements MenuService {
//    Menu menu = new Menu();

    @Override
    public String addNewmeal(String string) {
        if (string.equalsIgnoreCase("dishes")) {
            Menu menu = new Menu();
            System.out.print("Enter new dish name : ");
            String newMeal = new Scanner(System.in).nextLine();
            menu.setName(newMeal);
            System.out.print("Enter price of dish: ");
            double price = new Scanner(System.in).nextDouble();
            menu.setPrice(price);
            System.out.println("Enter preperation time: ");
            double time = new Scanner(System.in).nextDouble();
            menu.setTime(time);
            Database.dishes.add(menu);
            System.out.println("Succesfully saved meal!!!");
        } else if ((string.equalsIgnoreCase("drinks"))) {
            Menu menu = new Menu();
            System.out.print("Enter new drinks name : ");
            String newDrink = new Scanner(System.in).nextLine();
            menu.setName(newDrink);
            System.out.print("Enter price of drinks: ");
            double priceofDrinks= new Scanner(System.in).nextDouble();
            menu.setPrice(priceofDrinks);
            System.out.println("Enter preperation time of drink: ");
            double timeofDrink = new Scanner(System.in).nextDouble();
            menu.setTime(timeofDrink);
            Database.drinks.add(menu);
            System.out.println("Succesfully saved meal!!!");
        } else if (string.equalsIgnoreCase("salads")) {
            Menu menu = new Menu();
            System.out.print("Enter new salad name : ");
            String newSalad = new Scanner(System.in).nextLine();
            menu.setName(newSalad);
            System.out.print("Enter price of salad: ");
            double priceSalad = new Scanner(System.in).nextDouble();
            menu.setPrice(priceSalad);
            System.out.println("Enter preperation time of salad: ");
            double timeSalad = new Scanner(System.in).nextDouble();
            menu.setTime(timeSalad);
            Database.salads.add(menu);
            System.out.println("Succesfully saved meal!!!");
        } else if (string.equalsIgnoreCase("dessert")) {
            Menu menu = new Menu();
            System.out.print("Enter new dessert name : ");
            String newDesert = new Scanner(System.in).nextLine();
            menu.setName(newDesert);
            System.out.print("Enter price of dessert: ");
            double priceDessert =  new Scanner(System.in).nextDouble();
            menu.setPrice(priceDessert);
            System.out.println("Enter preperation time of dessert: ");
            double timeDessert = new Scanner(System.in).nextDouble();
            menu.setTime(timeDessert);
            Database.desserts.add(menu);
            System.out.println("Succesfully saved meal!!!");
        }
        return null;
    }

    @Override
    public LinkedList<Menu> getAll() {
        System.out.println("Database.dishes = " + Database.dishes);
        System.out.println("Database.drinks = " + Database.drinks);
        System.out.println("Database.salads = " + Database.salads);
        System.out.println("Database.desserts = " + Database.desserts);
        return null;
    }

    @Override
    public String removeMeal(String name) {
        Scanner scanner = new Scanner(System.in);
        if (name.equalsIgnoreCase("dishes")) {
            System.out.print("Enter dishes name: ");
            String removerDish = new Scanner(System.in).nextLine();
            Database.dishes.removeIf(dish -> removerDish.equalsIgnoreCase(dish.getName()));
            return "Successfully removed!!!";
        } else if (name.equalsIgnoreCase("drinks")) {
            System.out.print("Enter drink name: ");
            String removeDrink = scanner.nextLine();
            Database.drinks.removeIf(drink -> removeDrink.equalsIgnoreCase(drink.getName()));
            return "Successfully removed!!!";
        } else if (name.equalsIgnoreCase("salads")) {
            System.out.print("Enter salads name: ");
            String saladName = new Scanner(System.in).nextLine();
            Database.salads.removeIf(salad -> saladName.equalsIgnoreCase(salad.getName()));
            return "Successfully removed!!!";
        } else if (name.equalsIgnoreCase("desserts")) {
            System.out.print("Enter dessert name: ");
            String dessertName = new Scanner(System.in).nextLine();
            Database.desserts.removeIf(desser -> dessertName.equalsIgnoreCase(desser.getName()));
            return "Successfully removed!!!";
        }
        return null;
    }

    @Override
    public LinkedList<Menu> sortByPrice(String meal) {
        Scanner scanner = new Scanner(System.in);
        if (meal.equalsIgnoreCase("dishes")) {
            Comparator<Menu> comparator = Comparator.comparing(Menu::getPrice);
            System.out.print("Enter asc / desc: ");
            String answer = new Scanner(System.in).nextLine();
            if (answer.equalsIgnoreCase("asc")) {
                Database.dishes.sort(comparator);
                return Database.dishes;
            } else if (answer.equalsIgnoreCase("desc")) {
                Database.dishes.sort(comparator.reversed());
                return Database.dishes;
            }
        } else if (meal.equalsIgnoreCase("drinks")) {
            Comparator<Menu> comparator = Comparator.comparing(Menu::getPrice);
            System.out.print("Enter asc / desc: ");
            String answer = new Scanner(System.in).nextLine();
            if (answer.equalsIgnoreCase("asc")) {
                Database.drinks.sort(comparator);
                return Database.drinks;
            } else if (answer.equalsIgnoreCase("desc")) {
                Database.drinks.sort(comparator.reversed());
                return Database.drinks;
            }
        }else if (meal.equalsIgnoreCase("salads")) {
            Comparator<Menu> comparator = Comparator.comparing(Menu::getPrice);
            System.out.print("Enter asc / desc: ");
            String answer = new Scanner(System.in).nextLine();
            if (answer.equalsIgnoreCase("asc")) {
                Database.salads.sort(comparator);
                return Database.salads;
            } else if (answer.equalsIgnoreCase("desc")) {
                Database.salads.sort(comparator.reversed());
                return Database.salads;
            }
        }else if (meal.equalsIgnoreCase("desserts")) {
            Comparator<Menu> comparator = Comparator.comparing(Menu::getPrice);
            System.out.print("Enter asc / desc: ");
            String answer = new Scanner(System.in).nextLine();
            if (answer.equalsIgnoreCase("asc")) {
                Database.desserts.sort(comparator);
                return Database.desserts;
            } else if (answer.equalsIgnoreCase("desc")) {
                Database.desserts.sort(comparator.reversed());
                return Database.desserts;
            }
        }
        return null;
    }

    @Override
    public Menu getByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter type of meal: ");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("dishes")) {
            System.out.print("Enter name of meal: ");
            String nameofmeal = scanner.nextLine();
            for (Menu dish : Database.dishes) {
                if (nameofmeal.equalsIgnoreCase(dish.getName())) {
                    return dish;
                }
            }
        } else if (name.equalsIgnoreCase("drinks")) {
            System.out.print("Enter name of drink: ");
            String nameofdrink = scanner.nextLine();
            for (Menu drink : Database.drinks) {
                if (nameofdrink.equalsIgnoreCase(drink.getName())){
                    return drink;
                }
            }
        }else if (name.equalsIgnoreCase("salads")) {
            System.out.print("Enter name of salad: ");
            String nameofsalad = scanner.nextLine();
            for (Menu salad : Database.salads) {
                if (nameofsalad.equalsIgnoreCase(salad.getName())){
                    return salad;
                }
            }
        }else if (name.equalsIgnoreCase("desserts")) {
            System.out.print("Enter name of dessert: ");
            String nameofdessert = scanner.nextLine();
            for (Menu dessert : Database.desserts) {
                if (nameofdessert.equalsIgnoreCase(dessert.getName())){
                    return dessert;
                }
            }
        }

        return null;
    }
}
// Comparator<Movie> comparator = Comparator.comparing(Movie::getName);
//        if (answer.equalsIgnoreCase("asc")) {
//            Database.movies.sort(comparator);
//            return Database.movies;
//        } else if (answer.equalsIgnoreCase("desc")) {
//            Database.movies.sort(comparator.reversed());
//            return Database.movies;
//        }
//        return null;


//  public String save() {
//        Library library = new Library();
//        Scanner scanner = new Scanner(System.in);
//        Scanner scannerFornUM = new Scanner(System.in);
//        library.setLibraryid(GeneratorIdmy.LibraryId());
//        System.out.print("Enter name of library: ");
//        String name = scanner.nextLine();
//        library.setName(name);
//        System.out.print("Enter addres of library: ");
//        String addres = scanner.nextLine();
//        library.setAddres(addres);
//        Database.libraries.add(library);
//        return "Successfullly saved library!!!";
//    }
