package lk.ijse.hostelManagement.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hostelManagement.bo.BOFactory;
import lk.ijse.hostelManagement.bo.custom.UserBO;
import lk.ijse.hostelManagement.dto.UserDTO;
import lk.ijse.hostelManagement.entity.User;
import lk.ijse.hostelManagement.util.Navigation;
import lk.ijse.hostelManagement.util.Routes;

import java.io.IOException;

public class ChangePasswordController {
    public JFXTextField newUsername;

    @FXML
    private AnchorPane pane;


    @FXML
    private JFXPasswordField newPassword;

    UserBO userBO = (UserBO) BOFactory.getBoFactory().getBO(BOFactory.Type.USER);

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.DASHBOARD, pane);
    }

    @FXML
    void changeClickOnAction(ActionEvent event) throws IOException {
        if(!newUsername.getText().isEmpty() && !newPassword.getText().isEmpty()) {
            String name = newUsername.getText();
            String pas = newPassword.getText();
            User user= userBO.getUser(name);
            if(user != null) {
                UserDTO userDTO = new UserDTO(name, pas);
                boolean isUpdate = userBO.updateUser(userDTO);
                if (isUpdate) {
                    new Alert(Alert.AlertType.CONFIRMATION, "User Password Update Succesfully!").show();
                } else {
                    new Alert(Alert.AlertType.ERROR, "User Password Not Updated!").show();
                }
            }else{
                new Alert(Alert.AlertType.ERROR, "User ID not found!").show();
            }
        }else{
            new Alert(Alert.AlertType.ERROR, "Please Fill Details!").show();
        }
    }

}