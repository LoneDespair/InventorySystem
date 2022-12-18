/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author LoneDespair
 */
public class Product extends LinkedList.Data{
    int id = 0;
    String name = "No product name given";
    int quantity = 0;
    double price = 0;
    BufferedImage image;

    
    public Product() { }
    
    public Product(int newId, String newName, int newQuantity, double newPrice) {
        id = newId;
        name = newName;
        quantity = newQuantity;
        price = newPrice;
    }
    
    public void loadIcon(String path) {
        System.out.println(path);
        
        try {
            image = ImageIO.read(new File(path));
            
            /*
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            ImageIO.write(image, "png", stream);
            String textIcon = Base64.getEncoder().encodeToString(stream.toByteArray());*/
        }
        catch (Exception e) {
            System.out.printf("Load icon catch:\n %s\n", e);
        }
    }
}
