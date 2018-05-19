/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;
import java.util.*;
/**
 *
 * @author mikeg
 */
public class list {
    
    public static void main (String[] args) {
        String[] stuff ={"shoes", "pen", "wallet", "chips"};
        List<String> list1 =new ArrayList<String>();
        
        
        //add array items to list
        for(String x: stuff)
            list1.add(x);
        
        String[] morestuff = {"pen", "chips"};
        List<String> list2 =new ArrayList<String>();
        
        
        //add array items to list
        for(String x: morestuff)
            list2.add(x);
        
        for(int i =0;i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));
        }
    }
}



