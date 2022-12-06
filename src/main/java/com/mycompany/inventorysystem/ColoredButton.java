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
    Color hoverColor = new Color(214, 219, 223, 60);
    Color pressedColor = new Color(214, 219, 223, 100);
    
    @Override
    public void paint(Graphics graphics) {
        if (model.isPressed()) graphics.setColor(pressedColor);
        else if (model.isRollover()) graphics.setColor(hoverColor);
        else graphics.setColor(normalColor);
        
        graphics.fillRect(0, 0, getSize().width, getSize().height);
        super.paint(graphics);
    }
    
    
    public ColoredButton() {
        setContentAreaFilled(false);
        
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
