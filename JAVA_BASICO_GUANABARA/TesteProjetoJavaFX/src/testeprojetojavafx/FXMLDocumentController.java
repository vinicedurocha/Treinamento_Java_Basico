/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package testeprojetojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Rocha
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelMensagem;
    private Button btnBotao;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        labelMensagem.setText("É o Junior, mestre deles!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
