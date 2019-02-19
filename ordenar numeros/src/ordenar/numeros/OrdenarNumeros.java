/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar.numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisF
 */
public class OrdenarNumeros {

   
    public static void main(String[] args) {
        int num1, num2, num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Diga un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Diga un segundo numero: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Diga el tercer numero: "));
        
        if((num1 > num2) && (num2 > num3)){
            JOptionPane.showMessageDialog(null,"orden es: "+num1+"-"+num2+"-"+num3+".");
        }else if((num1 > num2)&&(num3 > num2)){
            JOptionPane.showMessageDialog(null,"orden es: "+num1+"-"+num3+"-"+num2+".");
        }else if((num2 > num1)&&(num1 > num3)){
            JOptionPane.showMessageDialog(null,"orden es: "+num2+"-"+num1+"-"+num3+".");
        }else if((num2 > num1)&&(num3 > num1)){
            JOptionPane.showMessageDialog(null,"orden es: "+num2+"-"+num3+"-"+num1+".");
        }else if((num3 > num1)&&(num1 > num2)){
            JOptionPane.showMessageDialog(null,"orden es: "+num3+"-"+num1+"-"+num2+".");
        }else if((num3 > num2)&&(num2 > num1)){
            JOptionPane.showMessageDialog(null,"orden es: "+num3+"-"+num2+"-"+num1+".");
        }else{
            JOptionPane.showMessageDialog(null,"Tiene algun numero repetido");
        }
        
                    
        
    }
    
}
