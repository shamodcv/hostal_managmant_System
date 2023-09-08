package lk.ijse.hostelManagement.dao.custom;

import lk.ijse.hostelManagement.dao.SuperDAO;
import lk.ijse.hostelManagement.entity.CustomEntity;

import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    ArrayList<CustomEntity> getData();
}
