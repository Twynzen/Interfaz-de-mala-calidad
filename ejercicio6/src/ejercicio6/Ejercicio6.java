/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisF
 */
public class Ejercicio6 {

    
    public static void main(String[] args) {
       float mod1,mod2,num1, num2;
     num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
     num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
     
         mod1 = num1 % 0;
         mod2 = num2 % 0;
        
     if( mod1 == 0 && mod2 == 0 ){
         JOptionPane.showMessageDialog(null,"Los números "+num1+" y "+num2+" son pares");
         
     }else if(mod1 == 0 && mod2 != 0 ){
         JOptionPane.showMessageDialog(null,"El primer número"+num1+" es par y el segundo"+num2+" es impar");
     }else if(mod1 != 0 && mod2 != 0  ){
         JOptionPane.showMessageDialog(null,"Los números "+num1+" y "+num2+" son impares");
     }else{
         JOptionPane.showMessageDialog(null,"El primer número"+num1+" es impar y el segundo"+num2+" es par");
     }
     
     
    }
    
}
