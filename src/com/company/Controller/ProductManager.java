package com.company.Controller;

import com.company.Model.Products;
import com.company.Storage.fileManager;

import java.io.IOException;
import java.util.List;

public class ProductManager {
    private List<Products> productManagers;
    private String name;

    public ProductManager(List<Products> productManagers, String name) {
        this.productManagers = productManagers;
        this.name = name;
    }

    public List<Products> getProductManagers() {
        return productManagers;
    }

    public void setProductManagers(List<Products> productManagers) {
        this.productManagers = productManagers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Products product) throws IOException {
        productManagers.add(product);
        fileManager.writeFile(productManagers);
    }

    public void showProduct() {
        for (Products product :
                productManagers) {
            System.out.println(product);
        }
    }

    public void searchById(String search) {
        for (int i = 0; i < productManagers.size(); i++) {
            if (productManagers.get(i).getProductId().equals(search)) {
                System.out.println("Tim thay san pham");
                break;
            } else {
                System.out.println("Khong tim thay sp");
            }
        }
    }
}
