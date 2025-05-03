
package model;

import javax.swing.JOptionPane;

public class Empresa {

    private String nome;
    private String endereço;
    private String cidade;
    private String estado;
    private String CEP;
    private String fone;

    public Empresa() {
        this("","","","","","");
    }
    
    public Empresa(String nome, String endereço, String cidade, String estado, String CEP, String fone) {
        this.nome = nome;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void leitor() {
        setNome(JOptionPane.showInputDialog("digite o nome da empresa: "));
        setEndereço(JOptionPane.showInputDialog("digite o endereço: "));
        setCEP(JOptionPane.showInputDialog("digite o CEP: "));
        setCidade(JOptionPane.showInputDialog("digite a cidade: "));
        setEstado(JOptionPane.showInputDialog("digite o Estado: "));
        setFone(JOptionPane.showInputDialog("digite o telefone da empresa: "));
    }

    public String imprimir() {
        return ("nome: " + getNome() + "\n"
                + "endereço: " + getEndereço() + "\n"
                + "CEP: " + getCEP() + "\n"
                + "cidade: " + getCidade() + "\n"
                + "Estado: " + getEstado() + "\n"
                + "telefone: " + getFone());
    }

}
