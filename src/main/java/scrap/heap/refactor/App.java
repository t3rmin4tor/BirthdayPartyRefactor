package scrap.heap.refactor;

import scrap.heap.model.Balloon;
import scrap.heap.model.Cake;
import scrap.heap.model.Color;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        //Place birthday party orders

        order(Color.RED, "mylar", "4", "chocolate", "chocolate", "circle", "large", "brown");
        order(Color.BLUE, "latex", "7", "Vanilla", "chocelate", "square", "med", "brown");
        order(Color.YELLOW, "mylar", "4", "vanilla", "vanilla", "square", "small", "yellow");

    }

    private static void order(Color balloonColor, String material, String number, String flavor, String frostingFlavor, String shape, String size, String cakeColor) {
        Balloon balloon = new Balloon.Builder().color(balloonColor).material(material).number(number).build();
        Cake cake = new Cake(flavor, frostingFlavor, shape, size, cakeColor);

        orderBalloons(balloonColor, material, number);

        orderCake(frostingFlavor, flavor, shape, size, cakeColor);
    }

    private static void orderBalloons(Color balloonColor, String material, String number) {

        //for the purposes of this exercise, pretend this method works and adds balloons to the order
        System.out.println("Balloons ordered; " + balloonColor + ", " + material + ", " + number);

    }

    private static void orderCake(String flavor, String frostingFlavor, String shape, String size, String cakeColor) {

        //for the purposes of this exercise, pretend that this method adds a cake to the order
        System.out.println("cake ordered; " + flavor + ", " + frostingFlavor + ", " + shape + ", " + size + ", " + cakeColor);

    }

}
