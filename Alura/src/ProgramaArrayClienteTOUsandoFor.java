/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaArrayClienteTOUsandoFor {
    
    public static void main (String args[]){
    
        ClienteTO[] arrClienteTO = new ClienteTO[10000];
        
        for (int x = 0; x < arrClienteTO.length; x++) {
            arrClienteTO[x] = new ClienteTO();
            arrClienteTO[x].setCodigo(x+1);
            arrClienteTO[x].setNome("Cliente " + (x + 1));
        }
        
        for (ClienteTO objClienteTO : arrClienteTO){
            System.out.println(objClienteTO.getCodigo() + " " + objClienteTO.getNome());
            if(objClienteTO.getCodigo() == 500){
                break;
            }
        }
    
    }
    
}
