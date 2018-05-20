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
        List<String> list2 = new ArrayList<String>();
        
        
        //add array items to list
        for(String y: morestuff)
            list2.add(y);
        
        //print out list 1
        for(int i =0;i<list2.size();i++){
            System.out.printf("%s ", list2.get(i));
        }       
        
        
        editlist(list1,list2);
        System.out.println();
            
        //print out list 1    
        for(int i =0;i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));
    }
}
 
    public static void editlist(Collection<String> l1, Collection<String> l2) {
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next()));
                it.remove();


}
}

}