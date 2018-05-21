/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author mikeg
 */
public class JSON {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student name: ");
        String name = input.nextLine();

        //Create new JSON Object
        JSONObject tuna = new JSONObject();

        //Name Value
        tuna.put("name", name);

        JSONArray courses = new JSONArray();

        while (true) {

            //get the course name
            System.out.print("Enter Course name: ");
            String course = input.nextLine();

            //check to see fi user hit the enter button
            if (course.length() == 0) {
                break;
            }

            //get course grade
            System.out.print("Enter Grade: ");
            int grade = input.nextInt();

            if (input.hasNextLine()) {
                input.nextLine();
            }

            //Create Array/Object, Store class object
            JSONObject classObject = new JSONObject();
            classObject.put("grade", grade);
            classObject.put("name", course);

            //add to array
            courses.add(classObject);
        }

        //add array to tuna object
        tuna.put("courses", courses);

        System.out.println(tuna.toJSONString());

        //Create file
        File file = new File("StudentGrades.txt");

        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JSON.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
