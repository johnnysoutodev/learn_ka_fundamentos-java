package kasolution.TO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class TestarFornecedorTO {
    public static void main (String args[]){
        
        FornecedorTO objFornec1 = new FornecedorTO();
        FornecedorTO objFornec2 = new FornecedorTO();
        
        objFornec1.printFornecedor();
        objFornec2.printFornecedor();
        
        System.out.println(objFornec1.equals(objFornec2));
        System.out.println(objFornec1.hashCode() == objFornec2.hashCode());
    }
}
