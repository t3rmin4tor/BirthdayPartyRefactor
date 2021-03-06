/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package scrap.heap.refactor;

import org.junit.Test;
import scrap.heap.model.Color;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        String orderDetails = App.order(Color.RED, "mylar", 4, "chocolate", "chocolate", "circle", "large", "brown");
        String expectedDetails = "Order:\n[Balloon[RED, mylar], Units:4]\n[Cake[chocolate, chocolate, circle, large, brown], Units:1]";
        assertEquals(expectedDetails, orderDetails);
    }
}
