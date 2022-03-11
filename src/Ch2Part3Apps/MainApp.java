/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch2Part3Apps;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class MainApp extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fXMLLoader = new FXMLLoader(
                getClass().getResource("LoginScreen.fxml") );
        fXMLLoader.setController(new LoginScreenController());
        Scene scene = new Scene(fXMLLoader.load());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
