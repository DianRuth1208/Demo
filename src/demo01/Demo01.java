/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo01;

public class Demo01 {

    public static void main(String[] args) {
        char caracter='n';
        byte dato1= 127;
        short dato2=32000;
        int dato3= 12455;
        long dato4= 6555555555l; //Especificar con l
        float dato5= 3.0f; //Especificar con f
        double dato6= 6.23;
        final int constante= 5;
        
        String cadena= null;
        //System.out.println(cadena);
        
        int numA=5, numB=6;
        double resultado=0.0;
        resultado=(double)numA/numB;
        
        
        System.out.println("El resultado es: " + resultado);
        System.out.format("El resultado con 3 decimales es: %.3f \n ", resultado);
        
        int num1= 22;
        float num2= 2.5F;
        
        num2=num1;
        System.out.println(num2);
        
        char caarac='s';
        num1=caarac;
        System.out.println(num1);
        
        String cadena2="holis";
        
                
        
        
        
        
    }
    
}
