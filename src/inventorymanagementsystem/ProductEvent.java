/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package inventorymanagementsystem;

/**
 *
 * @author LoneDespair
 */
public interface ProductEvent {
    enum Type {
        DELETE,
        MODIFY,
    }
    
    void onEvent(Type type);
}
