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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
        JSONObject Tuna = new JSONObject();

        //Name Value
        Tuna.put("name", name);

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
        Tuna.put("courses", courses);

        System.out.println(Tuna.toJSONString());

        //Create file
        File file = new File("StudentGrades.txt");

        try (PrintWriter writer = new PrintWriter(file)){
            writer.print(Tuna.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }

        System.out.println("File created successfully\n\n Hit Enter to display ");
        input.nextLine();

        try {
            input = new Scanner(file);
            StringBuilder jsonIn = new StringBuilder();
            while (input.hasNextLine()) {
                jsonIn.append(input.nextLine());
            }
            System.out.println(jsonIn.toString());
            
            JSONParser parser = new JSONParser();
            
            JSONObject objTuna = (JSONObject) parser.parse(jsonIn.toString());
            
            System.out.printf("Student name is %s\n", objTuna.get("name").toString());
            
            JSONArray coursesIn = (JSONArray) objTuna.get("courses");
            
            for (int i = 0; 1 < coursesIn.size(); i++) {
                JSONObject courseIn = (JSONObject) coursesIn.get(i);
                long gradeIn = (long) courseIn.get("grade");
                String nameIn = (String) courseIn.get("name");
                
                System.out.printf("Course %s; grade %d\n", nameIn, gradeIn);
                
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (ParseException ex){
            
        }

    }
}
