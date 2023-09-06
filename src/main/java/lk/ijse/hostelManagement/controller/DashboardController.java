package lk.ijse.hostelManagement.controller;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hostelManagement.util.Navigation;
import lk.ijse.hostelManagement.util.Routes;

import java.io.IOException;

public class DashboardController {

    public AnchorPane pane;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.LOGIN,pane);
    }

    public void btnRoomsClickOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.ROOMS,pane);
    }

    public void btnStudentClickOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.STUDENT,pane);
    }

    public void btnReservationClickOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.RESERVATION,pane);
    }

    public void btnSettingsClickOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.CHANGE_PASSWORD,pane);
    }
}
