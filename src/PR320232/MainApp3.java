/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PR320232;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class MainApp3 extends Application{
    private ListView<String> listViewScr, listViewDes;
    private TextField textFieldItem;
    private CheckBox checkBoxMultSel;
    private RadioButton radioButtonGold, radioButtonCyan;
    private Button buttonAdd, buttonDel, buttonUpdate, 
            buttonCopy, buttonClear;

    @Override
    public void start(Stage stage) throws Exception {
        String[] items = {"Ahmad", "Noor"};
        listViewScr= new ListView<>(FXCollections
                .observableArrayList(items));
        listViewDes = new ListView<>();
        listViewScr.setPrefSize(150, 100);
        listViewDes.setPrefSize(150, 100);
        HBox hBoxListViews = new HBox(15,listViewScr, listViewDes);
        textFieldItem = new TextField();
        checkBoxMultSel = new CheckBox("Muttiple Sel");
        radioButtonGold = new RadioButton("Gold");
        radioButtonCyan = new RadioButton("Cyan");
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButtonGold.setToggleGroup(toggleGroup);
        radioButtonCyan.setToggleGroup(toggleGroup);
        HBox hBoxRadios = new HBox(20, radioButtonGold, radioButtonCyan);
        hBoxRadios.setAlignment(Pos.CENTER);
        buttonAdd = new Button("Add");
        buttonDel = new Button("Del");
        buttonUpdate = new Button("Update");
        buttonCopy = new Button("Copy");
        buttonClear = new Button("Clear");
        HBox hBoxButtons = new HBox(10, buttonAdd, buttonDel, buttonUpdate,
                        buttonCopy, buttonClear);
        hBoxButtons.setAlignment(Pos.CENTER);
        VBox vBoxAll = new VBox(10, hBoxListViews, textFieldItem,
                checkBoxMultSel, hBoxRadios, hBoxButtons);
        vBoxAll.setPadding(new Insets(20));
        FlowPane flowPane = new FlowPane(vBoxAll);
        hBoxListViews.setAlignment(Pos.CENTER);
        vBoxAll.setAlignment(Pos.CENTER);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 600, 400);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().
                getResource("styles1.css").toExternalForm());
        stage.setTitle("More Advanced Controls");
        stage.show();
        radioButtonGold.setOnAction(e->{
            vBoxAll.setStyle("-fx-background-color: Gold");
        });
        radioButtonCyan.setOnAction(event -> {
            vBoxAll.setStyle("-fx-background-color: Cyan");
        });
        listViewScr.getSelectionModel().selectedItemProperty().
                addListener(e-> {
                    textFieldItem.setText(listViewScr.
                            getSelectionModel().getSelectedItem());
                });
    }
    public static void main(String[] args) {
        launch(args);
    }
}
