
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
    }
}
