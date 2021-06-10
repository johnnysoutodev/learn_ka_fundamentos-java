/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaTestaClientePFTO {
    
    public static void main(String args[]){
        
        ClientePFTO obj = new ClientePFTO(1,"Johnny","99999999999");
        System.out.println("ID" + "| " + "Nome   " + " | " + "CPF ");
        System.out.println(obj.getCodigo() + " | " + obj.getNome() + " | " + obj.getCPF());
        System.out.println("-------------------------- ");
//        System.out.println(obj.toString());
    }
    
}
