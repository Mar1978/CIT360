/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 *
 * @author mikeg
 */
public class JSON {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String name = input.nextLine();
        System.out.print("Enter Course name: ");
        String course1 = input.nextLine();
        System.out.print("Enter Grade: ");
        int grade1 = input.nextInt();
        
        
        //Create new JSON Object
        JSONObject tuna =new JSONObject();
        
        //Name Value
        tuna.put("name", name);
        
        //Create Array/Object, Store class object
        JSONObject classObject1 = new JSONObject();
        classObject1.put("grade", grade1);
        classObject1.put("name", course1);
        
        
        JSONArray courses = new JSONArray();
        courses.add(classObject1);
        
        //add array to tuna object
        tuna.put("courses", courses);
        
        System.out.println(tuna.toJSONString());
        
    }
}
