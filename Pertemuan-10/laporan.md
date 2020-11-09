# Laporan Tugas Praktikum Pertemuan 10
### Nama : Farel Putra Hidayat
### NIM : 2041723016
### Kelas : TI-2C

A. Praktikum

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/Output.png?raw=true)

B. Diskusi

> Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!
* Tidak boleh, karena method pada indukclass sudah didelkarasikan, sehingga class child harus mengikuti mtehod yang ada di indukclass, jika tidak akan mengakibatkan program error
* Bukti

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/BuktiDiskusi1.png?raw=true)

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/BuktiDiskusi2.png?raw=true)

C. Pertanyaan

> 1. Berikan penjelasan terkait tentang jalannya program diatas

Program diatas memiliki 5 class, yaitu hewan yang merupakan abstract class dan parentclass, class ikan dan kucing yang merupakan child class, class Orang, dan main class. perlu diketahui, pada parent class terdapat pendeklarasian method, sehingga pada child class harus juga memakai method yang sama. sedangkan pada main class terdapat 4 objek, 1 ikan, 1 kucing, 2 orang.

> 2. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika method bergerak() diubah menjadi method abstract!

* Pada class hewan method bergerak sudah menjadi method abstract
* Apablia method bergerak pada class ikan dan kucing juga dirubah menjadi method abstract, akan mengakibatkan error. Hal ini terjadi karena method abstract tidak dapat meimiliki body

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/Pertanyaan2.1.png?raw=true)

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/Pertanyaan2.2.png?raw=true)

> 3.Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan overriding terhadap method bergerak() !

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/Pertanyaan3.1.png?raw=true)

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/Pertanyaan3.2.png?raw=true)

Masih tetap bisa berjalan, karena method di class Hewan hanya pendeklarasian saja 

> 4. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan overriding terhadap method bergerak()

> 5. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika abstract method bergerak()yang dideklarasikan dalam Class Ikan

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/Pertanyaan5.1.png?raw=true)

![DiagramClass](https://github.com/farelkun/Praktikum-PBO/blob/master/Pertemuan-10/img/Pertanyaan5.2.png?raw=true)

Apablia method bergerak pada class ikan dan kucing juga dirubah menjadi method abstract, akan mengakibatkan error. Hal ini terjadi karena method abstract tidak dapat meimiliki body
