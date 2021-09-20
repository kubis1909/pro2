package cz.uhk.pro2;

import cz.uhk.pro2.models.PizzaMenu;
import cz.uhk.pro2.models.PizzaMenuItem;

public class Main {

    public static void main(String[] args) {

        PizzaMenu menu = new PizzaMenu();
        menu.addItem(new PizzaMenuItem("Hawai", "ananas", 120));
        System.out.println("last update: " + menu.getItems());

        for (PizzaMenuItem item : menu.getItems()) {
            System.out.println(item.getName());
        }
    }

}
