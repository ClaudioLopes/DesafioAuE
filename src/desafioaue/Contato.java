package desafioaue;

import java.sql.Date;


public class Contato {
    private int codigo;
    private String nome;
    private String sexo;
    private String cidade;
    private int dia;
    private int mes;
    private int ano;

    public Contato() {
        
    }

    public Contato(int codigo, String nome, String sexo, String cidade, int dia, int mes, int ano) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.cidade = cidade;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
