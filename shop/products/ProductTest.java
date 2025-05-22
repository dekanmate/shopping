package shop.products;

import shop.products.Product;
import shop.products.util.ProductType;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ProductTest {

    @Test
    public void testProductConstructor(){
        Product p = new Product(ProductType.BREAD, 50);
        assertEquals(ProductType.BREAD, p.getProductType());
        assertEquals(50, p.getPrice());
    }

    @ParameterizedTest
    @CsvSource({
        "BREAD, 50, BREAD, 50, true",
        "BREAD, 40, BREAD, 50, false"
    })
    public void testProductEqualityCheck(String productType1, int productPrice1, String productType2, int productPrice2, boolean verdict){
        Product p1 = new Product(ProductType.valueOf(productType1), productPrice1);
        Product p2 = new Product(ProductType.valueOf(productType2), productPrice2);
        assertEquals(p1.equals(p2), verdict);
    }
}