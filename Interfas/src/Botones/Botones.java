/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botones;

/**
 *
 * @author Daniel
 */
public class Botones {
    
    private static Interfaz interfa;
    private static Persona persona[];
    private static int contador;

    
    public static void main(String[] args) {
      interfa = new Interfaz();
      persona = new Persona[100];
      
      for (int i = 0; i < 100; i++){
          persona[i]= new Persona();
      }
      contador = 0;
      
      interfa.setVisible(true);
      
     
      }
       public static void guardar(String n, int t, String f ){
          persona[contador].setNombre(n);
          persona[contador].setTransa(t);
          persona[contador].setFecha(f);
          
          contador++;
          
    }
       public static void buscar(String bus){
           
           for (int j = 0; j < persona.length; j++){
               if(persona[j].getNombre().equals(bus)){
                   interfa.cargardatos(persona[j]);
               }
               
           }
       }
    
}
