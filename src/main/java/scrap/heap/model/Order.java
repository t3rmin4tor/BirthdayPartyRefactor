package scrap.heap.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Order {

    private static class OrderItem {

        private final Product product;
        private final int unitCount;

        public OrderItem(Product product, int unitCount) {
            this.product = product;
            this.unitCount = unitCount;
        }

        @Override
        public String toString() {
            return "[" + this.product + ", Units:" + unitCount + "]";
        }

    }
    List<OrderItem> orderItems = new ArrayList<>();

    /*
      Add product and quantity into the order
     */
    public Order add(Product product, int units) {
        orderItems.add(new OrderItem(product, units));
        return this;
    }

    public String toString() {
        String orderItemsString = String.join("\n", orderItems.stream().map(OrderItem::toString).collect(Collectors.toList()));
        return "Order:\n" + orderItemsString;
    }
}
