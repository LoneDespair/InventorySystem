/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package inventorysystem;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import javax.swing.UIManager;

/**
 *
 * @author LoneDespair
 */
public class InventorySystem {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println("Errrorr");
        }
        
        new PrimaryForm().setVisible(true);
    }
    
}
