<p align="center">
    <img src="Logo.png" width="400" max-width="90%" alt="OurRooms" />
</p>

<p align="center">
    <img src="https://img.shields.io/badge/OpenJDK-15.0.5-blue.svg" />
    <img src="https://img.shields.io/badge/IntelliJ%20IDEA-2020.2.3-blue.svg" />
</p>

Our Rooms adalah aplikasi untuk pemesanan kamar hotel. Our Rooms memiliki fitur untuk menampilkan tipe kamar dan menampilkan fasilitas berbeda di setiap kamarnya.

Aplikasi ini dibuat untuk memudahkan para pelanggan ketika memesan kamar hotel dan juga akan meminimalisir menumpuknya antrian. Our Rooms ini memiliki fitur untuk menampilkan tipe kamar dan menampilkan fasilitas berbeda di setiap kamarnya.

# OurRooms App - Fitur Pemesanan
## BDD Specs

### Story: Tamu yang hendak check-in

### Narrative #1

> Sebagai user  
> Saya ingin aplikasi otomatis menampilkan daftar kamar  
> Sehingga saya dapat melihat daftar kamar  

### Narrative #2

> Sebagai user  
> Ketika saya memilih kamar dari daftar kamar  
> Aplikasi akan menampilkan fasilitas lebih detail dari kamar  
> Sehingga saya bisa mendapatkan informasi dari kamar tersebut  

## Use Cases

### Load Room List Use Case

#### Data:
- JSON

#### Primary course (happy path):
1. Mengeksekusi perintah "Load Room List" dengan data di atas.
2. Sistem akan mengurai data dari json.
3. Sistem mengirim data room list.

#### Invalid data – error course (sad path):
1. Sistem menampilkan error.

#### No connectivity – error course (sad path):
1. Sistem menampilkan error.

## Model Specs

### Room

| Property      | Type                |
|---------------|---------------------|
| `id`          | `int`              |
| `name` | `String`  |
| `facilities`    | `String[]`               |
| `price`    | `int` |
| `breakfast`    | `boolean`  |

### Menu List Use Case

#### Data:
- JSON

#### Primary course (happy path):
1. Mengeksekusi perintah "Load Menu List" dengan data di atas.
2. Sistem akan mengurai data dari json.
3. System mengirim data Menu list.

#### Invalid data – error course (sad path):
1. Sistem menampilkan error.

#### No connectivity – error course (sad path):
1. Sistem menampilkan error.

## Model Specs

### Menu

| Property      | Type                |
|---------------|---------------------|
| `id`          | `int`              |
| `name` | `String`  |

## Flowchart

![Flowchart](Flowchart.jpeg)

## Polymorphism Diagram

![Polymorphism Diagram](PolymorphismDiagram.jpeg)

## Output
```
Silahkan Isi Data Diri Anda
Masukan NIK: 123
Masukan Nama: Muhammad
Silahkan Isi Tanggal Check In (dd/mm/yyyy): 17/01/2022
Silahkan Isi Tanggal Check out (dd/mm/yyyy): 25/01/2022

DAFTAR KAMAR
1. Deluxe Double Room
2. Deluxe Twin Room
3. Grand Deluxe
4. Suite Junior
5. Suite Executive
Cek fasilitas kamar(1-5): 3

GRAND DELUXE
	- Ukuran Kamar 27 m^2
	- Sower dan Bathtub
	- Akses Executive Lounge
	- 1 Kasur King size
	- Air Conditioner
	- Maks 2 orang (2 anak usia 0 – 5 tahun menginap gratis)
	- Free Wifi Pribadi
	- Free Breakfast
	Harga: Rp980000
Book(y/n)? y

MENU BREAKFAST
1. Mixed Vegetables with Peanut Sauce Dressing
2. Fried chicken with jahanam sauce
3. Steak with padang spicy sauce
4. Yellow soup with chicken
5. Javanese black rice soup with beef
6. Beef in Soy Sauce
7. Rice Cooked in Coconut Milk
8. Crispy salty soy bean,
Pilih menu: 4

|---------------------- NOTA PEMBAYARAN HOTEL ----------------------|
NIK	: 123
Nama	: Muhammad
Kamar	: Grand Deluxe
Fasilitas	: 
	- Ukuran Kamar 27 m^2
	- Sower dan Bathtub
	- Akses Executive Lounge
	- 1 Kasur King size
	- Air Conditioner
	- Maks 2 orang (2 anak usia 0 – 5 tahun menginap gratis)
	- Free Wifi Pribadi
	- Free Breakfast

Menu Breakfast	: Yellow soup with chicken
Check in	: Mon, Jan 17 2022
Check out	: Tue, Jan 25 2022
Total Pembayaran	: 980000
|-------------------------------------------------------------------|
							TERIMA KASIH
						ATAS KUNJUNGAN ANDA
```

## Materi yang digunakan
- Generics
- Class
- Abstraction (Interface)
- BufferedReader
- Method
- Looping (While, For i, For each)
- PBO (Abstraction (Interface), Encapsulation, Polymorphism)
- Exception
- If else
