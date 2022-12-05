/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author LoneDespair
 */
public class ColoredButton extends JButton {
    
    Color normalColor = new Color(0, 0, 0, 0);
    Color hoverColor = new Color(187, 143, 206 );
    Color pressedColor = new Color(187, 143, 206 );
    
    
    /*
    @Override
    public void paint(Graphics graphics) {
        ButtonModel model = getModel();
        
        //if (model.isPressed()) graphics.setColor(pressedColor);
        //else graphics.setColor(normalColor);
        
        //super.paint(graphics);
    }*/
    
    
    public ColoredButton() {
        //System.out.println("Added color");
        //setBackground(pressedColor);
        //setForeground(normalColor);
        //setContentAreaFilled(false);
        
        
        
        /*
        addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (getModel().isPressed()) setBackground(pressedColor);
                else if (getModel().isRollover()) setBackground(normalColor);
                else if (getModel().isRollover() == false) {
                    System.out.println("unhovered");
                    setBackground(normalColor);
                }
            }
        });*/
    }
    
}
