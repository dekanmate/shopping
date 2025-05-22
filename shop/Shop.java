package shop;

import shop.products.util.*;
import shop.products.Product;
import java.util.Map;

public class Shop {
    private Map<Product, Integer> productToCount;

    public Shop(Product... products){
        for (Product p : products){
            if (productToCount.containsKey(p)){
                Integer db = productToCount.get(p) + 1;
                productToCount.replace(p, db);
            } else {
                productToCount.put(p, 1);
            }
        }
    }

    private void stockProduct(Product p){
        if (productToCount.containsKey(p)){
                Integer db = productToCount.get(p) + 1;
                productToCount.replace(p, db);
        } else {
                productToCount.put(p, 1);
        }
    }

    public boolean hasProduct(Product p){
        return productToCount.containsKey(p);
    }

    public void removeProductFromShelf(Product p){
        if (productToCount.containsKey(p)){
            Integer db = productToCount.get(p) - 1;
            if (db > 0) {
                productToCount.replace(p, db);
            } else {
                productToCount.remove(p);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Product, Integer> p : productToCount.entrySet()){
            String sor = String.format("Product %s with price: %d - %d pieces left", p.getKey().getProductType(), p.getKey().getPrice(), p.getValue());
            sb.append(sor + "\n");
        }
        return sb.toString();
    }
}