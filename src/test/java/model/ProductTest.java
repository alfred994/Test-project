package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void productInit(){

        Product product = new Product("brand", 0.0);

        assertEquals("brand", product.getBrand());
    }

}