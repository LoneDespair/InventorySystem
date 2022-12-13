/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem;

import java.awt.Image;
import java.nio.file.Paths;
import javax.swing.ImageIcon;

/**
 *
 * @author LoneDespair
 */
public class FallbackIcon {
    static final String defaultPath = Paths.get(System.getProperty("user.dir"), "src/main/java/inventorysystem/Default.png").toString();
    
    static public ImageIcon getIcon(Image newImage) {
        if (newImage == null) {
            return new ImageIcon(defaultPath);
        }
        
        return new ImageIcon(newImage);
    }
    
    
}
