

package lk.ijse.hostelManagement.bo;

import lk.ijse.hostelManagement.bo.custom.impl.ReservationBOImpl;
import lk.ijse.hostelManagement.bo.custom.impl.RoomsBOImpl;
import lk.ijse.hostelManagement.bo.custom.impl.StudentBOImpl;
import lk.ijse.hostelManagement.bo.custom.impl.UserBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getBoFactory() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public enum Type {
        STUDENT,
        ROOM,
        RECEPTION,
        USER
    }

    public SuperBO getBO(Type type) {
        switch (type) {
            case STUDENT:
                return new StudentBOImpl();
            case ROOM:
                return new RoomsBOImpl();
            case RECEPTION:
                return new ReservationBOImpl();
            case USER:
                return new UserBOImpl();
            default:
                return null;
        }
    }
}

