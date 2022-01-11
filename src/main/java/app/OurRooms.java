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
        int choose = 0, selectedBreakfast = 0;
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
        menus = menuLoader.load();

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

        myRoom = rooms[choose-1];

        if (myRoom.isBreakfast()) {
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
