/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ManipulacaoString {
    
    public static void main (String args[]){
        
//        String str1 = new String("Joao");
        int age = 39;
        String str1 = "Johnny";
        String str2 = "Joao";
        String str3 = "";
        String nome = "Johnny";
        String espaco = " ";
        String sobrenome = "Souto";
        
        System.out.println(str1 == str2);
        System.out.println(str1.equals(age));
        
        System.out.println(str1.valueOf(str1));
        
        System.out.println(str3.isEmpty());
        
        System.out.println(nome.concat(espaco).concat(sobrenome));
        
        StringBuilder objStringBuilder = new StringBuilder("Joao ");
        System.out.println(objStringBuilder);
        System.out.println(objStringBuilder.hashCode());
        objStringBuilder.append("Souto");
        System.out.println(objStringBuilder);
        System.out.println(objStringBuilder.hashCode());
        
        String objString = new String("Joao ");
        System.out.println(objString);
        System.out.println(objString.hashCode());
        objString = objString.concat("Souto");
        System.out.println(objString);
        System.out.println(objString.hashCode());
            
    }
    
    
    
}
