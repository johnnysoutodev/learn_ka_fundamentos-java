
import java.util.Objects;

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
        this.setCodigo(1);
        this.setNome("Empresa XPTO");
        this.setEmail("contato@xpto.com");
        this.setCNPJ("54123999000199");
        this.setRazaoSocial("XPTO S/A");
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
    
    public void printFornecedor(){
        System.out.println("Código:         " + this.getCodigo());
        System.out.println("Nome:           " + this.getNome());
        System.out.println("E-mail:         " + this.getEmail());
        System.out.println("CNPJ:           " + this.getCNPJ());
        System.out.println("Razão Social:   " + this.getRazaoSocial());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.CNPJ);
        hash = 79 * hash + Objects.hashCode(this.razaoSocial);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FornecedorTO other = (FornecedorTO) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        if (!Objects.equals(this.razaoSocial, other.razaoSocial)) {
            return false;
        }
        return true;
    }
    
    
    
}
