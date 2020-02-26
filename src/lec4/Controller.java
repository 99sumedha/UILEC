package lec4;

import javafx.fxml.FXML;
import javafx.scene.layout.FlowPane;



public class Controller {
    @FXML
    private FlowPane flowPane;

    public static void addCustomer() {
        System.out.println("Customer added");
    }

    public static void viewSeats() {
        System.out.println("View all seats");
    }

    public static void viewEmptySeats() {
        System.out.println("View empty seats");
    }

    public static void deleteBookedSeat() {
        System.out.println("Delete booked seats");
    }

    public static void findSeatByCustomerName() {
        System.out.println("Find seat by customer name");
    }

}
