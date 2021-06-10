
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
public class ClientePFTO extends ClienteTO{
    
    private String CPF;

    public ClientePFTO(int codigo) {
        super(codigo);
    }   

    public ClientePFTO(int codigo, String nome, String CPF) {
        super(codigo, nome);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.CPF);
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
        final ClientePFTO other = (ClientePFTO) obj;
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "ClientePFTO{" + "CPF=" + CPF + '}';
    }
       
}
