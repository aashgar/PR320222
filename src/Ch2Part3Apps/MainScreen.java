/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch2Part3Apps;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class MainScreen extends Stage{

    public MainScreen() {
         FXMLLoader fXMLLoader = new FXMLLoader(
                getClass().getResource("MainScreen.fxml") );
        Scene scene;
        try {
            scene = new Scene(fXMLLoader.load());
             this.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
