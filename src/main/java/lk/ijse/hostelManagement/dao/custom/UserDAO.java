
package lk.ijse.hostelManagement.dao.custom;

import lk.ijse.hostelManagement.dao.CrudDAO;
import lk.ijse.hostelManagement.entity.User;

import java.util.List;

public interface UserDAO extends CrudDAO<User> {
    User getUser(String id);

    String getPassword(String id);

    boolean updateUser_Pw(String newUserName, String newPw);

    List<User> loadAll();

    boolean updateUser(User user);
}
