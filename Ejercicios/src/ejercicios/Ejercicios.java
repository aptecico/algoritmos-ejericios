/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author German
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //============declaración de variables=====
        int opc=0;
        Scanner leer=new Scanner(System.in);
        
        //Espacios para las clases de ejercicios
        FizzBuzz p1 = new FizzBuzz();
        
        //====================================
        
        //========mostrar en pantalla========
        while(opc!=100){
          System.out.println("*****Ejericios****");
          System.out.println("1. FizzBuzz");
          System.out.print("Ingrese opcion: ");
          opc=leer.nextInt();
          
          switch(opc){
              case 1:
                 p1.mostrarNumeros();
              break;
              
          }
        }
        
    }
    
}
