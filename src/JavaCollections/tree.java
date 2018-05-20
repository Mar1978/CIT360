/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;
import java.util.TreeSet;
/**
 *
 * @author mikeg
 */
public class tree {
    
    public static void tree(String[] args){
        
        TreeSet<String> nums = new TreeSet<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("One");
        nums.remove("Two");
        System.out.println(nums);
    }
}
