package app;

import menu.Menu;
import menu.MenuLoader;
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
        Room myRoom;
        RoomLoader roomLoader = new RoomLoader();
        Menu[] menus;
        Menu myMenu;
        MenuLoader menuLoader = new MenuLoader();
        Transaction transaction;
        String nin, name, checkIn, checkOut;
        Date checkInDate, checkOutDate;
        User user;
        int choose = 0, selectedBreakfast;
        char bookChoose;
        boolean isBook = false;

        System.out.println("Silahkan Isi Data Diri Anda");
        System.out.print("Masukan NIK: ");
        nin = stringInput.nextLine();
        System.out.print("Masukan Nama: ");
        name = stringInput.nextLine();
        user = new User(nin, name);

        System.out.print("Silahkan Isi Tanggal Check In (dd/mm/yyyy): ");
        checkIn = stringInput.nextLine();
        System.out.print("Silahkan Isi Tanggal Check out (dd/mm/yyyy): ");
        checkOut = stringInput.nextLine();

        rooms = roomLoader.load();
        menus = menuLoader.load();

        while(!isBook) {
            System.out.println("\nDAFTAR KAMAR");
            roomLoader.showRoomList();
            System.out.print("Cek fasilitas kamar(1-5)\t: ");
            choose = integerInput.nextInt();
            System.out.println();
            roomLoader.showDetailList(choose);
            System.out.print("Book(y/n)? ");
            bookChoose = charInput.next().charAt(0);
            if (bookChoose == 'y' || bookChoose == 'Y') {
                isBook = true;
            } else if (bookChoose == 'n' || bookChoose == 'N') {
                isBook = false;
            } else {
                System.out.println("Silahkan masukan huruf yang sudah ditentukan");
                isBook = false;
            }
        }

        myRoom = rooms[choose-1];

        if (myRoom.isBreakfast()) {
            System.out.println("\nMENU BREAKFAST");
            menuLoader.showMenuList();
        }

        System.out.print("Pilih menu: ");
        selectedBreakfast = integerInput.nextInt();

        myMenu = menus[selectedBreakfast-1];

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat sdfNew = new SimpleDateFormat("E, MMM dd yyyy");

        checkInDate = sdf.parse(checkIn);
        checkOutDate = sdf.parse(checkOut);

        transaction = new Transaction(user, sdfNew.format(checkInDate), sdfNew.format(checkOutDate), myRoom, myMenu);

        System.out.println(transaction);
    }
}
