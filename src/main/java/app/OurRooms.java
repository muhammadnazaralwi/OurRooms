package app;

import user.User;

import java.util.Scanner;

public class OurRooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nin = scanner.nextLine();
        String name = scanner.nextLine();
        User user = new User(nin, name);
    }
}
