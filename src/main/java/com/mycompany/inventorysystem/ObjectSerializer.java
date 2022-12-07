/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.lang.reflect.Field;

/**
 *
 * @author LoneDespair
 */
public class ObjectSerializer {
    
    public static String serialize(Object object) {
        String result = "";
        
        Field[] fieldList = object.getClass().getDeclaredFields();
        
        for (Field field : fieldList) {
            Class type = field.getType();
            Object data;
            System.out.println("Field name " + field.getName());
            
            try {
                data = field.get(object);
            }
            catch (Exception e) {
                System.out.println("Error occured while accessing field");
                break;
            }
            
            if (type.isPrimitive()) {
                result += String.valueOf(data);
            } else if (type == String.class) {
                result += data;
            }
            
            result += " ";
        }
        
        System.out.println(result);
        return result;
    }

}
