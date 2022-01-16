package room;

import feature.Printer;

public class RoomPrinter implements Printer {
    // Membuat object roomLoader
    RoomLoader roomLoader = new RoomLoader();

    // Merupakan method abstract dari interface Printer
    public void show() throws Exception {
        // Membuat array Room
        // dengan mengambil data dari object roomLoader
        Room[] rooms = roomLoader.load();

        // For each menu untuk mencetak list room
        for (Room room : rooms) {
            System.out.println(room.id + ". " + room.name);
        }
    }

    // Merupakan method untuk menampilkan detail room berdasarkan id
    public void showDetail(int id) throws Exception {
        // Membuat array Room
        // dengan mengambil data dari object roomLoader
        Room[] rooms = roomLoader.load();;

        // Mendefinisikan id
        // id dikurang dengan 1 karena nilai id lebih 1 dari index
        // misal: id = 1, index harus 0
        int index = id-1;

        // Mencetak nama Room dan merubah nama tersebut menjadi kapital
        System.out.println(rooms[index].name.toUpperCase());

        // Mencetak daftar fasilitas
        for (String facility : rooms[index].facilities) {
            System.out.println("\t- " + facility);
        }

        // Mecetak harga
        System.out.println("\tHarga: Rp" + rooms[index].price);
    }
}
