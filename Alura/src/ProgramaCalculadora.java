/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */

public class ProgramaCalculadora {
    
    public static int soma(int num1, int num2){
        return (num1 + num2);
    }
    
    public static double soma(double num1, double num2){
        return (num1 + num2);
    }
    
    public static int subtrair(int num1, int num2){
        return (num1 - num2);
    }
    
    public static double subtrair(double num1, double num2){
        return (num1 - num2);
    }
    
    public static int dividir(int num1, int num2){
        return (num1 / num2);
    }
    
    public static double dividir(double num1, double num2){
        return (num1 / num2);
    }
    
    public static int multiplicar(int num1, int num2){
        return (num1 * num2);
    }
    
    public static double multiplicar(double num1, double num2){
        return (num1 * num2);
    }
    
    public static void main(String args[]){
        
        if(args[0].equals("int")){
            int valor1 = Integer.parseInt(args[2]);
            int valor2 = Integer.parseInt(args[3]);
            if(args[1].equals("soma")){
                System.out.println(soma(valor1,valor2));
            }
        }
        if(args[0].equals("double")){
            double valor1 = Double.parseDouble(args[2]);
            double valor2 = Double.parseDouble(args[3]);
            if(args[1].equals("soma")){
                System.out.println(soma(valor1,valor2));
            }
        }
        
        System.out.println(Calculadora.soma(3, 7));
        System.out.println(Calculadora.subtrair(3, 7));
        System.out.println(Calculadora.dividir(10, 3));
        System.out.println(Calculadora.multiplicar(4, 2));
        
        
    }
    
}
