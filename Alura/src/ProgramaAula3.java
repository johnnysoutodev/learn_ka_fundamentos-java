
import kasolution.excecoes.DadosInvalidosException;
import kasolution.TO.ClienteTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaAula3 {
    
    public static void main (String args[]) throws DadosInvalidosException{
    
        System.out.println("Aula 3 do dia 02/06/2021");
        
        String[] nomes = {"Silmara", "Joao"};
        ClienteTO objClienteTO = new ClienteTO();
        
        objClienteTO.setCodigo(1);
        objClienteTO.setNome("Silmara");
        
        System.out.println("O cliente de codigo: " + objClienteTO.getCodigo() + " se chama: " + objClienteTO.getNome());
        
        ClienteTO objClienteTO2 = new ClienteTO();
        
        objClienteTO2.setCodigo(2);
        objClienteTO2.setNome("Joao");
        
        System.out.println("O cliente de codigo: " + objClienteTO2.getCodigo() + " se chama: " + objClienteTO2.getNome());
    
    }
    
}
