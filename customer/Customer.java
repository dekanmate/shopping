package customer;

import customer.util.Shopper;
import java.util.List;
import shop.products.Product;
import shop.Shop;
import shop.products.util.*;

public class Customer implements Shopper{
    private String name;
    private List<Product> shoppingCart;
    private Shop shop;

    public Customer(String name){
        this.name = name;
        // shoppingCart = new List<>();
    }

    public String getName(){
        return name;
    }

    public int totalCost(){
        int sum = 0;
        for (Product p : shoppingCart){
            sum += p.getPrice();
        }
        return sum;
    }

    
    @Override public void enterShop(Shop shop) throws ShoppingException{
        if (shop == null){
            throw new ShoppingException();
        }
        this.shop = shop;
    }

    @Override public void shop(Product p){
        try {
            if (!shop.hasProduct(p)){
                throw new ShoppingException();
            }
        } catch (Exception e) {
            System.err.println("Nincs ilyen termék a boltban.");
        }
        shoppingCart.add(p);
        shop.removeProductFromShelf(p);
    }
}