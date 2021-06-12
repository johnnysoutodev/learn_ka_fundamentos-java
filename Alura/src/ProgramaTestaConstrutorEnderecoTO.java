
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
public class ProgramaTestaConstrutorEnderecoTO {
    
    public static void main (String args[]){
        EnderecoTO objEnderecoTO = new EnderecoTO();
        EnderecoTO objEnderecoTO2 = new EnderecoTO();
        objEnderecoTO.listEndereco();
        System.out.println(objEnderecoTO == objEnderecoTO2);
        System.out.println(objEnderecoTO.equals(objEnderecoTO2));
        System.out.println();
    }
    
}
