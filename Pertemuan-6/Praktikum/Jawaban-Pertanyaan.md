# Laporan Pertanyaan Praktikum Pertemuan 6
### Nama : Farel Putra Hidayat
### NIM : 2041723016
### Kelas : TI-2C

## Pertanyaan Percobaan 1
1.	Menambahkan extends ClassA pada ClassB.
2.	Penyebabnya yaitu pada attribute x dan y adalah kepemilikan dari ClassA sehingga perlu dilakukan extends ClassA pada ClassB sehingga pemanggilan attribute x dan y dapat dilakukan.

## Pertanyaan Percobaan 2
1.	Mengubah modifier pada attribute pada ClassA menjadi protected
2.	Penyebabnya yaitu karena modifier attribute pada ClassA adalah private sehingga hanya dapat di akses oleh classnya sendiri dan tidak dapat diakses oleh class lain.

## Pertanyaan Percobaan 3
1. Fungsi dari super yang berapa pada super.phi dan super.r adalah untuk mengisi variabel yang ada diluar class. Karena variabel phi dan r berada pada Bangun dan baru diisi didalam Tabung sehingga kita perlu menggunkan super untuk mengisi variabel phi dan r yang berada diluar Tabung. 
2. Fungsi "super" dan "this" pada method volume adalah sama sama memanggil variabel, tetapi "super" untuk memanggil variabel yang berada diluar class sedangkan untuk "this" memanggil variabel yang ada di dalam class.
3. Pada Class Tabung tidak dideklarasikan "phi" dan "r" tetapi class tersebut dapat mengakses atribut tersebut dikarenakan penggunan "super" pada atribut mereka. Karena fungsi "super" sendiri adalah mengisi variabel yang ada diluar class. Serta ditambahkannya extends Bangun yang digunakan sebagai jembatan atau penghubung dari Bangun dan Tabung sehingga atributnya juga dapat dideklarasi pada class Tabung.

## Pertanyaan Percobaan 4
1. 	superclass adalah ClassA

	  subclass adalah ClassB dan ClassC
    
	Hal tersebut dikarenakan ClassB dan ClassC maarupakan turunan atau mendapatkan warisan dari ClassA.
2. Tidak ada perubahan dari hasil outputnya, tetap sama dengan sebelumnya.
3. Terjadi eror apabila "super();" dituliskan setelah konstruktor dikarenakan objek akan mengeksekusi di konstruktor parentclass karena ClassC merupakan turunan dari ClassB dan ClassB adalah turunan dari ClassA.
4. Fungsi dari "super();" adalah agar dapat merujuk ke konstruktor parentclass.
