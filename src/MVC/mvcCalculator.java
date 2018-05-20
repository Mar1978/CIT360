/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author mikeg
 */
public class mvcCalculator {
    
    public static void main(String[] args){
    
    CalculatorView calcView = new CalculatorView();
    
    CalculatorModel calcModel = new CalculatorModel();
    
    CalculatorController theController = new CalculatorController(calcView, calcModel);
    
    calcView.setVisible(true);
    
}
}