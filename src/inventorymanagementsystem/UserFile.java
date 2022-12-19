/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem;

/**
 *
 * @author HP
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserFile {
    Users use = new Users();
    String listFilePath = Paths.get(System.getProperty("user.dir"),"src/inventorymanagementsystem","Users.txt").toString();
    String tempFilePath = Paths.get(System.getProperty("user.dir"),"src/inventorymanagementsystem","temp.txt").toString();
    HashMap <Integer, Users> hashTable = new HashMap <Integer, Users>();
    
    public void update(DefaultTableModel listModel, JTable listTable) {
        int i;
        try(FileWriter writer = new FileWriter(tempFilePath)) {
            for(i=0; i<=listModel.getRowCount()-1; i++) {
                use.name = String.valueOf(listModel.getValueAt(i, 0));
                use.pass = String.valueOf(listModel.getValueAt(i, 1)).toCharArray();
                writer.write(String.format("%s %s\n", use.name, String.valueOf(use.pass)));            
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
