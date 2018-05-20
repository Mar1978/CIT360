/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import java.awt.event.ActionEvent;

/**
 *
 * @author mikeg
 */
public class calculatorController{
   
    private calculatorView calcView;
    private calculatorModel calcModel;
    
    public calculatorController(calculatorView calcView, calculatorModel calcModel){
        
        this.calcView = calcView;
        this.calcModel = calcModel;
        
        this.calcView.addCalculationListener(new, CalculateListener());
        
    }
    
    class CalculateListener implemnets ActionListener{
    
        public void actionPerformed(ActionEvent arg0){
            
            int firstNumber, secondNumber = 0;
            
            try{
                
                firstNumber = calcView.getFirstNumber();
                secondNumber = calcView.getSecondNumber();
                
                calcModel.addTwoNumbers(firstNumber, secondNumber);
                
                calcView.setCalcSolution(calcModel.getCalculationValue());
                
            }
            
            catch(NumberFormatException ex){
                
                calcView.displayErrorMessage("Please enter two Integers");
            }
            
        }
    
   
    
    
}
    
    

