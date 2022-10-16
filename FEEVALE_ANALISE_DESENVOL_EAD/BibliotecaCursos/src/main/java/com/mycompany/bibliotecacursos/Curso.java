package com.mycompany.bibliotecacursos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

//Atributos
    private String nome_curso;
    private int num_aulas;
    private String publico_alvo;
    private int ano_lancamento;
    private List<Aula> listaAula;

    //Métodos construtor
    public Curso() {
       this.setListaAula(new ArrayList<>());

    }

//Métodos construtor com default
    public Curso(String nome_curso, int num_aulas, String publico_alvo, int ano_lancamento) {
        this.nome_curso = nome_curso;
        this.num_aulas = num_aulas;
        this.publico_alvo = publico_alvo;
        this.ano_lancamento = ano_lancamento;
        this.listaAula = new ArrayList<Aula>();
    }
    

    public List<Aula> getListaAula() {
        return listaAula;
    }

    public void setListaAula(List<Aula> listaAula) {
        this.listaAula = listaAula;
    }

    //Métodos de acesso padrão
    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public int getNum_aulas() {
        return num_aulas;
    }

    public void setNum_aulas(int num_aulas) {
        this.num_aulas = num_aulas;
    }

    public String getPublico_alvo() {
        return publico_alvo;
    }

    public void setPublico_alvo(String publico_alvo) {
        this.publico_alvo = publico_alvo;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    @Override
    public String toString() {
        return "Curso = " + nome_curso
                + "\n, num_aulas=" + num_aulas
                + "\n, publico_alvo=" + publico_alvo
                + "\n, ano_lancamento=" + ano_lancamento
                + "\n, listaAula=" + listaAula + '}';
    }

}
