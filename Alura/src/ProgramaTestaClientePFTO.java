


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

public class ProgramaTestaClientePFTO {
    
    public static void main(String args[]){
        
        ClientePFTO obj = new ClientePFTO(1,"Johnny","99999999999");
        ClientePFTO obj2 = new ClientePFTO(1,"Johnny","99999999999");
        ClienteTO obj3 = new ClienteTO();
        System.out.println("ID" + "| " + "Nome   " + " | " + "CPF ");
        System.out.println(obj.getCodigo() + " | " + obj.getNome() + " | " + obj.getCPF());
        System.out.println("-------------------------- ");
//        System.out.println(obj.toString());
        ClientePFTO objFilho = (ClientePFTO) obj2;
        System.out.println(obj2 instanceof ClienteTO);
        System.out.println(obj2 instanceof ClientePFTO);
        System.out.println(objFilho.toString());
        ArrayList<ClienteTO> array = new ArrayList();
        array.add(obj);
        array.add(obj2);
        array.add(obj3);
        
    }
    
}
