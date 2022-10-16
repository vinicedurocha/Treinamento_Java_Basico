/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author Rocha
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criação de objeto a partir da biblioteca "Locale" sendo importada.
        Locale loc = Locale.getDefault();
        //Impressão do idioma do sistema a partir do metodo da classe importada.
        System.out.println("O idioma do sistema é: " + loc.getDisplayLanguage());
    }

}
