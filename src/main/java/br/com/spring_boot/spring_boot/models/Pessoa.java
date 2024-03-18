package br.com.spring_boot.spring_boot.models;

public class Pessoa {

    // Atributos
    private String nome;
    private int idade;

    // Criando SET e GET
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
