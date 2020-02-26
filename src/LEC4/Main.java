package LEC4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        AnchorPane anchorPane = new AnchorPane();
//        Label label = new Label("I'm a label");
//        label.setLayoutX(200);
//        label.setLayoutY(300);
//
//        Button button = new Button("Button");
//        button.setStyle("-fx-background-color: blue; -fx-text-fill: white");
//        label.setLayoutX(100);
//        label.setLayoutY(200);



//        anchorPane.getChildren().add(label);
//        anchorPane.getChildren().add(button);
        stage.setScene(new Scene(root));
//        stage.setScene(new Scene(anchorPane, 500, 500));

        stage.show();
    }
}