/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.io.*;
import java.util.*;

/**
 *
 * @author mikeg
 */
public class mainCollections {

    public static void main(String[] args) {
         // Creating array, vector and hashtable
        int arr[] = new int[]{1, 2, 3, 4};
        Vector<Integer> vec = new Vector();
        Hashtable<Integer, String> hash = new Hashtable();
        vec.addElement(1);
        vec.addElement(2);
        hash.put(1, "super");
        hash.put(2, "super star");

        System.out.println(arr[0]);
        System.out.println(vec.elementAt(0));
        System.out.println(hash.get(2));
    }
}
