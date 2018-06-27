/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;


import java.util.HashMap;
/**
 *
 * @author mikeg
 */
public class AppController {
    public static HashMap<String, doMath> hashMapOfOptions = new HashMap<String, doMath>();

	public void AppController(){

	}

	public static void optionsHandler(String option, Double num1, Double num2){
			hashMapOfOptions.put("one", (doMath) new TipAmount());
			hashMapOfOptions.put("two", new splitTheCheck());

			doMath handler = hashMapOfOptions.get(option);

			handler.calculate(num1, num2);
	}






}