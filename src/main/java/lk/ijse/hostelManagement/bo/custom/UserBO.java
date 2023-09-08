

package lk.ijse.hostelManagement.bo.custom;

import lk.ijse.hostelManagement.bo.SuperBO;
import lk.ijse.hostelManagement.dto.UserDTO;
import lk.ijse.hostelManagement.entity.User;

import java.util.List;

public interface UserBO extends SuperBO {
    User getUser(String id);

    String getPassword(String id);

    boolean updateUser_Pw(String newUserName, String newPw);

    boolean saveUser(UserDTO dto);

    List<UserDTO> loadAll();

    boolean updateUser(UserDTO dto);
}
