package app;

import detail.RoomDetail;
import detail.RoomDetailLoader;
import room.RoomLoader;
import user.User;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class OurRooms {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner stringInput = new Scanner(System.in);
        Scanner integerInput = new Scanner(System.in);
        RoomLoader roomLoader = new RoomLoader();
        RoomDetailLoader roomDetailLoader = new RoomDetailLoader();
        String nin, name, checkIn, checkOut;
        User user;
        int choose;

        System.out.print("NIK: ");
        nin = stringInput.nextLine();
        System.out.print("Nama: ");
        name = stringInput.nextLine();
        user = new User(nin, name);

        System.out.println("Check in");
        checkIn = stringInput.nextLine();
        System.out.println("Check out");
        checkOut = stringInput.nextLine();

        System.out.println("DAFTAR KAMAR");
        roomLoader.load();
        System.out.print("Cek fasilitas kamar(1-5)\t: ");
        choose = integerInput.nextInt();
        roomDetailLoader.load(choose);
    }
}
