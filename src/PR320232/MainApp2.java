/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR320232;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class MainApp2 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField textFieldUserName = new TextField();
        textFieldUserName.setPromptText("User Name");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        Label labelStatus = new Label("Status");
        VBox vBox1 = new VBox(10, textFieldUserName, passwordField,
        labelStatus);
        Button buttonOk = new Button("OK");
        Button buttonCancel = new Button("cancel");
        buttonOk.setId("button_ok");
        buttonCancel.setId("button_cancel");
        HBox hBox1 = new HBox();
        hBox1.setSpacing(20);
        hBox1.getChildren().addAll(buttonOk, buttonCancel);        
        VBox vBox2 = new VBox(10, vBox1,hBox1);
        vBox1.setAlignment(Pos.CENTER);
        hBox1.setAlignment(Pos.CENTER);
        vBox2.setAlignment(Pos.CENTER);
        vBox2.setStyle("-fx-border-color: red");
        vBox2.setPadding(new Insets(20));
        FlowPane flowPane = new FlowPane(vBox2);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 300, 300);
        scene.getStylesheets().add(getClass().
                getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("My First JavaFX App");
        primaryStage.show();
//        buttonOk.setOnAction(new MyEventHandler());
//        buttonCancel.setOnAction(new MyEventHandler());
          buttonOk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button OK Pressed");
            }
          });
          
          buttonCancel.setOnAction(e ->{
              System.out.println("Button Cancel pressed");
          });
    }
    public static void main(String[] args) {
        launch(args);
    }
    private class MyEventHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            String button_id = ((Control) event.getSource()).getId();
            if(button_id.equals("button_ok")){
                System.out.println("Button OK Pressed");
                
            }
            else if(button_id.equals("button_cancel")){
                System.out.println("Button Cncel Pressed");
            }
        }
        
    }
}
