/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class ClienteTO {
    
    private int codigo;
    private String nome;
    
    public ClienteTO(){
        this.setCodigo(1);
        this.setNome("Fulano");
    }
    
    public ClienteTO(int codigo){
        this.codigo = codigo;
        this.setNome("Fulano");
    }
    
    public ClienteTO(String nome){
        this.setCodigo(1);
        this.nome = nome;
    }
    
    public ClienteTO(int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
        //this.codigo = codigo;
        //this.nome = nome;
    }
    
    public static ClienteTO criaClienteTO(int codigo, String nome){
        return new ClienteTO(codigo, nome);
    }
    
    public static ClienteTO[] criaArrayClienteTO(int numero){
        ClienteTO[] arrClienteTO = new ClienteTO[numero];
        for(int x = 0; x < arrClienteTO.length; x++){
            arrClienteTO[x] = new ClienteTO();
        }
        return arrClienteTO;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean validaClienteTO(ClienteTO objClienteTO){
        if(objClienteTO.getCodigo() > 10000){
            return false;
        }
        
        return objClienteTO.getNome().length() > 2;
    }
    
}
