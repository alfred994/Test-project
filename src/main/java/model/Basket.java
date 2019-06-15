package model;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Product> products = new ArrayList<>();


    public Basket() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }


}
