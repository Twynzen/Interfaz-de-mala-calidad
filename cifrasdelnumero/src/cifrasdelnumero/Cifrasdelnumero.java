/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrasdelnumero;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisF
 */
public class Cifrasdelnumero {

   
    public static void main(String[] args) {
       int num1;
       
       num1 = Integer.parseInt(JOptionPane.showInputDialog("Diga un numero entre 0 y 99,999"));
       if((num1 > 0)&&(num1 <= 9)){
           JOptionPane.showMessageDialog(null,"El numero "+num1+" tiene 1 digito.");
           
       }else if((num1 >= 10)&&(num1 <= 99)){
           JOptionPane.showMessageDialog(null,"El numero "+num1+" tiene 2 digitos.");   
           
       }else if((num1 >= 100)&&(num1 <= 999)){
           JOptionPane.showMessageDialog(null,"El numero "+num1+" tiene 3 digitos.");
           
       }else if((num1 >= 1000)&&(num1 <= 9999)){
           JOptionPane.showMessageDialog(null,"El numero "+num1+" tiene 4 digitos.");
           
       }else if((num1 >= 10000)&&(num1 <= 99999)){
           JOptionPane.showMessageDialog(null,"El numero "+num1+" tiene 5 digitos.");
           
       }else if(num1 < 0){
           JOptionPane.showMessageDialog(null,"El numero "+num1+" es negativo");
       }else if(num1 > 99999){
           JOptionPane.showMessageDialog(null,"El numero "+num1+" Es mayor a 99999");
       }else {
           JOptionPane.showMessageDialog(null,"El numero "+num1+" Es cero");
       }
   }   
}
