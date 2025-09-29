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
        byte edad;
        JOptionPane.showInputDialog("Ingresa la edad",edad);
//                        edad = tecla.nextByte();
        final byte edadMayor =18;
        if (edad >= edadMayor){
            JOptionPane.showMessageDialog(null, "Es mayor de edad");
        }
        else{
             JOptionPane.showMessageDialog(null, "Es menor de edad");
        }
    }
    
}
