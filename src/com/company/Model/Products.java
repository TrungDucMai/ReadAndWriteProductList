package com.company.Model;

import java.io.Serializable;

public class Products implements Serializable {
    private String productId;
    private String productName;
    private String band;
    private float price;

    public Products() {
    }

    public Products(String productId, String productName, String band, float price) {
        this.productId = productId;
        this.productName = productName;
        this.band = band;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", band='" + band + '\'' +
                ", price=" + price +
                '}';
    }
}
