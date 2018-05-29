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
public class treeCollections {
    public static void main(String [] args) {
        
        TreeSet<String> box = new TreeSet<> ();
        box.add("One");
        box.add("Two");
        box.add("one");
        box.remove("Two");
        
        System.out.println(box);
    }
}
