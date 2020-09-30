package scrap.heap.refactor;

import scrap.heap.model.*;

public class App {

    public static void main(String[] args) {

        // TODO: add more enums for valid data entry
        //Place birthday party orders
        order(Color.RED, "mylar", 4, "chocolate", "chocolate", "circle", "large", "brown");
        order(Color.BLUE, "latex", 7, "Vanilla", "chocelate", "square", "med", "brown");
        order(Color.YELLOW, "mylar", 4, "vanilla", "vanilla", "square", "small", "yellow");
    }

    public static String order(Color color, String material, int numberOfBalloons, String flavor, String frostingFlovor, String shape, String size, String cakeColor) {
        Balloon balloon = new Balloon.Builder()
                .color(color)
                .material(material)
                .build();
        Cake cake = new Cake.Builder()
                .flavor(flavor)
                .frostingFlovor(frostingFlovor)
                .shape(shape)
                .size(size)
                .color(cakeColor)
                .build();
        Order order = new Order()
                .add(balloon, numberOfBalloons)
                .add(cake, 1);
        System.out.println(order);
        return order.toString();
    }
}
