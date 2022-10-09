/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horasistema;

import java.util.Date;

/**
 *
 * @author Rocha
 */
public class HoraSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criado objeto a partir da biblioteca importada
        Date relogio = new Date();
        //Impressão do objeto a partir do método.
        System.out.println("A data e hora do sistema é: " + relogio.toString());
    }

}
