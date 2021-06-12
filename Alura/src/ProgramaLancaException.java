/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaLancaException {
    
    public static void main (String args[]) throws Exception{
        try {
            executa(1);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void executa(int i) throws Exception{
        if (i == 0){
            throw new Exception("Proibido informar o número zero.");
        };
        
    }
    
}
