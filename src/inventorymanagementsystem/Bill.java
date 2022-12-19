/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem;

import java.util.HashMap;

/**
 *
 * @author LoneDespair
 */
public class Bill {
    static final double VAT_RATE = 0.12;
    static final double SHIPPING_RATE = 0.06;
    
    public double groceryTotal = 0;
    public double cash = 0;
    
    HashMap <Integer, CartGrocery> table = new HashMap<>();
    
    
    public void update() {
        groceryTotal = 0;
        
        for (CartGrocery cartGrocery : table.values()) {
            groceryTotal += cartGrocery.grocery.getTotal();
        }
    }
    
    public double getVat() { return groceryTotal * VAT_RATE; }
    public double getVatable() { return groceryTotal - getVat(); }
    
    public double getTotal() { return groceryTotal + getShippingFee(); }
    public double getShippingFee() { return groceryTotal * SHIPPING_RATE; }
}
