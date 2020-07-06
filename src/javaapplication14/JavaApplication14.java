/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Admin
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int chico, ze, ano;
       chico =150;
       ze = 110;
       ano = 0;

       while(chico > ze){
       chico = chico +2;
       ano++;
       } 
       System.out.println("ze levou" +ano+"anos para ser maior"
               + "que chico");
   

    }
    
}
