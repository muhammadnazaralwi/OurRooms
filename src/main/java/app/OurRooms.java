package app;

import menu.Menu;
import menu.MenuLoader;
import menu.MenuPrinter;
import room.Room;
import room.RoomLoader;
import room.RoomPrinter;
import user.Transaction;
import user.User;
import utils.MyDateFormatter;

import java.util.Scanner;

public class OurRooms {
    public static void main(String[] args) throws Exception {
        Scanner stringInput = new Scanner(System.in);
        Scanner integerInput = new Scanner(System.in);
        Scanner charInput = new Scanner(System.in);

        Room[] rooms;
        Room myRoom;
        RoomLoader roomLoader = new RoomLoader();
        RoomPrinter roomPrinter = new RoomPrinter();

        Menu[] menus;
        Menu myMenu;
        MenuLoader menuLoader = new MenuLoader();
        MenuPrinter menuPrinter = new MenuPrinter();

        String nin, name, checkIn, checkOut;
        MyDateFormatter formatter = new MyDateFormatter();
        Transaction transaction;
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
            roomPrinter.show();
            System.out.print("Cek fasilitas kamar(1-5)\t: ");
            choose = integerInput.nextInt();
            System.out.println();
            roomPrinter.showDetail(choose);
            System.out.print("Book(y/n)? ");
            bookChoose = charInput.next().charAt(0);
            isBook = bookChoose == 'y';
        }

        myRoom = rooms[choose-1];

        if (myRoom.isBreakfast()) {
            System.out.println("\nMENU BREAKFAST");
            menuPrinter.show();
        }

        System.out.print("Pilih menu: ");
        selectedBreakfast = integerInput.nextInt();

        myMenu = menus[selectedBreakfast-1];

        transaction = new Transaction(
                user,
                formatter.getFormattedDateWithDay(checkIn),
                formatter.getFormattedDateWithDay(checkOut),
                myRoom,
                myMenu);

        System.out.println(transaction);
    }
}
