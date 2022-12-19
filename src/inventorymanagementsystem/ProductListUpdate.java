package inventorymanagementsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.ByteArrayOutputStream;
import java.util.Base64;
import javax.imageio.ImageIO;

/**
 *
 * @author BWISITA
 */
public class ProductListUpdate {
    String listFilePath = Paths.get(System.getProperty("user.dir"),"src/inventorymanagementsystem/productList.txt").toString();
    String tempFilePath = Paths.get(System.getProperty("user.dir"),"src/inventorymanagementsystem/temp.txt").toString();
    
    public void update() {
        try {
            FileWriter writer = new FileWriter(tempFilePath);
            for (Product product : ProductList.hashTable.values()) {
                String textIcon = "";
                
                if (product.image != null) {
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    ImageIO.write(product.image, "png", stream);
                    textIcon = " " + Base64.getEncoder().encodeToString(stream.toByteArray());
                    System.out.println("Successfully saved an image " + product.name);
                }
                
                writer.write(String.format("%04d %20s %15d %20.2f%s\n", product.id, product.name, product.quantity, product.price, textIcon));
            }
            writer.close();
            File listFile = new File(listFilePath);
            File tempFile = new File(tempFilePath);
            listFile.delete();
            tempFile.renameTo(listFile);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
          
    }
}
