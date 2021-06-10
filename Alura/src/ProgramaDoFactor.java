/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaDoFactor {
    public static void main (String args[]){
        int x = 1;
        do {
            int y = 0;
            System.out.println("Tabuada do 'Do' " + x + ":");
            while(y <= 10) {
                System.out.println(x + " x " + y + " = " + Calculadora.multiplicar(x, y));
                y++;
                }
            x++;
            } while( x <= 10);
        
    }
}
