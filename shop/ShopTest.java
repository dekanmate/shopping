package shop;

import shop.products.Product;
import shop.products.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ShopTest {
    @ParameterizedTest
    @CsvSource({
        "BREAD, 50, true",
        "EGGS, 40, false"
    })
    public void testShopHasProduct(String productType, int productPrice, boolean verdict){
        Product p = new Product(ProductType.BREAD, 50);
        Shop shop = new Shop(new Product[]{p});
        assertEquals(shop.hasProduct(p), verdict);
    }

    @Test
    public void testRemoveProductFromShelf(){
        Product p = new Product(ProductType.BREAD, 50);
        Shop shop = new Shop(new Product[]{p});
        shop.removeProductFromShelf(p);
        assertEquals(shop.hasProduct(p), false);
    }
}