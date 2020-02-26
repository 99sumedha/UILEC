package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("I'm inside the main method!");
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("Inside the start method!");
        Stage stage = primaryStage;

        AnchorPane anchorPane = new AnchorPane();
        Label label = new Label("I'm a label");


        anchorPane.getChildren().add(label);
        stage.setScene(new Scene(anchorPane, 500, 500));

        stage.show();
    }
}
