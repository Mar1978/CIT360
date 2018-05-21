/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 *
 * @author mikeg
 */
public class map {
     public static void main(String[] args) {
         
         Map<Integer, String> map = new HashMap<>();
         map.put(1, "one");
         map.put(2, "two");
         map.put(3, "three");
         
         //Iterate over the map and print
         System.out.println("Key\tValue");
         Iterator iterator = map.keySet().iterator();
         while(iterator.hasNext())
         {
             Integer key = (Integer)iterator.next();
             String value = map.get(key);
             System.out.println(key + "\t" +  value);
             
         }
        
     }
}
