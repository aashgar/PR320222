/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch4Apps;


import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class JdbcApp extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Map<String, String> mapWindow =
                new TreeMap<>();
        mapWindow.put("TextArea", "TextAreaPane.fxml");
        mapWindow.put("ListView", "ListViewPane.fxml");
        Pane pane = FXMLLoader.load(
                getClass().getResource(mapWindow.get("TextArea")));
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Collectgions and Streams");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
