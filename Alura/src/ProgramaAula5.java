/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaAula5 {
    
    public static void main (String args[]){
        
        String phoneNum = "404-543-2345";
        int idx1 = phoneNum.indexOf('-');
        
        System.out.println("index of first dash: " + idx1);
        
        int idx2 = phoneNum.indexOf('-', idx1+1 );
        System.out.println("second dash: " + idx2);
    
    }
    
}
