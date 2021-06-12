
import kasolution.TO.EnderecoTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ProgramaArrayEnderecoTOUsandoFor {
    
    public static void main (String args[]){
    
        EnderecoTO[] arrEnderecoTO = new EnderecoTO[20];
        
        for (int x = 0; x < arrEnderecoTO.length; x++) {
            arrEnderecoTO[x] = new EnderecoTO();
            arrEnderecoTO[x].setLogradouro("Rua de numero: ");
            arrEnderecoTO[x].setNumero("numero " + (x+1));
            arrEnderecoTO[x].setComplemento("complento " + (x+1));
            arrEnderecoTO[x].setBairro("do bairro " + (x+1));
            arrEnderecoTO[x].setCidade("da cidade " + (x+1));
            arrEnderecoTO[x].setCep("00000-000");
            arrEnderecoTO[x].setEstado("XX");
            arrEnderecoTO[x].setPais("Brasil");
        }
        
        for (EnderecoTO objEnderecoTO : arrEnderecoTO){
            System.out.println("-------------------------------------");
            System.out.println(objEnderecoTO.getLogradouro() + " " + objEnderecoTO.getNumero() + " " + objEnderecoTO.getComplemento() );
            System.out.println(objEnderecoTO.getBairro() + " " + objEnderecoTO.getCidade());
            System.out.println(objEnderecoTO.getCep());
            System.out.println(objEnderecoTO.getEstado() + " " + objEnderecoTO.getPais());
            System.out.println("-------------------------------------");
        }
        
    }
    
}
