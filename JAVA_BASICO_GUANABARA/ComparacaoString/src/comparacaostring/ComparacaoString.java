/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author Rocha
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criando as váriaveis do tipo String orientado pela classe String
        String nome1 = "Vini";
        String nome2 = "Vini";
        String nome3 = new String("Vini");
        String res;
        //Compararando tipo e conteúdo da variável.
        res = (nome1 == nome3) ? "Igual" : "Diferente";
        System.out.println(res);
        //Comparando apenas o constéudo da variável
        res = (nome1.equals(nome3)) ? "Igual" : "Diferente";
        System.out.println(res);

    }

}
