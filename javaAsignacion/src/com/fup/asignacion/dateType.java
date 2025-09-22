
package com.fup.asignacion;

import javax.swing.JOptionPane;

public class dateType {
    public static void main(String[] args){
        //variable
        boolean a = true;
        String message = "MENSAJE DE ALERTA";
        //Estructura de control if
        if (a == true) {
        //  JoptionPane Imprime por interfaz un mensaje
        JOptionPane.showMessageDialog(null,message);            
        }
        
        /***
         BYTE
         ***/
        
        byte edad = 23;
        message = "Tu edad es: ";
        JOptionPane.showMessageDialog(null, message+edad);
        
        //JOptionPane.showInternalInputDialog(null, message, message, edad, icon, args, message);
        
        /***
         SHORT
         **/
        
        short km = 56;
        JOptionPane.showMessageDialog(null, km);
        
        /***
         INT
         ***/ 
        message = "El numero entero positivo es: ";
        int numero = 144;
        JOptionPane.showMessageDialog(null, message+numero);
        
        /****
         *  FLOAT
         ****/
        float numero1 = 8.8f;
        JOptionPane.showMessageDialog(null, numero1);
        /****
         *  DOUBLE
         ****/
        double numero2 = 8.85443532;
        JOptionPane.showMessageDialog(null, numero2);
        
        
        ////     Tipos de datos de texto
        /****
         *  CHAR
         ***/
        char caracter = '@';
        JOptionPane.showMessageDialog(null, caracter);
        /*****
         *  STRING
         *****/
        String texto = "Siente el dolor, piensa en el dolor, acepta el dolor, conoce el dolor, ¡empuje celestial!\n" +"😞";
        JOptionPane.showMessageDialog(null, texto);
    }
}













