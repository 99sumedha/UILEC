package lec4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Scanner;


public class Main extends Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu:
        while (true) {
            System.out.println("A to add customer");
            System.out.println("V to view all seats");
            System.out.println("E to view empty seats");
            System.out.println("D to delete a booked seats");
            System.out.println("F to find a seat by customer name");
            System.out.println("Q to quit");

            String option = sc.next();
            switch (option) {
                case "A":
                case "a":
                    Controller.addCustomer();
                    break;
                case "V":
                case "v":
                    Controller.viewSeats();
                    break;
                case "E":
                case "e":
                    Controller.viewEmptySeats();
                    break;
                case "D":
                case "d":
                    Controller.deleteBookedSeat();
                    break;
                case "F":
                case "f":
                    Controller.findSeatByCustomerName();
                    break;
                case "Q":
                case "q":
                    break Menu;
                default:
                    System.out.println("Invalid input");
            }
        }
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
