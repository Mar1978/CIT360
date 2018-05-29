/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author mikeg
 */
public class mapCollections {
     public static void main(String[] args) {
         
         Map<Integer, String> map = new HashMap<>();
         map.put(1, "red");
         map.put(2, "yellow");
         map.put(3, "blue");
         
         //Iterate over the mapCollections and print
         System.out.println("Key\tValue");
         for (Integer key : map.keySet()) {
             String value = map.get(key);
             System.out.println(key + "\t" +  value);
         }
        
     }
}
