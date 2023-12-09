package Database;

import models.Menu;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;

public class Database {
    static models.Menu menu = new models.Menu("Lagman", 250, 15);
    static models.Menu menu2 = new models.Menu("PLov", 200, 15);
   static models.Menu menu3 = new models.Menu("Mastava", 150, 10);
   static models.Menu menu4 = new models.Menu("Chechevica", 120, 5);
   static Menu menuDrins = new Menu("Coffee",30,5);
    static Menu menuDrins2 = new Menu("Tea",10,3);
    static Menu menuDrins3 = new Menu("Frash",35,10);
    static Menu menuDrins4 = new Menu("Koka Kola",45,12);
    static Menu menuSalads = new Menu("Olivie",150,15);
    static  Menu menuSalads2 = new Menu("SpringSalads",200,20);
    static Menu menuSalads3 = new Menu("Shakarap",50,13);
    static Menu menuSalads4= new Menu("Naoeleon Salad",130,12);
    static Menu menuDesserts = new Menu("Tiramisu",300,20);
    static Menu menuDesserts2 = new Menu("Vashington Dessert",250,15);
    static Menu menuDesserts3 = new Menu("London Beach",190,18);
    static Menu menuDesserts4 = new Menu("Vozdushnyi Shar",170,22);

    public static LinkedList<Menu> dishes = new LinkedList<>(Arrays.asList(menu,menu2,menu3,menu4));
    public static LinkedList<Menu> drinks = new LinkedList<>(Arrays.asList(menuDrins,menuDrins2,menuDrins3,menuDrins4));
    public static LinkedList<Menu> salads = new LinkedList<>(Arrays.asList(menuSalads,menuSalads2,menuSalads3,menuSalads4));
    public static LinkedList<Menu> desserts = new LinkedList<>(Arrays.asList(menuDesserts,menuDesserts2,menuDesserts3,menuDesserts4));


}
