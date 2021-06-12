
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
public class ProgramaArrayClienteTO {
    
    public static void main (String args[]) throws DadosInvalidosException{
    
        ClienteTO[] arrClienteTO = new ClienteTO[2];
        arrClienteTO[0] = new ClienteTO();
        arrClienteTO[1] = new ClienteTO();

        arrClienteTO[0].setCodigo(1);
        arrClienteTO[1].setCodigo(2);

        arrClienteTO[0].setNome("Johnny");
        arrClienteTO[1].setNome("Joao");

        System.out.println(arrClienteTO[0].getCodigo() + " " + arrClienteTO[0].getNome());
        System.out.println(arrClienteTO[1].getCodigo() + " " + arrClienteTO[1].getNome());
    
    }
    
}
