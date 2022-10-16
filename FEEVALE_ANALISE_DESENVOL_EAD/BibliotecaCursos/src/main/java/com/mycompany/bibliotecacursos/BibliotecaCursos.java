package com.mycompany.bibliotecacursos;

/**
 *
 * @author Rocha
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaCursos {

    private static final Scanner leitor = new Scanner(System.in);
    private static Map<String, Curso> mapCursos;

    public static void main(String[] args) {

        mapCursos = new HashMap<>();
        while (true) {
            if (exibirMenu()) {
                break;
            }
        }
    }

    private static boolean exibirMenu() {
        System.out.println("========= Biblioteca de Cursos ========");
        System.out.println("1- Criar curso ");
        System.out.println("2- Pesquisar curso ");
        System.out.println("3- Remover curso ");
        System.out.println("4- Sair ");
        System.out.print(" Escolha uma opcao: ");
        return aceitaMenu(Integer.parseInt(leitor.nextLine())) == 4;
    }

    private static Integer aceitaMenu(Integer escolha) {
        switch (escolha) {
            case 1:
                criarCurso();
                break;
            case 2:
                pesquisarCurso();
                break;
            case 3:
                removerCurso();
                break;
            case 4:
                sairCurso();

        }
        return escolha;
    }

    private static void criarCurso() {
        Curso curso = new Curso();
        System.out.print(" Escreva o nome do Curso: ");
        curso.setNome_curso(leitor.next());
        leitor.nextLine();
        System.out.print(" Escreva o ano de lancamento do curso: ");
        curso.setAno_lancamento(Integer.parseInt(leitor.next()));
        leitor.nextLine();
        mapCursos.put(curso.getNome_curso(), curso);
        aceitaAula(curso);

    }

    private static void aceitaAula(Curso curso) {
        while (true) {
            System.out.println(" Deseja inserir uma aula?[S/N] ");
            String resposta = leitor.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
            curso.getListaAula().add(coletaDados());

        }
    }

    private static void pesquisarCurso() {
        System.out.print(" Escreva o nome do Curso: ");
        String titulo = leitor.nextLine();
        if (mapCursos.containsKey(titulo)) {
            System.out.println(mapCursos.get(titulo));
        } else {
            System.out.println("Curso não encontrado");
        }

    }

    private static void removerCurso() {
        System.out.print(" Escreva o nome do Curso: ");
        String titulo = leitor.nextLine();
        if (mapCursos.containsKey(titulo)) {
            System.out.println(mapCursos.remove(titulo));
        } else {
            System.out.println("Curso não encontrado");
        }
    }

    private static void sairCurso() {
        System.out.print("##  Saindo do menu ##");
        mapCursos.entrySet().size();
        System.out.println(" Total de Cursos na Biblioteca: " + mapCursos.size());

    }

    private static Aula coletaDados() {
        //Coleta dados da aula
        Aula aula = new Aula();
        System.out.println("Informe o titulo da Aula:");
        aula.setAssunto(leitor.nextLine());
        System.out.println("Informe o total de horas da aula:");
        aula.setTotHoras(Integer.parseInt(leitor.nextLine()));
        System.out.println("Informe a quantidade de aulas:");
        aula.setNumero(leitor.nextInt());
        leitor.nextLine();
        System.out.println("Informe o instrutor:");
        aula.setInstrutor(new Instrutor(leitor.nextLine()));
        return aula;
    }

    public static Scanner getLeitor() {
        return leitor;
    }

}
