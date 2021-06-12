/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
import kasolution.excecoes.DadosInvalidosException;
import kasolution.TO.ClienteTO;
import java.util.ArrayList;

public class ProgramaArrayListClienteTO {
    public static void main (String args[]) throws DadosInvalidosException{
        ClienteTO[] arrCli = listaClientes(100);
        for(ClienteTO objCli : arrCli){
            objCli.toString();
            System.out.println(objCli.getNome());
        }
        
    }
    
    public static ClienteTO[] listaClientes(int qtd) throws DadosInvalidosException{
        
        ArrayList<ClienteTO> arr = new ArrayList<ClienteTO>();
        for(int x = 0; x < qtd; x++){
            arr.add(new ClienteTO(x+1,"Cliente " + (x+1)));
        }
        
        ClienteTO[] arrClienteTO = new ClienteTO[qtd];
        return arr.toArray(arrClienteTO);
    }
    
    
    
}
