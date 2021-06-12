
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
public class ProgramaAula6 {
    
    public static void main(String args[]) throws DadosInvalidosException{
        ClienteTO objClienteTO = ClienteTO.criaClienteTO(10, "Ka-Solution");
        System.out.println(objClienteTO.getCodigo() + " " + objClienteTO.getNome());
        
        ClienteTO[] objArrayClienteTO = ClienteTO.criaArrayClienteTO(10);
        
        for(int x = 0; x < objArrayClienteTO.length; x++){
            System.out.println(objArrayClienteTO[x].getCodigo() + " " + objArrayClienteTO[x].getNome());
        }
        
        System.out.println(ClienteTO.validaClienteTO(new ClienteTO(2000000, "Kasolution")));
        System.out.println(ClienteTO.validaClienteTO(new ClienteTO(200000, "Ka")));
        System.out.println(ClienteTO.validaClienteTO(new ClienteTO(10000, "Kasolution")));
        
        ClienteTO objClienteTO2 = new ClienteTO(200000, "Kasolution");
        objClienteTO2.validaClienteTO(objClienteTO2);
        System.out.println(objClienteTO2.getNome());
    }
    
}
