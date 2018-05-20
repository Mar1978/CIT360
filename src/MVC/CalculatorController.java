/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mikeg
 */
public class CalculatorController {     

    private CalculatorView calcView;
    private CalculatorModel calcModel;     

    public CalculatorController(CalculatorView calcView, CalculatorModel calcModel) {
        this.calcView = calcView;
        this.calcModel = calcModel;
     
        // Tell the View that when ever the calculate pushed
        // to execute the actionPerformed method                

        this.calcView.addCalculateListener(new CalculateListener());

    }   

    class CalculateListener implements ActionListener{ 

        @Override
        public void actionPerformed(ActionEvent e) {            

            int firstNumber, secondNumber = 0;             

            // Surround interactions with 
            // a try block in case numbers weren't
            // properly entered             

            try{             

                firstNumber = calcView.getFirstNumber();
                secondNumber = calcView.getSecondNumber();               

                calcModel.addTwoNumbers(firstNumber, secondNumber);                 

                calcView.setCalcSolution(calcModel.getCalculationValue());             

            } 

            catch(NumberFormatException ex){                

                System.out.println(ex);                 

                calcView.displayErrorMessage("You Need to Enter 2 Integers");                 

            }             

        }         

    }     

}

    
