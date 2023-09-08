package lk.ijse.hostelManagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Use the correct path to load the FXML file
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Login.fxml"))));
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.setY(0);
        primaryStage.setTitle("24D Hostel Management System | Login");
    }
}
