# Minpro-2-PBO-ManajemenRelawanBencana

## Sistem Manajemen Relawan Bencana

### Deskripsi Program

Sistem Manajemen Relawan Bencana merupakan program berbasis Java yang digunakan untuk membantu mengelola data relawan, data bencana, dan penempatan relawan pada suatu bencana.

Program ini merupakan pengembangan dari Mini Project 1. Pada Mini Project 2, program dikembangkan dengan menambahkan beberapa konsep Pemrograman Berorientasi Objek (PBO), seperti encapsulation, inheritance, polymorphism, penggunaan access modifier, getter dan setter, validasi input, dummy data, serta struktur program menggunakan MVC sederhana.

Program dibuat dalam bentuk aplikasi berbasis console sehingga pengguna dapat menjalankan program melalui menu yang tersedia.

---

## Tujuan Program

Program ini dibuat dengan tujuan untuk:

1. Mengelola data relawan.
2. Mengelola data bencana.
3. Menambahkan data relawan dan bencana.
4. Menghapus data relawan dan bencana.
5. Menempatkan relawan pada bencana tertentu.
6. Menampilkan relawan yang menangani suatu bencana.
7. Menerapkan konsep Pemrograman Berorientasi Objek dalam program Java.
8. Menerapkan validasi input agar data yang dimasukkan lebih sesuai.
9. Mengembangkan program dari Mini Project 1 menjadi program yang lebih terstruktur.

---

# Fitur Program

Program memiliki beberapa fitur utama sebagai berikut.

### 1. Tampilkan Relawan

Menu ini digunakan untuk menampilkan seluruh data relawan yang tersimpan di dalam program.

Data yang ditampilkan meliputi:

- ID relawan
- Nama
- Alamat
- Nomor HP
- Keahlian
- Jenis relawan
- Informasi tambahan sesuai jenis relawan

---

### 2. Tampilkan Bencana

Menu ini digunakan untuk melihat data bencana yang tersedia.

Informasi yang ditampilkan meliputi:

- ID bencana
- Nama bencana
- Lokasi
- Jenis bencana
- Status bencana

---

### 3. Tambah Relawan

Menu ini digunakan untuk menambahkan data relawan baru.

Pengguna dapat memilih jenis relawan:

1. Relawan Umum
2. Relawan Medis
3. Relawan Logistik

Data yang dimasukkan meliputi:

- ID relawan
- Nama
- Alamat
- Nomor HP
- Keahlian

Untuk relawan medis terdapat tambahan:

- Spesialisasi

Untuk relawan logistik terdapat tambahan:

- Jenis logistik

---

### 4. Tambah Bencana

Menu ini digunakan untuk menambahkan data bencana baru.

Data yang dimasukkan meliputi:

- ID bencana
- Nama bencana
- Lokasi
- Jenis bencana
- Status bencana

---

### 5. Hapus Relawan

Menu ini digunakan untuk menghapus data relawan berdasarkan ID.

Sebelum data dihapus, program akan mencari ID relawan yang dimasukkan. Jika ID ditemukan, data akan dihapus dari daftar.

Jika ID tidak ditemukan, program akan memberikan pesan bahwa relawan tidak ditemukan.

---

### 6. Hapus Bencana

Menu ini digunakan untuk menghapus data bencana berdasarkan ID.

Jika ID bencana ditemukan, data akan dihapus.

Jika ID tidak ditemukan, program akan memberikan pemberitahuan kepada pengguna.

---

### 7. Tambah Penempatan

Menu ini digunakan untuk menempatkan seorang relawan pada bencana tertentu.

Pengguna memasukkan:

- ID relawan
- ID bencana

Program akan mengecek apakah kedua ID tersebut tersedia.

Jika tersedia, relawan akan disimpan sebagai relawan yang ditempatkan pada bencana tersebut.

Contoh:

```text
ID Relawan : R001
ID Bencana : B001

Artinya relawan dengan ID R001 ditempatkan pada bencana dengan ID B001.


---

8. Tampilkan Penempatan

Menu ini digunakan untuk melihat data relawan yang sudah ditempatkan pada bencana.

Informasi yang ditampilkan antara lain:

ID relawan

Nama relawan

ID bencana

Nama bencana

Lokasi bencana


Fitur ini ditambahkan sebagai pengembangan dari Mini Project 1.


---

9. Keluar

Menu ini digunakan untuk mengakhiri program.


---

Alur Program

Alur program dimulai ketika pengguna menjalankan Main.java.

Setelah program dijalankan, sistem akan menampilkan menu utama.

Pengguna dapat memilih menu yang tersedia menggunakan nomor menu.

Secara umum alurnya adalah:

Mulai
  |
  v
Main.java
  |
  v
Menampilkan Menu
  |
  +----> Tampilkan Relawan
  |
  +----> Tampilkan Bencana
  |
  +----> Tambah Relawan
  |
  +----> Tambah Bencana
  |
  +----> Hapus Relawan
  |
  +----> Hapus Bencana
  |
  +----> Tambah Penempatan
  |
  +----> Tampilkan Penempatan
  |
  +----> Keluar
  |
  v
Selesai

Program akan terus menampilkan menu selama pengguna belum memilih menu keluar.


---

Struktur Program

Program menggunakan pembagian package dengan konsep MVC sederhana agar kode lebih teratur.

Struktur program:

com.mycompany.minpro.pbo.manajemenrelawanbencana
│
├── Main.java
│
├── model
│   ├── Relawan.java
│   ├── RelawanMedis.java
│   ├── RelawanLogistik.java
│   ├── Bencana.java
│   └── Penempatan.java
│
├── controller
│   └── ManajemenRelawan.java
│
└── view
    └── Menu.java


---

Penjelasan Package

1. Main

Main.java merupakan bagian awal program.

Class ini digunakan untuk menjalankan program dan menerima input dari pengguna.

Main juga menghubungkan bagian menu dengan proses pengelolaan data.


---

2. Model

Package model berisi class yang digunakan untuk membuat dan menyimpan data objek.

Class yang terdapat pada package ini yaitu:

Relawan

RelawanMedis

RelawanLogistik

Bencana

Penempatan


Relawan

Class Relawan digunakan sebagai class utama untuk data relawan.

Atribut yang dimiliki antara lain:

ID

Nama

Alamat

Nomor HP

Keahlian



---

RelawanMedis

Class RelawanMedis merupakan turunan dari class Relawan.

Class ini digunakan untuk relawan yang memiliki tugas atau keahlian di bidang medis.

Class ini memiliki tambahan atribut:

Spesialisasi



---

RelawanLogistik

Class RelawanLogistik merupakan turunan dari class Relawan.

Class ini digunakan untuk relawan yang bertugas dalam bidang logistik.

Class ini memiliki tambahan atribut:

Jenis Logistik



---

Bencana

Class Bencana digunakan untuk menyimpan informasi mengenai bencana.

Atributnya meliputi:

ID Bencana

Nama Bencana

Lokasi

Jenis Bencana

Status



---

Penempatan

Class Penempatan digunakan untuk menghubungkan data relawan dengan data bencana.

Class ini menyimpan:

Relawan

Bencana


Dengan adanya class ini, program dapat mengetahui relawan mana yang ditempatkan pada bencana tertentu.


---

3. Controller

Package controller berisi class:

ManajemenRelawan.java

Class ini digunakan untuk mengatur proses pengelolaan data.

Beberapa proses yang dilakukan adalah:

Menambah relawan

Menampilkan relawan

Mencari relawan

Menghapus relawan

Menambah bencana

Menampilkan bencana

Mencari bencana

Menghapus bencana

Menambah penempatan

Menampilkan penempatan


Data disimpan menggunakan ArrayList.


---

4. View

Package view berisi:

Menu.java

Class ini digunakan untuk menampilkan menu utama kepada pengguna.

Dengan adanya bagian View, tampilan menu dapat dipisahkan dari bagian pengelolaan data.


---

Encapsulation

Encapsulation merupakan konsep untuk membatasi akses langsung terhadap data yang ada di dalam class.

Pada program ini, atribut dibuat menggunakan access modifier:

private

Contohnya:

private String id;
private String nama;
private String alamat;
private String noHp;
private String keahlian;

Karena atribut dibuat private, data tersebut tidak dapat diakses secara langsung dari luar class.

Untuk mengakses data digunakan getter dan setter.

Contohnya:

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

Dengan cara ini, data di dalam objek menjadi lebih terkontrol.


---

Inheritance

Inheritance digunakan agar sebuah class dapat mewarisi atribut dan method dari class lain.

Pada program ini, class:

Relawan

menjadi superclass.

Sedangkan:

RelawanMedis
RelawanLogistik

menjadi subclass.

Strukturnya:

Relawan
              /    \
             /      \
 RelawanMedis      RelawanLogistik

RelawanMedis dan RelawanLogistik dapat menggunakan data dan method yang dimiliki oleh Relawan.

Selain itu, masing-masing subclass memiliki data tambahan sesuai dengan jenis relawannya.


---

Polymorphism

Polymorphism diterapkan melalui method:

tampilkanInfo()

Pada class Relawan, terdapat method:

public void tampilkanInfo()

Kemudian method tersebut dioverride pada class RelawanMedis dan RelawanLogistik.

Contohnya menggunakan:

@Override
public void tampilkanInfo()

Pada RelawanMedis, informasi tambahan yang ditampilkan adalah:

Spesialisasi

Sedangkan pada RelawanLogistik, informasi tambahan yang ditampilkan adalah:

Jenis Logistik

Dengan demikian, method yang sama dapat memberikan hasil yang berbeda sesuai dengan objek yang digunakan.


---

ArrayList

Program menggunakan ArrayList untuk menyimpan data.

ArrayList digunakan karena jumlah data dapat bertambah atau berkurang ketika program dijalankan.

ArrayList yang digunakan yaitu:

daftarRelawan
daftarBencana
daftarPenempatan

Contohnya:

private ArrayList<Relawan> daftarRelawan;

Data dapat ditambahkan menggunakan:

daftarRelawan.add(relawan);

dan dapat dihapus menggunakan:

daftarRelawan.remove(relawan);


---

Dummy Data

Program memiliki dummy data atau data awal.

Tujuannya agar ketika program pertama kali dijalankan, pengguna sudah dapat melihat contoh data tanpa harus memasukkan data terlebih dahulu.

Dummy Data Relawan

ID       : R001
Nama     : Andi
Alamat   : Samarinda
No. HP   : 081234567890
Keahlian : Evakuasi

Dummy Data Bencana

ID Bencana   : B001
Nama Bencana : Banjir Samarinda
Lokasi       : Samarinda
Jenis        : Banjir
Status       : Aktif


---

Validasi Input

Program memiliki validasi input untuk mengurangi kesalahan saat pengguna memasukkan data.

Validasi yang diterapkan antara lain:

Validasi ID Relawan

ID relawan menggunakan format:

R001
R002
R003

Jika pengguna memasukkan format yang tidak sesuai, program akan menampilkan pesan kesalahan.

Validasi ID Bencana

ID bencana menggunakan format:

B001
B002
B003

Validasi Nama

Nama tidak boleh dikosongkan.

Validasi Alamat

Alamat tidak boleh dikosongkan.

Validasi Nomor HP

Nomor HP harus:

Berupa angka.

Memiliki panjang 10–13 digit.


Validasi ID Duplikat

ID yang sudah digunakan tidak dapat digunakan kembali.

Contohnya jika R001 sudah terdaftar, pengguna tidak dapat membuat relawan baru dengan ID R001.

Validasi Penempatan

Saat membuat penempatan, program akan mengecek apakah ID relawan dan ID bencana tersedia.

Jika salah satu tidak ditemukan, penempatan tidak akan dibuat.


---

Pengembangan dari Mini Project 1

Mini Project 2 merupakan pengembangan dari Mini Project 1.

Beberapa bagian yang dikembangkan yaitu:

1. Encapsulation

Menambahkan atribut private serta getter dan setter.

2. Inheritance

Menambahkan:

RelawanMedis
RelawanLogistik

yang merupakan turunan dari Relawan.

3. Polymorphism

Menambahkan overriding pada method tampilkanInfo().

4. Validasi Input

Menambahkan validasi pada ID, nama, alamat, dan nomor HP.

5. Dummy Data

Menambahkan data awal relawan dan bencana.

6. Penempatan Relawan

Menambahkan fitur untuk menghubungkan relawan dengan bencana.

7. Menu Penempatan

Menambahkan menu khusus untuk melihat relawan yang menangani suatu bencana.

8. MVC Sederhana

Program dibagi menjadi Model, View, dan Controller agar kode lebih teratur.


---

Contoh Penggunaan Program

Ketika program dijalankan, pengguna akan melihat menu:

==================================
   SISTEM MANAJEMEN RELAWAN
          DAN BENCANA
==================================
1. Tampilkan Relawan
2. Tampilkan Bencana
3. Tambah Relawan
4. Tambah Bencana
5. Hapus Relawan
6. Hapus Bencana
7. Tambah Penempatan
8. Tampilkan Penempatan
9. Keluar
==================================
Pilih menu:

Contoh ketika menambahkan penempatan:

===== TAMBAH PENEMPATAN =====

Masukkan ID Relawan: R001
Masukkan ID Bencana: B001

Relawan berhasil ditempatkan.

Kemudian ketika memilih menu Tampilkan Penempatan:

===== PENEMPATAN RELAWAN =====

ID Relawan   : R001
Nama Relawan : Andi
ID Bencana   : B001
Bencana      : Banjir Samarinda
Lokasi       : Samarinda


---

Teknologi yang Digunakan

Program ini dibuat menggunakan:

Java sebagai bahasa pemrograman.

NetBeans sebagai IDE untuk membuat dan menjalankan program.

Maven untuk mengelola project Java.

Git untuk mengelola versi project.

GitHub untuk menyimpan repository project.



---

Cara Menjalankan Program

1. Buka project menggunakan NetBeans.


2. Pastikan semua package dan class sudah tersedia.


3. Jalankan file Main.java.


4. Pilih menu sesuai kebutuhan.


5. Masukkan data sesuai format yang diberikan.


6. Untuk mengakhiri program, pilih menu 9.




---

Identitas

Nama: Meilanie

Mata Kuliah: Pemrograman Berorientasi Objek

Mini Project: 2

Program: Sistem Manajemen Relawan Bencana

### Ini sudah lebih lengkap

Versi ini sudah menjelaskan **dari awal sampai akhir**, termasuk:

- tujuan program
- fitur
- alur
- struktur package
- fungsi setiap class
- MVC
- encapsulation
- inheritance
- polymorphism
- ArrayList
- dummy data
- validasi
- pengembangan dari MinPro 1
- contoh penggunaan
- teknologi
- cara menjalankan
- identitas

