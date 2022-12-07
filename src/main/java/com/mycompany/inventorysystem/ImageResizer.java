/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author LoneDespair
 */
public class ImageResizer {
    public static ImageIcon fitImageIcon(ImageIcon imageIcon, Dimension targetSize) {
        int width = imageIcon.getIconWidth(), height = imageIcon.getIconHeight();

        double ratio = Math.max((double)targetSize.width / width, (double)targetSize.height / height);
        Image image = imageIcon.getImage().getScaledInstance((int)(width * ratio), (int)(height * ratio), Image.SCALE_DEFAULT);
        imageIcon.setImage(image);
        
        return imageIcon;
    }
}
