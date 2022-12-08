/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.lang.reflect.Field;
import java.util.Scanner;

/**
 *
 * @author LoneDespair
 */
public class ObjectSerializer {
    
    public static String serialize(Object object) {
        String result = "";
        String context = "";
        
        try {
            Field[] fieldList = object.getClass().getDeclaredFields();

            for (Field field : fieldList) {
                Class type =  field.getType();
                Object data = field.get(object);
                
                context += String.format(" Field: %s\n",  type.getName());

                if (type.isPrimitive()) {
                    result += String.valueOf(data);
                } else if (type == String.class) {
                    result += data;
                }

                result += ",";
            }
        }
        catch (Exception e) {
            System.out.printf("Serialize catch:\n%s\n", context, e);
        }
        
        return result;
    }

    public static void deserialize(String line, Object object) {
        // Used for try catch error
        String context = "";
        
        try {
            Field[] fieldList = object.getClass().getDeclaredFields();
            Scanner scanner = new Scanner(line).useDelimiter(",");
            
            for (Field field : fieldList) {
                Class type = field.getType();
                String serializedData = scanner.next();
                Object data = parseString(type, serializedData);
                context += String.format(" Field: %s %s\n",  type.getName(), serializedData);
                
                field.set(object, data);
            }
        }
        catch (Exception e) {
            System.out.printf("Deserialize catch:\n%s%s\n",  context, e);
        }
    }
    
    public static Object parseString(Class type, String value) {
        if( Integer.class == type) {
            System.out.println("PARSING INT");
        }
        
        if( boolean.class == type) return Boolean.parseBoolean( value );
        if( byte.class == type) return Byte.parseByte( value );
        if( short.class == type) return Short.parseShort( value );
        if( int.class == type) return Integer.parseInt( value );
        if( long.class == type) return Long.parseLong( value );
        if( float.class == type) return Float.parseFloat( value );
        if( double.class == type) return Double.parseDouble( value );
        
        return value;
    }
    
}
