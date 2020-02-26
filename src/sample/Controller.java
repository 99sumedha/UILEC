package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;



public class Controller {
    @FXML
    private FlowPane flowPane;

    public void addThirdButton(){
        Button newBtn = new Button("Third Button");
        flowPane.getChildren().add(newBtn);
    }
}
