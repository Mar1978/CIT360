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
public class setCollections {
    public static void main(String args[]) { 
     int count[] = {70,50,40,80,60,50};
     Set<Integer> set = new HashSet<>();
     try{
        for(int i = 0; i<5; i++){
           set.add(count[i]);
        }
  
        TreeSet sortedSet = new TreeSet<>(set);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);

        System.out.println("The First element of the set is: "+
                          (Integer)sortedSet.first());
        System.out.println("The last element of the set is: "+
                        (Integer)sortedSet.last());
     }
     catch(Exception e){}
  }
} 

