/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch2Part2Apps2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class MainScreen extends Stage{
    private MenuBar menuBar;
    private Menu menuFile;
    private MenuItem menuItemOpen;
    private TextArea textArea;
    private Slider sliderFontSize;
    public MainScreen() {
        menuBar = new MenuBar();
        menuFile = new Menu("File");
        menuItemOpen = new MenuItem("Open");
        menuFile.getItems().add(menuItemOpen);
        menuBar.getMenus().add(menuFile);       
        
        textArea = new TextArea("Playing with JavaFX Advanced Controls");
        textArea.setMaxHeight(300);
        textArea.setMaxWidth(500);
        sliderFontSize = new Slider(5, 35, 12);
        sliderFontSize.setMajorTickUnit(5);
        sliderFontSize.setMinorTickCount(4);
        sliderFontSize.setShowTickLabels(true);
        sliderFontSize.setShowTickMarks(true);
        sliderFontSize.setSnapToTicks(true);        
        ComboBox<String> comboBoxLinks = new ComboBox<>();
        comboBoxLinks.getItems().addAll("Instructor GitHub",
                "JavaFX Guide");
        comboBoxLinks.getSelectionModel().select(1);
        WebView webView = new WebView();
        
        HBox hBox1 = new HBox(15, comboBoxLinks, webView);
        
        VBox vBox1 = new VBox(15, textArea, sliderFontSize,
                hBox1);        
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(vBox1);
        
        Scene scene = new Scene(borderPane, 1000, 700);
        this.setScene(scene);
        this.setTitle("Advanced JavaFX Screen");
        sliderFontSize.valueProperty().addListener(e->{
            textArea.setStyle("-fx-font-size: " +
                    sliderFontSize.getValue()+"pt");
        });
        comboBoxLinks.setOnAction(e->{
        if(comboBoxLinks.getSelectionModel()
                .getSelectedIndex()== 0)
            webView.getEngine()
                    .load("https://github.com/aashgar");
        
        });
        menuItemOpen.setOnAction(e->{
            FileChooser fileChooser = new FileChooser();
            fileChooser.setInitialDirectory
                        (new File("src/Ch2Part2Apps2"));
            File selectedFile= fileChooser.showOpenDialog(this);
            
            try {
                Scanner s=new Scanner(selectedFile);
                while(s.hasNextLine()){
                    textArea.appendText(s.nextLine()+"\n");                   
                }
                s.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        });
    }
    
}
