/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionchauffemarcel;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author jazz
 */
public class FXMLChauffeMarcelController implements Initializable {
    
    @FXML
    private Button btnQuit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    /**
     * Quitte l'application proprement 
     * avec un retour 0 pour signaler  : pas d'erreur.
     */
    public void quitApp() {
        System.exit(0);
    }    
    
}
