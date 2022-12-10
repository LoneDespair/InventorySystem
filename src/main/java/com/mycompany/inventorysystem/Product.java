/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Paths;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author LoneDespair
 */
public class Product extends LinkedList.Data{
    // String listFilePath = Paths.get(System.getProperty("user.dir"),"src","productlisttestpkg","productList.txt").toString();
    int id = 0;
    String name = "No product name given";
    int quantity = 0;
    int price = 0;
    ImageIcon icon = new ImageIcon("./Default.png");
    
    private String textIcon = "";
    
    static final String path = Paths.get(System.getProperty("user.dir"), "src", "com.mycompany.inventorysystem", "Default.png").toString();
    
    
    public Product() { 
        loadIcon(path);
    }
    
    public void loadIcon(String path) {
        try {
            System.out.println(path);
            BufferedImage buffImage = ImageIO.read(new File(path));
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            
            ImageIO.write(buffImage, "png", stream);
            
            textIcon = Base64.getEncoder().encodeToString(stream.toByteArray());
            System.out.println(textIcon);
            
        }
        catch (Exception e) {
            System.out.printf("Load icon catch:\n %s\n", e);
        }
        
    }
    
    
    public Product(int newId, String newName, int newQuantity, int newPrice) {
        id = newId;
        name = newName;
        quantity = newQuantity;
        price = newPrice;
        loadIcon("./Default.png");
    }
}
