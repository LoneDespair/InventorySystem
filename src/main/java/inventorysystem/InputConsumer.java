/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author LoneDespair
 */
public class InputConsumer extends javax.swing.JPanel{
    
    public InputConsumer() {
        addMouseListener(new MouseEar());
    }
    
    class MouseEar implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent arg0) { }

     @Override
     public void mouseEntered(MouseEvent arg0) { }

     @Override
     public void mouseExited(MouseEvent arg0) { }

     @Override
     public void mousePressed(MouseEvent arg0) { }

     @Override
     public void mouseReleased(MouseEvent arg0) { }
        
    }
    
}
