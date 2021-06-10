/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
import java.util.ArrayList;

public class ProgramaArrayListClienteTO {
    public static void main (String args[]){
        
        ArrayList<ClienteTO> arr = new ArrayList<ClienteTO>();
        for(int x = 0; x < 100; x++){
            arr.add(new ClienteTO(x+1,"Cliente " + (x+1)));
        }
        System.out.println(arr.get(5).getNome());
    }
    
}
