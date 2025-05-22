package customer.util;

import shop.Shop;
import shop.products.Product;
import shop.products.util.*;

public interface Shopper {
    public void enterShop(Shop shop) throws ShoppingException;
    public void shop(Product product);
}