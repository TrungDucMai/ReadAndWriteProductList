package com.company.View;

import com.company.Controller.ProductManager;
import com.company.Model.Products;
import com.company.Storage.fileManager;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Products> productsList = null;
        try {
            productsList = fileManager.readFile();
        }  catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ProductManager trung = new ProductManager(productsList,"Trung");
        Products p = newProducts();
        try {
            trung.addProduct(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Products s: trung.getProductManagers()){
            System.out.println(s);
        }
    }
    public static Products newProducts(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id");
        String id = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter product name");
        String name = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter band");
        String band = scanner.nextLine();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter price");
        float price = scanner.nextFloat();
        Products product = new Products(id, name, band, price );
        return product;




    }
}
