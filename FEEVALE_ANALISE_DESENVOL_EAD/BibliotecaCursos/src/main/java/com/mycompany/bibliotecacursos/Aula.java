package com.mycompany.bibliotecacursos;

//Classe criada com conceito de herança.
public class Aula extends Curso {

    //Atributos
    private int numero;
    private String assunto;
    private float totHoras;
    private Instrutor instrutor;

    //Método construtor sem default.
    public Aula() {
    }
    //Método construtor com default

    public Aula(int numero, String assunto, float totHoras, Instrutor instrutor) {
        this.numero = numero;
        this.assunto = assunto;
        this.totHoras = totHoras;
        this.instrutor = instrutor;
    }

    //Métodos de acesso.
    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public float getTotHoras() {
        return totHoras;
    }

    public void setTotHoras(float totHoras) {
        this.totHoras = totHoras;
    }

    //Método personalizado
    public void exibir() {
        System.out.println("Assunto: " + assunto);
        System.out.println("Ministrada por: " + instrutor.getNome());
        System.out.println("Total de Horas: " + totHoras);
        System.out.println("Do curso:" + super.getNome_curso());
    }

    //Metodo de sobreposição
    @Override
    public String toString() {
        return "Aula{" + "numero=" + numero + "\n, assunto=" + assunto + "\n, totHoras=" 
                + totHoras + "\n, instrutor=" + instrutor + '}';
    }

}
