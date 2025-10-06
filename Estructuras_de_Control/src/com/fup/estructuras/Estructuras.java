package com.fup.estructuras;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1002964060
 */
public class Estructuras {

    public static void main(String[] args) {
       /**************************************************************************************************/
        //ESTRUCTURAS DE CONTROL
        /**************************************************************************************************/
        
        /***
         * IF
         **/
        
        Scanner tecla = new Scanner(System.in );
         //variable;
         /**
        byte edad=0;
        JOptionPane.showInputDialog("Ingresa la edad",edad);
//                        edad = tecla.nextByte();
        final byte edadMayor =18;
        if (edad >= edadMayor){
            JOptionPane.showMessageDialog(null, "Es mayor de edad");
        }
        else{
             JOptionPane.showMessageDialog(null, "Es menor de edad");
        }
        **/
        
        //  EJEMPLO 2
        
       /**int num1,num2,num3;
        String numeros = " ";
        System.out.println("Ingrese el primer numero: ");
        num1 = tecla.nextInt();
        
         System.out.println("Ingrese el segundo numero: ");
        num2 = tecla.nextInt();
        
         System.out.println("Ingrese el tercer numero: ");
        num3 = tecla.nextInt();
        
        System.out.println("===========================");
        System.out.println("Los numeros digitados son: ");
        numeros = Integer.toString(num1)+", "+Integer.toString(num2)+", "+Integer.toString(num3);
        
        System.out.println(numeros);
        System.out.println("===========================");
        
        if(num1 > num2){
            if(num1 > num3){
                System.out.println(num1+" ES EL NUMERO MAYOR");
            }
        }else if (num2 > num3){
                System.out.println(num2+" ES EL NUMERO MAYOR");
        }else{
            //System.out.println("=========================== "+num3);   
                System.out.println(num3+" ES EL NUMERO MAYOR");
        }
        * **/
       
       estructuras2 est2 = new estructuras2();//    Se crea una instancia de la clase
       // la instancia es est2
       
       est2.evaluate_weather();// Aqui llamamos el metodo de la clase estructuras2
       est2.sleep_and_dream();
       
    }
    
}