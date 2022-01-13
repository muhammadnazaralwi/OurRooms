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

    @Override
    public String toString() {
        return "\n|---------------------- NOTA PEMBAYARAN HOTEL ----------------------|" +
                "\nNIK\t: " + user.nin +
                "\nNama\t: " + user.name +
                "\nKamar\t: \n" +
                stringFacilities() +
                "\nMenu Breakfast\t: " + menu.getName() +
                "\nCheck in\t: " + checkIn +
                "\nCheck out\t: " + checkOut +
                "\nTotal Pembayaran\t: " + room.getPrice() +
                "\n|-------------------------------------------------------------------|" +
                "\n\t\t\t\t\t\t\tTERIMA KASIH" +
                "\n\t\t\t\t\t\tATAS KUNJUNGAN ANDA\n";
    }

    private StringBuilder stringFacilities() {
        StringBuilder facilities = new StringBuilder();
        for (String facility : room.getFacilities()) {
            facilities.append("\t- ").append(facility).append("\n");
        }
        return facilities;
    }
}
