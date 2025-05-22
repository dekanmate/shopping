package customer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import customer.util.Shopper;
import java.util.List;
import shop.products.Product;
import shop.Shop;
import shop.products.util.*;

public class CustomerTest {
    @Test
    public void testCustomerName(){
        Customer c = new Customer("Ferenc");
        assertEquals("Ferenc", c.getName());
    }

    @Test
    public void testInvalidEnterShop(){
        Customer c = new Customer("Ferenc");
        try {
            c.enterShop(null);
        } catch (ShoppingException e) {
            // Ok
        }
    }

    @Test
    public void testShoppingCartCost(){
        Customer c = new Customer("Ferenc");
        assertEquals(0, c.totalCost());
    }
}