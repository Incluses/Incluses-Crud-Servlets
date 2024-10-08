package org.example.crud_site.model;

// Importando a biblioteca UUID para gerar IDs únicos para cada objeto da classe
import java.util.UUID;

// Classe Situacao_Trabalhista
public class Situacao_Trabalhista {
    // Atributos da Classe
    private UUID id;
    private String nome;

    // Método construtor que recebe os parâmetros necessários para criar um objeto da classe
    public Situacao_Trabalhista(String nome) {
        this.nome = nome;
    }

    // Métodos Getters que retornam os valores dos atributos da classe
    public UUID getId() {
        // Retorna o valor do atributo id
        return id;
    }
    public String getNome() {
        // Retorna o valor do atributo nome
        return nome;
    }

    // Métodos Setters que alteram os valores dos atributos da classe
    public void setNome(String nome) {
        // Recebe um valor do tipo String e altera o valor do atributo nome
        this.nome = nome;
    }

    // Método toString que retorna uma representação textual do objeto
    @Override
    public String toString() {
        return "Situacao_Trabalhista{" +
                "\nid" + id +
                ";\nnome: " + nome +
                "\n}";
    }
}
