/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaTestaFor {
    
    public static void main (String args[]){
        for(int x = 0; x <= 10; x++){
            System.out.println("Tabuada do " + x + ":");
            for(int y = 0; y <=10; y++){
                System.out.println(x + " x " + y + " = " + Calculadora.multiplicar(x, y));
            }
        }
    }
    
}
