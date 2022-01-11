package user;

import menu.Menu;
import room.Room;

public class Transaction {
    User user;
    String checkIn, checkOut;
    Room room;
    Menu menu;

    public Transaction(User user, String checkIn, String checkOut, Room room, Menu menu) {
        this.user = user;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room = room;
        this.menu = menu;
    }
}
