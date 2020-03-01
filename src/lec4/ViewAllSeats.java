package lec4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ViewAllSeats {
    int[] seats ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42};
    @FXML
    private VBox allSeats;
    @FXML
    private VBox addCustomer;
    public void bookSeat(){

        Button s1 = new Button("S1");
        s1.setStyle("-fx-fill: green; -fx-text-fill: white");
        Button s2 = new Button("S2");
        s2.setStyle("-fx-fill: green; -fx-text-fill: white");
        Button s3 = new Button("S3");
        s3.setStyle("-fx-fill: green; -fx-text-fill: white");
        Button s4 = new Button("S4");
        s4.setStyle("-fx-fill: green; -fx-text-fill: white");

    }



}
