/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

/**
 *
 * @author mikeg
 */
public class TipAmount {
    public void calculate(Double num1, Double num2){
	  	Double checkTotal = num1 * num2 * .01;
	  	System.out.println("Your Check with a" + num2 + " % comes to a total of $" + checkTotal);
  }
	
}

