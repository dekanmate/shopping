package shop.products;

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
        return false;
        
    }

    public int hashCode(){
        return 0;
    }
}