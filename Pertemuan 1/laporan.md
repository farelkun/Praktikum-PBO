# LAPORAN PRAKTIKUM 1
### Nama : Farel Putra Hidayat
### NIM : 2041723016
### Kelas : TI-2C

## Output Program

![Output 1](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/Output%20Tugas%20Praktikum.png?raw=true)

Hasil dari identifikasi benda yang dapat saya temukan di sekitar saya untuk dilaporkan sebagai tugas praktikum adalah

1. Objek Baju

![Objek Baju](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/objek%20baju.png?raw=true)

2. Objek Baju Main

![Objek Baju Main](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/objek%20baju%20main.jpg?raw=true)

3. Objek Baju Tidur

![Objek Baju Tidur](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/objek%20baju%20tidur.jpeg?raw=true)

4. Objek Kasur

![Objek Kasur](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/objek%20kasur.jpg?raw=true)

5. Objek Pintu

![Objek Pintu](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/objek%20pintu.jpeg?raw=true)

## Penjelasan Program

1. Baju.java

![Objek Pintu](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/code_baju.png?raw=true)

Pada class Baju berfungsi sebagai parent bagi objek BajuTidur dan BajuMain. Terdapat 2 atribut yaitu warna dan size. Terdapat juga 3 method yaitu setWarna, setSize, dan cetakStatus. Dimana method setWarna berfungsi untuk menyimpan data warna. Method setSize berfungsi untuk menyimpan data size. Dan method cetakStatus berfungsi untuk menampilkan data warna dan size.

2. BajuMain.java

![Objek Pintu](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/code_baju_main.png?raw=true)

Pada class BajuMain berfungsi sebagai child dari objek Baju. Terdapat 2 atribut yaitu merk dan bahan. Terdapat juga 3 method yaitu setMerk, setBahan, dan cetakStatus. Dimana method setWarna berfungsi untuk menyimpan data merk. Method setSize berfungsi untuk menyimpan data bahan. Dan method cetakStatus berfungsi untuk menampilkan method cetakStatus dari parent dan menampilkan data merk dan bahan.

3. BajuTidur.java

![Objek Pintu](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/code_baju_tidur.png?raw=true)

Pada class BajuTidur berfungsi sebagai child dari objek Baju. Terdapat 2 atribut yaitu merek dan jenisKain. Terdapat juga 3 method yaitu setMerek, setJenisKain, dan cetakStatus. Dimana method setMerek berfungsi untuk menyimpan data merek. Method setJenisKain berfungsi untuk menyimpan data jeniskain. Dan method cetakStatus berfungsi untuk menampilkan method cetakStatus dari parent dan menampilkan data merek dan jeniskain.

4. Kasur.java

![Objek Pintu](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/code_kasur.png?raw=true)

Pada class Kasur berfungsi sebagai parent bagi objek Pintu. Terdapat 2 atribut yaitu bahan dan lebar. Terdapat juga 3 method yaitu setBahan, setLebar, dan cetakStatus. Dimana method setBahan berfungsi untuk menyimpan data bahan. Method setLebar berfungsi untuk menyimpan data lebar. Dan method cetakStatus berfungsi untuk menampilkan data bahan dan lebar.

5. Pintu.java

![Objek Pintu](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/code_pintu.png?raw=true)

Pada class Pintu berfungsi sebagai child dari objek Kasur. Terdapat 2 atribut yaitu warna dan jumlahGagang. Terdapat juga 3 method yaitu setWarna, setJumlahGagang, dan cetakStatus. Dimana method setWarna berfungsi untuk menyimpan data warna. Method setJumlahgGagang berfungsi untuk menyimpan data jumlahgagang. Dan method cetakStatus berfungsi untuk menampilkan method cetakStatus dari parent dan menampilkan data warna dan jumlahgagang.

6. demo.java

![Objek Pintu](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan%201/img/code_demo.png?raw=true)

Pada class Demo berfungsi sebagai main/menampilkan semua objek yang telah dibuat. terdapat 5 objek yang akan dibuat yaitu objek Baju, BajuMain, BajuTidur, Kasur, dan Pintu. Pada setiap objek perlu menginputkan datanya satu persatu dan ditampilkan outputnya dengan cara memanggil method cetakStatus pada masing-masing objek.
