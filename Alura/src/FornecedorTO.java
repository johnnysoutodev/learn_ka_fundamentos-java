/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnny
 */
public class FornecedorTO {
    
    private int codigo;
    private String nome;
    private String email;
    private String CNPJ;
    private String razaoSocial;

    public FornecedorTO() {
    }

    public FornecedorTO(int codigo, String nome, String email, String CNPJ, String razaoSocial) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    
    
    
}
