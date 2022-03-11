/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch2Part3Apps;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aashgar
 */
public class LoginScreenController implements Initializable {

    @FXML
    private TextField textFieldLoginName;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label labelError;
    @FXML
    private Button butttonSubmit;
    @FXML
    private Button buttonClear;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void butttonSubmitHandle(ActionEvent event) {
        if(textFieldLoginName.getText().equals("aashgar") &&
                  passwordField.getText().equals("123456"))
        {
              labelError.setText("You are welcome ...");
              new MainScreen().show();
        }
          else
              labelError.setText("Invalid user name or password");
    }

    @FXML
    private void buttonClearHandle(ActionEvent event) {
    }
    
}
