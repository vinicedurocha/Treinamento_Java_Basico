/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author Rocha
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Criando variáveis inteiras
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        //Criando variável do tipo "sim ou não"
        boolean r;
        //Apropriando valor verdadeiro para a variável R caso x seja MENOR que Y  E TAMBÉM y seja menor que Z, se não recebe falso.        
        r = (x < y && y < z) ? true : false;
        System.out.println(r);
        //Apropriando valor verdadeiro para a variável R caso x seja MENOR que Y  OU  y seja menor que Z, se não recebe falso.        
        r = (x < y || y < z) ? true : false;
        System.out.println(r);
        //Apropriando valor verdadeiro para a variável caso uma das condições seja exclusiva, se ambas forem atendidas recebe falso.        
        r = (x < y ^ y < z) ? true : false;
        System.out.println(r);

    }

}
