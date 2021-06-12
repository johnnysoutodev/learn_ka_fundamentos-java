


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
public class TrabalhandoReferenciaObjetoClienteTO {
    
    public static void main (String args[]) throws DadosInvalidosException{
    
        ClienteTO obj1 = new ClienteTO();
        ClienteTO obj2 = new ClienteTO();
        
        obj1.setCodigo(1000);
        obj2.setCodigo(2000);
        
        System.out.println(obj1.getCodigo() + " " + obj2.getCodigo());
        
        obj2 = obj1;    // equivalencia de objeto
        
        System.out.println(obj1.getCodigo() + " " + obj2.getCodigo());
        
        obj2.setCodigo(5000);
        
        System.out.println(obj1.getCodigo() + " " + obj2.getCodigo());
        
        obj1.setCodigo(10000);
        
        System.out.println(obj1.getCodigo() + " " + obj2.getCodigo());
        
    }
    
}
