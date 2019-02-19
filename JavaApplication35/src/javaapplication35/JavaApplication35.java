/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisF
 */
public class JavaApplication35 {

    
    public static void main(String[] args) {
                
        float kilogramos, gramos = 0, tonelada = 0, miligramo = 0;
        int menu;
        kilogramos = Float.parseFloat(JOptionPane.showInputDialog("Diga el numero de Kilogramos que desea transformar: "));
        
        menu = Integer.parseInt(JOptionPane.showInputDialog("Elija el tipo de masa que desea convertir los kilogramos que escribió:\n"
                + "1.Gramos\n"
                + "2.Tonelada\n"
                + "3.Miligramo\n"
                + "4.Salir"));
        
        gramos = kilogramos * 1000;
        tonelada = kilogramos / 1000;
        miligramo = kilogramos * 1000000;
        
        switch(menu){
            case 1: JOptionPane.showMessageDialog(null,"EL valor en gramos es: "+gramos);
            break;
            case 2: JOptionPane.showMessageDialog(null,"EL valor en toneladas es: "+tonelada);
            break;
            case 3: JOptionPane.showMessageDialog(null,"EL valor en miligramos es: "+miligramo);
            break;
            case 4: break;
            
        }
                
        
        
        
        
        
        
        
        
        
    }
    
}
