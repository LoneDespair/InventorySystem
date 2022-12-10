/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author LoneDespair
 */
public class ProductFile {
    String path = Paths.get(System.getProperty("user.dir"), "ProductList.txt").toString();
    Hashtable<Integer, Product> table = new Hashtable<>();
    
    public ProductFile() {
        try {
            for (Scanner scan = new Scanner(new File(path)); scan.hasNextLine();) {
                Product product = new Product();
                ObjectSerializer.deserialize(scan.nextLine(), product);
                
                table.put(product.id, product);
            }
        }
        catch (Exception e) {
            System.out.printf("Load productList catch %s\n", e);
        }
    }
    
    public void save() {
        try {
            new File(path).createNewFile();
            FileWriter writer = new FileWriter(path, false);
            
            for (Product product : table.values()) {
                writer.write(ObjectSerializer.serialize(product) + "\n");
            }
            
            writer.close();
        }
        catch (Exception e) {
            System.out.printf("Save productList catch %s\n", e);
        }
    }
    
}
