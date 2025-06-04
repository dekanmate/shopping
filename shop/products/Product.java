package shop.products;

import java.util.Objects;
import shop.products.util.ProductType;

public class Product {
    private ProductType productType;
    private int price;

    public Product(ProductType productType, int price){
        this.productType = productType;
        this.price = price;
    }

    public ProductType getProductType(){
        return productType;
    }

    public int getPrice(){
        return price;
    }

    public boolean equals(Object obj){
        if (obj == this) return true;

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Product other = (Product) obj;
        return price == other.price && productType == other.productType;
    }

    public int hashCode(){
        return Objects.hash(productType, price);
    }
}