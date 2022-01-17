package user;

import menu.Menu;
import room.Room;

// Merupakan representasi dari invoice
public class Transaction {
    private final User user;
    private final String checkIn, checkOut;
    private final Room room;
    private final Menu menu;

    public Transaction(User user, String checkIn, String checkOut, Room room, Menu menu) {
        this.user = user;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room = room;
        this.menu = menu;
    }

    // Menggunakan override method toString
    // Karena agar bisa mencetak object dari class ini dengan format invoice
    @Override
    public String toString() {
        return "\n|---------------------- NOTA PEMBAYARAN HOTEL ----------------------|" +
                "\nNIK\t: " + user.getNin() +
                "\nNama\t: " + user.getName() +
                "\nKamar\t: " + room.getName() +
                "\nFasilitas\t: \n" +
                stringFacilities() +
                "\nMenu Breakfast\t: " + menu.getName() +
                "\nCheck in\t: " + checkIn +
                "\nCheck out\t: " + checkOut +
                "\nTotal Pembayaran\t: " + room.getPrice() +
                "\n|-------------------------------------------------------------------|" +
                "\n\t\t\t\t\t\t\tTERIMA KASIH" +
                "\n\t\t\t\t\t\tATAS KUNJUNGAN ANDA\n";
    }

    // Method untuk mengiterasi array fasilitas
    // dan membuatnya sebagai satu string
    private StringBuilder stringFacilities() {
        StringBuilder facilities = new StringBuilder();
        for (String facility : room.getFacilities()) {
            facilities.append("\t- " + facility + "\n");
        }
        return facilities;
    }
}
