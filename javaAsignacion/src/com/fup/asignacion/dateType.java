
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
        String texto = "Siente el dolor, piensa en el dolor, acepta el dolor, conoce el dolor, ¡empuje celestial!\n" +"😭";
        JOptionPane.showMessageDialog(null, texto);
        
        /**************************************************************************************************/
        //CONVERSION DE DATOS
        /**************************************************************************************************/

        int num;
        long num2;
        byte num3;
        String texto2 =  "2025";
        num =Integer.parseInt(texto2);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+num);
        
        num2 = Long.parseLong(texto2);
        JOptionPane.showMessageDialog(null, "El numero long es: "+num2);
        
        
        //Byte solo permite valores en el rango -128 a 128
        //num3= Byte.parseByte(texto2);
        //JOptionPane.showMessageDialog(null,"El numero byte es: "+num3);
        
        /**************************************************************************************************/
        //ESTRUCTURAS DE CONTROL
        /**************************************************************************************************/
        
        /***
         * IF
         **/
        
        final byte edadMayor =18;
        if (edad >= edadMayor){
            JOptionPane.showConfirmDialog(null, "Es mayor de edad");
        }
        else{
             JOptionPane.showConfirmDialog(null, "Es menor de edad");
        }
    }
}













