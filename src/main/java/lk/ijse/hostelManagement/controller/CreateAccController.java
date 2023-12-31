package lk.ijse.hostelManagement.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hostelManagement.bo.BOFactory;
import lk.ijse.hostelManagement.bo.custom.UserBO;
import lk.ijse.hostelManagement.dto.UserDTO;
import lk.ijse.hostelManagement.entity.User;
import lk.ijse.hostelManagement.util.Navigation;
import lk.ijse.hostelManagement.util.Routes;

import java.io.IOException;

public class CreateAccController {

    public AnchorPane pane;
    public JFXTextField newUsername;
    public JFXPasswordField newPassword;
    public JFXPasswordField rePassword;
    UserBO userBO =(UserBO) BOFactory.getBoFactory().getBO(BOFactory.Type.USER);

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.LOGIN, pane);
    }

    public void confirmClickOnAction(ActionEvent actionEvent) {
    }

    public void createClickOnAction(ActionEvent actionEvent) {
        if (!newUsername.getText().isEmpty() && !newPassword.getText().isEmpty() && !rePassword.getText().isEmpty()) {
            String pass = newPassword.getText();
            String rePass = rePassword.getText();
            String userName = newUsername.getText();
            User user = userBO.getUser(userName);

            if(pass.equals(rePass)) {

                    if (user != null) {
                        new Alert(Alert.AlertType.ERROR, "Username Alredy Registerd!").show();
                    } else {
                        UserDTO userDTO = new UserDTO(userName, pass);
                        boolean isSaved = userBO.saveUser(userDTO);
                        if (isSaved) {
                            new Alert(Alert.AlertType.CONFIRMATION, "User Register Succesfully!").show();
                        } else {
                            new Alert(Alert.AlertType.ERROR, "User Not Saved!").show();
                        }
                    }

            }else{
                new Alert (Alert.AlertType.ERROR, "Passwords Not Maching").show ();

            }

        } else {
            new Alert(Alert.AlertType.ERROR, "Please Fill Details!").show();
        }
    }


}
