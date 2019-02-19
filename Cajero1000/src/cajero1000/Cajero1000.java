/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero1000;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisF
 */
public class Cajero1000 {

    
    public static void main(String[] args) {
            
        final int sal_inicial = 1000;
        int op1;
        float ingreso, sal_actual = 0, retiro;
        
        op1 = Integer.parseInt(JOptionPane.showInputDialog("Cajero corbatin Bienvenido\n"+". . "
                + "1 Ingrese dinero a la cuenta\n"
                + "2 Retire el dinero de la cuenta\n"
                + "3 Salir"));
        
        switch(op1){
            case 1: ingreso = (int) Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar"));
                    sal_actual = sal_inicial + ingreso;
                    JOptionPane.showMessageDialog(null,"El dinero dentro es de: "+sal_actual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar: "));
            
            if(retiro>sal_inicial){
                JOptionPane.showMessageDialog(null,"No cuenta con el saldo suficiente para este retiro. "+sal_actual);
            }else {
                sal_actual = sal_inicial - retiro;
                JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+sal_actual);
            }
                    break;
                
            case 3: break;
            default : JOptionPane.showMessageDialog(null,"Se equivoco de opción: ");
        }   
        
    }   
    
}
