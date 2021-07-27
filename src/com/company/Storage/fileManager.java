package com.company.Storage;

import com.company.Model.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class fileManager {
    public static void writeFile(List<Products> productsList) throws IOException {
        FileOutputStream fos = new FileOutputStream("productList.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(productsList);
        oos.close();
        fos.close();
    }

    public static List<Products> readFile() throws IOException, ClassNotFoundException {
        List<Products> productsList = new ArrayList<>();
        File file = new File("productList.txt");
        if (file.length()>0){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            ois.close();
            fis.close();
        }
        return productsList;
    }
}
