/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author LoneDespair
 */
public class ProductFile {
    Path path = Paths.get(System.getProperty("user.dir"), "productList.txt");
    Hashtable<Integer, Product> table = new Hashtable<>();
    
    public ProductFile() {
        try {
            for (Scanner scan = new Scanner(path.toFile()); scan.hasNextLine();) {
                Product product = new Product();
                ObjectSerializer.deserialize(scan.nextLine(), product);
                
                table.put(product.id, product);
            }
            
            
        }
        catch (Exception e) {
            System.out.printf("Load productList catch %s\n", e);
        }
    }
    
    public void load() {
        
    }
    
}
