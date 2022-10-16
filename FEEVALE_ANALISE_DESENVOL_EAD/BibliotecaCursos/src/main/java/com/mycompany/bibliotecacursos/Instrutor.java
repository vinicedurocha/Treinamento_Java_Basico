package com.mycompany.bibliotecacursos;

import java.util.Scanner;

public class Instrutor {

    //Atributos
    private String nome;
    private String email;

    //Métodos construtor 
    public Instrutor() {

    }

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

    //Método de sobreposição
    @Override
    public String toString() {
        return "Instrutor{" + "nome=" + nome
                + "\n, email=" + email + '}';
    }

}
