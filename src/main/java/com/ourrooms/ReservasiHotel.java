package com.ourrooms;

import java.util.Scanner;

public class ReservasiHotel {
    static String nama, NIK, kamar, menuBreakfast, notaPembayaran;

    public static void main(String[] args) {
        String hari, bulan, tahun, tanggalCheckIn, tanggalCheckOut;
        int jam, menit, tanggal, pilihUntukCekKamar, kamarYangDipilih, menuYangDipilih;
        boolean isBook;
        Scanner userInputInteger, userInputString;

        userInputInteger = new Scanner(System.in);
        userInputString = new Scanner(System.in);
        isBook = false;
        kamarYangDipilih = 0;
        kamar = "";
        menuBreakfast = "-";

        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("|\t\t\t\tSELAMAT DATANG DI HOTEL JAHILLIYAH\t\t\t\t\t|");
        System.out.println("|\t\t\tJalan Karya No.33, Kabupaten Mesir, England\t\t\t\t|");
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println("");

        System.out.println("Silahkan Isi Tanggal Check In:");
        System.out.print("Masukkan jam (1-24)\t\t: ");
        jam = userInputInteger.nextInt();

        System.out.print("Masukkan Menit (0-59)\t: ");
        menit = userInputInteger.nextInt();

        System.out.print("Masukkan Hari\t\t\t: ");
        hari = userInputString.nextLine();

        System.out.print("Masukkan Tanggal\t\t: ");
        tanggal = userInputInteger.nextInt();

        System.out.print("Masukkan Bulan\t\t\t: ");
        bulan = userInputString.nextLine();

        System.out.print("Masukkan Tahun\t\t\t: ");
        tahun = userInputString.nextLine();

        tanggalCheckIn = formatTanggalCheckIn(jam, menit, hari, tanggal, bulan, tahun);

        tanggalCheckOut = formatTanggalCheckOut(jam, menit, hari, tanggal+1, bulan, tahun);

        while(!isBook) {
            cetakPilihanKamar();
            System.out.print("Cek fasilitas kamar(1-5)\t\t: ");
            pilihUntukCekKamar = userInputInteger.nextInt();
            isBook = cekFasilitasKamar(pilihUntukCekKamar, isBook);
            kamarYangDipilih = pilihUntukCekKamar;
        }

        switch (kamarYangDipilih) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                menuYangDipilih = cetakDanPilihMenuBreakfast();
                break;
        }

        registrasi();

        cetakInvoice(nama, NIK, kamar, menuBreakfast, tanggalCheckIn, tanggalCheckOut, notaPembayaran);
    }

    public static String formatTanggalCheckIn(int jam, int menit, String hari, int tanggal, String bulan, String tahun) {
        String tanggalCheckIn;

        switch (hari) {
            case "Senin":
            case "senin":
                hari = "Senin";
                break;
            case "Selasa":
            case "selasa":
                hari = "Selasa";
                break;
            case "Rabu":
            case "rabu":
                hari = "Rabu";
                break;
            case "Kamis":
            case "kamis":
                hari = "Kamis";
                break;
            case "Jumat":
            case "jumat":
                hari = "Jumat";
                break;
            case "Sabtu":
            case "sabtu":
                hari = "Sabtu";
                break;
            case "Minggu":
            case "minggu":
                hari = "Minggu";
                break;
        }

        bulan = ubahCaseBulan(bulan);

        if (jam < 10 && menit < 10) {
            tanggalCheckIn = hari + ", " + tanggal + " " + bulan + " " + tahun + " 0" + jam + ":0" + menit;
        } else {
            tanggalCheckIn = hari + ", " + tanggal + " " + bulan + " " + tahun + " " + jam + ":" + menit;
        }

        return tanggalCheckIn;
    }

    public static String formatTanggalCheckOut(int jam, int menit, String hari, int tanggal, String bulan, String tahun) {
        String tanggalCheckOut;
        String hariCheckOut;

        hariCheckOut = "";

        switch (hari) {
            case "Senin":
            case "senin":
                hariCheckOut = "Selasa";
                break;
            case "Selasa":
            case "selasa":
                hariCheckOut = "Rabu";
                break;
            case "Rabu":
            case "rabu":
                hariCheckOut = "Kamis";
                break;
            case "Kamis":
            case "kamis":
                hariCheckOut = "Jumat";
                break;
            case "Jumat":
            case "jumat":
                hariCheckOut = "Sabtu";
                break;
            case "Sabtu":
            case "sabtu":
                hariCheckOut = "Minggu";
                break;
            case "Minggu":
            case "minggu":
                hariCheckOut = "Senin";
                break;
        }

        bulan = ubahCaseBulan(bulan);

        if (jam < 10 && menit < 10) {
            tanggalCheckOut = hariCheckOut + ", " + tanggal + " " + bulan + " " + tahun + " 0" + jam + ":0" + menit;
        } else {
            tanggalCheckOut = hariCheckOut + ", " + tanggal + " " + bulan + " " + tahun + " " + jam + ":" + menit;
        }

        return tanggalCheckOut;
    }

    public static void cetakPilihanKamar() {
        System.out.println();
        System.out.println("DAFTAR KAMAR");
        System.out.println("1. Deluxe Double Room ");
        System.out.println("2. Deluxe Twin Room ");
        System.out.println("3. Grand Deluxe ");
        System.out.println("4. Suite Junior ");
        System.out.println("5. Suite Executive ");
    }

    public static boolean cekFasilitasKamar(int pilihanKamar, boolean isBook) {
        char bookOrNo;
        Scanner userInputChar;

        userInputChar = new Scanner(System.in);
        System.out.println();

        System.out.println("FASILITAS KAMAR");
        switch (pilihanKamar) {
            case 1:
                System.out.println("\n\tDELUXE DOUBLE ROOM\n" +
                        "\t- Ukuran Kamar 20 m^2\n" +
                        "\t- Sower\n" +
                        "\t- Double bad\n" +
                        "\t- Maks 2 orang  (2 anak usia 0 – 5 tahun menginap gratis)\n" +
                        "\t- Air Conditioner\n" +
                        "\t- Free Wifi\n");
                kamar = "\n\t\tDELUXE DOUBLE ROOM\n" +
                        "\t\t- Ukuran Kamar 20 m^2\n" +
                        "\t\t- Sower\n" +
                        "\t\t- Double bad\n" +
                        "\t\t- Maks 2 orang  (2 anak usia 0 – 5 tahun menginap gratis)\n" +
                        "\t\t- Air Conditioner\n" +
                        "\t\t- Free Wifi\n";
                notaPembayaran = "Rp. 530.000";
                break;
            case 2:
                System.out.println("\n\tDELUXE TWIN ROOM\n" +
                        "\t- Ukuran Kamar 24 m^2\n" +
                        "\t- Sower\n" +
                        "\t- 1 kasur queen size\n" +
                        "\t- Maks 2 orang  (2 anak usia 0 – 5 tahun menginap gratis)\n" +
                        "\t- Air Conditioner \n" +
                        "\t- Free Wifi\n");
                kamar = "\n\t\tDELUXE TWIN ROOM\n" +
                        "\t\t- Ukuran Kamar 24 m^2\n" +
                        "\t\t- Sower\n" +
                        "\t\t- 1 kasur queen size\n" +
                        "\t\t- Maks 2 orang  (2 anak usia 0 – 5 tahun menginap gratis)\n" +
                        "\t\t- Air Conditioner \n" +
                        "\t\t- Free Wifi\n";
                notaPembayaran = "Rp. 670.000";
                break;
            case 3:
                System.out.println("\n\tGRAND DELUXE\n" +
                        "\t- Ukuran Kamar 27 m^2\n" +
                        "\t- Sower dan Bathtub\n" +
                        "\t- Akses Executive Lounge\n" +
                        "\t- 1 Kasur King size\n" +
                        "\t- Air Conditioner\n" +
                        "\t- Maks 2 orang (2 anak usia 0 – 5 tahun menginap gratis)\n" +
                        "\t- Free Wifi Pribadi\n" +
                        "\t- Free Breakfast\n" +
                        "\n");
                kamar = "\n\t\tGRAND DELUXE\n" +
                        "\t\t- Ukuran Kamar 27 m^2\n" +
                        "\t\t- Sower dan Bathtub\n" +
                        "\t\t- Akses Executive Lounge\n" +
                        "\t\t- 1 Kasur King size\n" +
                        "\t\t- Air Conditioner\n" +
                        "\t\t- Maks 2 orang (2 anak usia 0 – 5 tahun menginap gratis)\n" +
                        "\t\t- Free Wifi Pribadi\n" +
                        "\t\t- Free Breakfast\n" +
                        "\n";
                notaPembayaran = "Rp. 980.000";
                break;
            case 4:
                System.out.println("\n\tSUITE JUNIOR\n" +
                        "\t- Ukuran Ruangan 34 m^2\n" +
                        "\t- Pemandangan : Kota\n" +
                        "\t- Bebas Asap Rokok\n" +
                        "\t- Sower dan Bathtub\n" +
                        "\t- Akses Executive Lounge\n" +
                        "\t- 1 kasur queen size\n" +
                        "\t- 2 Air Conditioner\n" +
                        "\t- Air Conditioner\n" +
                        "\t- Free wifi Pribadi\n" +
                        "\t- Free Breakfast sangat enak\n" +
                        "\t- Free Spa\n");
                kamar = "\n\t\tSUITE JUNIOR\n" +
                        "\t\t- Ukuran Ruangan 34 m^2\n" +
                        "\t\t- Pemandangan : Kota\n" +
                        "\t\t- Bebas Asap Rokok\n" +
                        "\t\t- Sower dan Bathtub\n" +
                        "\t\t- Akses Executive Lounge\n" +
                        "\t\t- 1 kasur queen size\n" +
                        "\t\t- 2 Air Conditioner\n" +
                        "\t\t- Air Conditioner\n" +
                        "\t\t- Free wifi Pribadi\n" +
                        "\t\t- Free Breakfast sangat enak\n" +
                        "\t\t- Free Spa\n";
                notaPembayaran = "Rp. 1.950.000";
                break;
            case 5:
                System.out.println("\n\tSUITE EXECUTIVE\n" +
                        "\t- Ukuran Ruangan 48 m^2\n" +
                        "\t- Pemandangan Kota\n" +
                        "\t- Sower dan Bathtub\n" +
                        "\t- Akses Executive Longue\n" +
                        "\t- 2 kasur queen size\n" +
                        "\t- 3 Air Conditioner\n" +
                        "\t- 1 Kamar Utama \n" +
                        "\t- 1 Kamar Pembantu\n" +
                        "\t- Free wifi pribadi \n" +
                        "\t- Free Breakfast sangat enak\n" +
                        "\t- Free Spa\n" +
                        "\t- Free Laundry\n");
                kamar = "\n\t\tSUITE EXECUTIVE\n" +
                        "\t\t- Ukuran Ruangan 48 m^2\n" +
                        "\t\t- Pemandangan Kota\n" +
                        "\t\t- Sower dan Bathtub\n" +
                        "\t\t- Akses Executive Longue\n" +
                        "\t\t- 2 kasur queen size\n" +
                        "\t\t- 3 Air Conditioner\n" +
                        "\t\t- 1 Kamar Utama \n" +
                        "\t\t- 1 Kamar Pembantu\n" +
                        "\t\t- Free wifi pribadi \n" +
                        "\t\t- Free Breakfast sangat enak\n" +
                        "\t\t- Free Spa\n" +
                        "\t\t- Free Laundry\n";
                notaPembayaran = "Rp. 2.500.000";
                break;
            default:
                System.out.println("Input tidak valid");
        }

        System.out.print("Book(y/n)\t: ");
        bookOrNo = userInputChar.next().charAt(0);
        if (bookOrNo == 'y') {
            isBook = true;
        } else if (bookOrNo == 'n') {
            isBook = false;
        } else {
            System.out.println("Input tidak valid");
        }

        return isBook;
    }

    public static int cetakDanPilihMenuBreakfast() {
        Scanner scanner = new Scanner(System.in);
        char pilihMenu;
        int menuYangDipilih;

        System.out.println();
        System.out.println("MENU BREAKFAST");
        System.out.println("1. Mixed Vegetables with Peanut Sauce Dressing");
        System.out.println("2. Fried chicken with jahanam sauce");
        System.out.println("3. Steak with padang spicy sauce");
        System.out.println("4. Yellow soup with chicken");
        System.out.println("5. Javanese black rice soup with beef");
        System.out.println("6. Beef in Soy Sauce");
        System.out.println("7. Rice Cooked in Coconut Milk");
        System.out.println("8. Crispy salty soy bean");

        System.out.print("Masukkan Pilihan Menu (1..8)\t: ");
        pilihMenu = scanner.next().toUpperCase().charAt(0);
        menuYangDipilih = 0;

        switch (pilihMenu) {
            case '1':
                menuYangDipilih = 1;
                menuBreakfast = "Mixed Vegetables with Peanut Sauce Dressing";
                break;
            case '2':
                menuYangDipilih = 2;
                menuBreakfast = "Fried chicken with jahanam sauce";
                break;
            case '3':
                menuYangDipilih = 3;
                menuBreakfast = "Steak with padang spicy sauce";
                break;
            case '4':
                menuYangDipilih = 4;
                menuBreakfast = "Yellow soup with chicken";
                break;
            case '5':
                menuYangDipilih = 5;
                menuBreakfast = "Javanese black rice soup with beef";
                break;
            case '6':
                menuYangDipilih = 6;
                menuBreakfast = "Beef in Soy Sauce";
                break;
            case '7':
                menuYangDipilih = 7;
                menuBreakfast = "Rice Cooked in Coconut Milk";
                break;
            case '8':
                menuYangDipilih = 8;
                menuBreakfast = "Crispy salty soy bean";
                break;
            default:
                System.out.println("Input tidak valid");
        }

        return menuYangDipilih;
    }

    public static void registrasi() {
        Scanner userInputString;

        userInputString = new Scanner(System.in);

        System.out.println();
        System.out.println("Silahkan Isi Data Diri Anda");
        System.out.print("Masukkan Nama\t: ");
        nama = userInputString.nextLine();

        System.out.print("Masukkan NIK\t: ");
        NIK = userInputString.nextLine();
    }

    public static void cetakInvoice(String nama, String NIK, String kamar, String menuBreakfast, String tanggalCheckIn, String tanggalCheckOut, String notaPembayaran) {
        System.out.println();
        System.out.println("|---------------------- NOTA PEMBAYARAN HOTEL ----------------------|");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIK\t\t: " + NIK);
        System.out.println("Kamar\t: " + kamar);
        System.out.println("Menu Breakfast\t\t: " + menuBreakfast);
        System.out.println("Check in\t\t\t: " + tanggalCheckIn);
        System.out.println("Check out\t\t\t: " + tanggalCheckOut);
        System.out.println("Total Pembayaran\t: " + notaPembayaran);
        System.out.println("|-------------------------------------------------------------------|");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\tTERIMA KASIH");
        System.out.println("\t\t\t\t\t\tATAS KUNJUNGAN ANDA");

    }

    public static String ubahCaseBulan(String bulan) {
        switch (bulan) {
            case "Januari":
            case "januari":
                return "Januari";
            case "Februari":
            case "februari":
                return "Februari";
            case "Maret":
            case "maret":
                return "Maret";
            case "April":
            case "april":
                return "April";
            case "Mei":
            case "mei":
                return "Mei";
            case "Juni":
            case "juni":
                return "Juni";
            case "Juli":
            case "juli":
                return "Juli";
            case "Agustus":
            case "agustus":
                return "Agustus";
            case "September":
            case "september":
                return "September";
            case "Oktober":
            case "oktober":
                return "Oktober";
            case "November":
            case "november":
                return "November";
            case "Desember":
            case "desember":
                return "Desember";
            default:
                return "";
        }
    }
}
