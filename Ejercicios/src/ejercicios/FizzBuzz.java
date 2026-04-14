/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author German
 */
public class FizzBuzz {
   
    public void mostrarNumeros(){
        //ejericios de fizzBuzz
        for(int i=1;i<=100;i++){
            //System.out.println("Numero: "+i);
            if(i%3 ==0 && i%5==0){
                System.out.println("Numero: "+i+" FizzBuzz");
            }else           
                if(i%3 ==0 ){
                    System.out.println("Numero: "+i+" Fizz");
                }else           
                    if(i%5 ==0 ){
                        System.out.println("Numero: "+i+" Buzz");
                    } else
                           System.out.println("Numero: "+i);
            
        }
    }
}
