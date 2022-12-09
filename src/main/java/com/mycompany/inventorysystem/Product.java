/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

/**
 *
 * @author LoneDespair
 */
public class Product extends LinkedList.Data{
    int id = 0;
    String name = "No product name given";
    int quantity = 0;
    int price = 0;
    String description = "No description provided";
    
    
    public Product() {}
    
    public Product(int newId, String newName, int newQuantity, int newPrice, String newDescription) {
        id = newId;
        name = newName;
        quantity = newQuantity;
        price = newPrice;
        description = newDescription;
    }
}
