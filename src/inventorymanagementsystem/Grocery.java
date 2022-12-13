/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem;

/**
 *
 * @author LoneDespair
 */
public class Grocery {
    Product product;
    int count;
    
    
    public Grocery(Product newProduct, int newCount) {
        product = newProduct;
        count = newCount;
    }
    
    
    public double getCost() { return count * product.price; }
    
}
