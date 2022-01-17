<p align="center">
    <img src="Logo.png" width="400" max-width="90%" alt="OurRooms" />
</p>

<p align="center">
    <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white" />
    <img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" />
</p>

# OurRooms App - Fitur Pemesanan
## BDD Specs

### Story: Tamu yang hendak check-in

### Narrative #1

> Sebagai tamu  
> Saya ingin aplikasi otomatis menampilkan daftar kamar  
> Sehingga saya dapat melihat daftar kamar  

### Narrative #2

> Sebagai tamu  
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
3. System mengirim data room list.

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
