package model;

import java.util.Objects;
import java.util.UUID;

public class Product {

    UUID serial;


    String brand;
    Double price;

    public Product() {
        this.serial = UUID.randomUUID();
    }

    public Product(String brand, Double price) {
        this.serial = UUID.randomUUID();
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public UUID getSerial() {
        return serial;
    }

    public void setSerial(UUID serial) {
        this.serial = serial;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return serial.equals(product.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial);
    }

}
