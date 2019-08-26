package model;

import enumerator.Brand;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void productInit(){

        Product product = new Product(Brand.COCA_COLA, 0.0);

        assertEquals(Brand.COCA_COLA, product.getBrand());
    }

}