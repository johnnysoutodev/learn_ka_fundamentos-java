package kasolution.excecoes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class DadosInvalidosException extends Exception{
    
    public DadosInvalidosException(){
        super();
    }
    
    public DadosInvalidosException(String msg){
        super(msg);
    }
    
}
