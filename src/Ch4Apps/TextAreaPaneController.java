/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4Apps;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author aashgar
 */
public class TextAreaPaneController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private Button buttonShow;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void buttonShowHandle(ActionEvent event)
            throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager
          .getConnection("jdbc:mysql://127.0.0.1:3306/company?serverTimezone=UTC",
                        "root", "root");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("Select * From Employee");
        while(rs.next()){
            textArea.appendText(rs.getInt("id") + " - " +
                            rs.getString("name")+ " - " +
                    rs.getString("department")+ " - " +
                    rs.getDouble("salary")+"\n");
        }
    }
}
