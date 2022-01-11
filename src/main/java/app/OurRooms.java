package app;

import menu.Menu;
import room.Room;
import room.RoomLoader;
import user.Transaction;
import user.User;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OurRooms {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner stringInput = new Scanner(System.in);
        Scanner integerInput = new Scanner(System.in);
        Scanner charInput = new Scanner(System.in);
        Room[] rooms;
        RoomLoader roomLoader = new RoomLoader();
        Menu menu = new Menu();
        Transaction transaction;
        String nin, name, checkIn, checkOut;
        Date checkInDate, checkOutDate;
        User user;
        int choose = 0;
        char bookChoose;
        boolean isBook = false;

        System.out.print("NIK: ");
        nin = stringInput.nextLine();
        System.out.print("Nama: ");
        name = stringInput.nextLine();
        user = new User(nin, name);

        System.out.println("Check in");
        checkIn = stringInput.nextLine();
        System.out.println("Check out");
        checkOut = stringInput.nextLine();

        rooms = roomLoader.load();

        while(!isBook) {
            System.out.println("DAFTAR KAMAR");
            roomLoader.showRoomList();
            System.out.print("Cek fasilitas kamar(1-5)\t: ");
            choose = integerInput.nextInt();
            roomLoader.showDetailList(choose);
            System.out.print("Book(y/n)? ");
            bookChoose = charInput.next().charAt(0);
            isBook = bookChoose == 'y';
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat sdfNew = new SimpleDateFormat("E, MMM dd yyyy");

        checkInDate = sdf.parse(checkIn);
        checkOutDate = sdf.parse(checkOut);

        transaction = new Transaction(user, sdfNew.format(checkInDate), sdfNew.format(checkOutDate), rooms[choose], menu);

        System.out.println(transaction);
    }
}
