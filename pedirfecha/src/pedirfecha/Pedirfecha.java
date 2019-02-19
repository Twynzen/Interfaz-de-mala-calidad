/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedirfecha;

import javax.swing.JOptionPane;


public class Pedirfecha {

    
    public static void main(String[] args) {
        int dia,mes,ano;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Diga el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Diga el mes"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Diga el año"));
        
        if((mes == 2)){
        
            if((dia >= 1) && (dia <= 28)) {
               if(ano != 0){
                   JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es correcta");
               }else{
            JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es incorrecta en el año asignado");
        } 
            }else{
            JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es incorrecta en el DIA asignado NO ES EN FEBRERO");
        }
    
    }else if((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11)){
        if((dia>=1)&&(dia <= 30)){
             if(ano != 0){
                   JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es correcta");
               }else{
            JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es incorrecta en el año asignado");
        }
        }else{
            JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es incorrecta en el día asignado LOS MESES CON 30 DIAS SON ABRIL, JUNIO, SEPTIEMBRE Y NOVIEMBRE");
        }
    
    }else if((mes <= 12 )){
        if((dia>=1)&&(dia <=31)){
            if(ano != 0){
                   JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es correcta");
               }else{
            JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es incorrecta en el año asignado");
         }
        }else{
            JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es incorrecta en el dia asignado  ESTA ERRADO");
        }
        
        
    }else{ 
            JOptionPane.showMessageDialog(null,"La fecha-"+dia+"-"+mes+"-"+ano+"-es incorrecta en el mes asignado");
    
   
        
        
    }   
}    
}
