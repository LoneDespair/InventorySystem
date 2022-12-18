/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem;

import java.text.DecimalFormat;

/**
 *
 * @author LoneDespair
 */
public class Money {
    static final private DecimalFormat formatter = new DecimalFormat("₱#, ##0.00");
    
    
    //static public String numToMoney(double num) { return String.format("₱%.2f", num); }
    static public String format(double num) { return formatter.format(num); }
    
}
