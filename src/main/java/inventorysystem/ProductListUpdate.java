package inventorysystem;

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

/**
 *
 * @author BWISITA
 */
public class ProductListUpdate {
    String listFilePath = Paths.get(System.getProperty("user.dir"),"src/main/java/inventorysystem","productList.txt").toString();
    String tempFilePath = Paths.get(System.getProperty("user.dir"),"src/main/java/inventorysystem","temp.txt").toString();
    HashMap <Integer, Product> hashTable = new HashMap <Integer, Product>();
    
    public void update(DefaultTableModel listModel, JTable listTable) {
        int i;
        try(FileWriter writer = new FileWriter(tempFilePath)) {
            for(i=0; i<=listModel.getRowCount()-1; i++) {
                Product product = new Product();
                product.id = Integer.parseInt(String.valueOf(listModel.getValueAt(i, 0)));
                product.name = String.valueOf(listModel.getValueAt(i, 1));
                product.quantity = Integer.parseInt(String.valueOf(listModel.getValueAt(i, 2)));
                product.price = Double.parseDouble(String.valueOf(listModel.getValueAt(i, 3)));
                writer.write(String.format("%04d %20s %15d %20.2f\n", product.id, product.name, product.quantity, product.price));            
                
                
                
            }
            writer.close();
            File listFile = new File(listFilePath);
            File tempFile = new File(tempFilePath);
            listFile.delete();
            tempFile.renameTo(listFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
          
    }
}
