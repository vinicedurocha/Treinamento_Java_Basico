package com.mycompany.bibliotecacursos;

/**
 *
 * @author Rocha
 */
import java.util.Scanner;

public class Instrutor {

    //Atributos
    private String nome;
    private String email;

    //Métodos Construtor  
    public Instrutor() {

    }

    //Método construtor com default
    public Instrutor(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }

    Instrutor(String nextLine) {
    }

    //Métodos de acesso
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

    //Médtodo de impressão do objeto/estado atual
    public String imprimir() {
        return nome + " - " + email;
    }
}
