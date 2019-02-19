/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.salario.de.empleado;

import javax.swing.JOptionPane;


public class EjercicioSalarioDeEmpleado {

   
    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;
        
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de las horas trabajadas: "));
        
        if(horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;
        }else{
            salarioTotal = (40*16) + ((horasTrabajadas-40)*20);
        }
     JOptionPane.showMessageDialog(null,"El salario total es: "+salarioTotal);
    }
   
    
}
