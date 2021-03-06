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
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = primaryStage;

        Parent add = FXMLLoader.load(getClass().getResource("addCustomer.fxml"));//Add Customer to a seat scene
        Parent viewSeat = FXMLLoader.load(getClass().getResource("viewAllSeats.fxml"));


        AnchorPane anchorPane = new AnchorPane();
        Scanner sc = new Scanner(System.in);
        Menu:
        while (true) {
            System.out.println("A to add customer");
            System.out.println("V to view all seats");
            System.out.println("E to view empty seats");
            System.out.println("D to delete a booked seats");
            System.out.println("F to find a seat by customer name");
            System.out.println("Q to quit");

            //Select option
            String option = sc.next();
            switch (option) {
                case "A":
                case "a":
                    stage.setScene(new Scene(add));//Add Customer
                    break;
                case "V":
                case "v":
                    stage.setScene(new Scene(viewSeat));//View All Seats
                    break;
//                case "E":
//                case "e":
//                    stage.setScene(new Scene(add));
//                    break;
//                case "D":
//                case "d":
//                    stage.setScene(new Scene(add));
//                    break;
//                case "F":
//                case "f":
//                    stage.setScene(new Scene(add));
//                    break;
                case "Q":
                case "q":
                    break Menu;
                default:
                    System.out.println("Invalid input");
            }
            break;
        }


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

//        stage.setScene(new Scene(anchorPane, 500, 500));
        stage.show();

    }





}
