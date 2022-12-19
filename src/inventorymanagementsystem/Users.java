/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorymanagementsystem;

/**
 *
 * @author HP
 */
public class Users {
    String name = "No user name given";
    char[] pass = new char[12];

    public Users() {}
    
    public Users(String newName, char[] newPass, int newPhone) {
        name = newName;
        pass = newPass;
    }
}
