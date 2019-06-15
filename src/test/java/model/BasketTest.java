package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void addProduct() {

        Basket basket = new Basket();

        basket.addProduct(new Product());

        assertEquals(1, basket.getProducts().size());
    }


    @Test
    public void removeProduct() {

        Basket basket = new Basket();

        Product product = new Product();
        Product product2 = new Product();

        basket.addProduct(product);
        basket.addProduct(product2);

        basket.removeProduct(product);

        assertEquals(1, basket.getProducts().size());

        assertEquals(product2, basket.getProducts().stream().findFirst().get());
    }
}