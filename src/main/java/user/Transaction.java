package user;

import menu.Menu;
import room.Room;

import java.util.Date;

public class Transaction {
    User user;
    Date checkIn, checkOut;
    Room room;
    Menu menu;

    public Transaction(User user, Date checkIn, Date checkOut, Room room, Menu menu) {
        this.user = user;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room = room;
        this.menu = menu;
    }
}
