package Week2.pizza;

import java.util.Scanner;


public class pizza {
    public static void main(String[] Args) {
        int pizzaPrijs = 800;
        int topping = 50;
        int aantaltoppings;
        int aantalPizzas;
        float totaalPrijs = 0;
        int pizzaCounterUp = 1;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("hoe veel pizzas wil je?");
        aantalPizzas = keyboard.nextInt();
        totaalPrijs = totaalPrijs + (aantalPizzas * pizzaPrijs);

        while (aantalPizzas > 0) {
            System.out.println("hoe veel toppings wil je op pizza " + pizzaCounterUp + "?");
            aantaltoppings = keyboard.nextInt();
            aantalPizzas--;
            pizzaCounterUp++;
            totaalPrijs = totaalPrijs + (aantaltoppings * topping);
        }
        System.out.println("De totaalprijs is \u20ac" + (totaalPrijs / 100));

    }
}
