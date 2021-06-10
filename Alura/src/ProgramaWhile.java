/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaWhile {
    public static void main(String args[]){
        int x = 1;
        while(x <= 10 ){
            System.out.println("Tabuada do While do " + x + ":");
            int y = 0;
            while(y <= 10){
                System.out.println(x + " x " + y + " = " + Calculadora.multiplicar(x, y));
                y++;
            }
            x++;
        }
    }
    
}
