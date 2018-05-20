/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author mikeg
 */
public class CalculatorView extends JFrame{
    
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);
    
    CalculatorView(){
      // Sets up the view and adds the components

        JPanel calcPanel = new JPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        
        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
        
        this.add(calcPanel);
    }
    
    public int getFirstNumber(){
        
        return Integer.parseInt(firstNumber.getText());
                
    }
    
    public int getSecondNumber(){
        
        return Integer.parseInt(secondNumber.getText());
                
    }
    
     public int getCalcSolution(){
        
        return Integer.parseInt(firstNumber.getText());
        
}
     
     public void setCalcSolution(int solution){
         
         calcSolution.setText(Integer.toString(solution));
         
     }
     
     void addCalculateListener(ActionListener listenForCalcButton){
         
         calculateButton.addActionListener(listenForCalcButton);
         
     }
     // Popup that contains the error message

     void displayErrorMessage(String errorMessage){
         
         JOptionPane.showMessageDialog(this, errorMessage);
         
     }
}