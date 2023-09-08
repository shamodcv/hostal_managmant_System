package lk.ijse.hostelManagement.bo.custom;

import lk.ijse.hostelManagement.bo.SuperBO;
import lk.ijse.hostelManagement.dto.RoomsDTO;

import java.util.ArrayList;

public interface RoomsBO extends SuperBO {
    Boolean addRoom(RoomsDTO roomsDTO);

    Boolean deleteRoom(RoomsDTO roomsDTO);

    ArrayList<RoomsDTO> getRoomsData();

    //String getCurrentID();

    Boolean updateRoom(RoomsDTO roomsDTO);
}
