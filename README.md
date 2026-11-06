# Tugas 2 Praktikum Pemrograman Berorientasi Objek

## Identitas
- **Nama Tugas:** Tugas 2 - Inheritance, Composition, dan Polimorfisme
- **Nama Mahasiswa:** Erdian Wijaya
- **NPM:** 250810701100068
- **Kelas Praktikum:** A
- **Tautan Repository:** https://github.com/Erdian99/Tugas2_Inherit-polymorph-2568/

---

## Deskripsi Singkat
Project ini merupakan implementasi dari berbagai konsep *Object-Oriented Programming* (OOP) tingkat lanjut menggunakan bahasa Java. Fokus utama dari tugas ini meliputi penerapan *inheritance* (pewarisan), *composition* (relasi *has-a*), *encapsulation*, dan *polymorphism* dalam ragam studi kasus. Mulai dari hierarki perangkat elektronik, validasi bangun datar, hingga simulasi keranjang belanja toko digital berbasis polimorfisme.

---

## Fitur Utama
- **Soal 1:** Menampilkan spesifikasi rinci dan menghitung persentase pajak serta potongan promo dari berbagai jenis perangkat elektronik (Laptop, Ponsel, Laptop Gaming) menggunakan turunan kelas.
- **Soal 2:** Mendemonstrasikan perilaku tipe statis dan dinamis pada objek hewan serta menangani kesalahan hierarki pada relasi *is-a* bangun datar secara aman.
- **Soal 3:** Mengkalkulasi jarak euclidean yang membentuk bentang panjang sebuah garis lurus dari dua titik koordinat (*composition*).
- **Soal 4:** Menghitung total harga belanja secara dinamis (mengakomodir ongkos kirim fisik dan diskon digital/langganan), merekap jumlah barang berdasarkan jenisnya, serta mencetak struk akhir tanpa *error* duplikasi.

---

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Pemilihan Konsep di Titik Tersebut |
| :--- | :--- | :--- |
| **Inheritance** | `Laptop extends Perangkat` | Memungkinkan kelas `Laptop` mendaur ulang atribut umum (merek, harga) dari `Perangkat` tanpa harus menulis ulang kodenya secara redundan. |
| **Protected Modifier**| Atribut `harga` di kelas `Perangkat` | Agar subclass (seperti `Laptop`) dapat langsung mengakses variabel tersebut untuk kalkulasi rumus `hitungHargaPromo()` secara mandiri. |
| **Composition** | Kelas `Garis` memiliki atribut `Titik` | Secara logis, garis dibentuk dari gabungan titik-titik (relasi *has-a*), sehingga garis menggunakan objek titik, bukan mewarisi sifat titik. |
| **Polymorphism** | Method `hitungTotal()` di kelas `Keranjang` | JVM secara otomatis menentukan implementasi method `hitungHargaAkhir()` sesuai tipe aktual objek produk pada saat *runtime* tanpa memerlukan *if-else*. |
| **Safe Downcasting**| Method `hitungPerJenis()` di kelas `Keranjang` | Memastikan objek dikonversi ke sub-tipe yang tepat secara aman (bebas `ClassCastException`) dengan mengecek via `instanceof` terlebih dahulu. |

---

## Struktur Project
```text
Tugas2_Inherit-polymorph-2568/
├── .gitignore
├── README.md
└── src/
    ├── soal1/
    │   ├── Perangkat.java, Laptop.java, Ponsel.java, LaptopGaming.java
    │   └── TesSoal1.java
    ├── soal2/
    │   ├── Hewan.java, Kucing.java, A.java, B.java, Lingkaran.java, Titik.java
    │   └── TesSoal2.java
    ├── soal3/
    │   ├── Titik.java, Garis.java
    │   └── TesSoal3.java
    └── soal4/
        ├── Produk.java, ProdukFisik.java, ProdukDigital.java, Langganan.java, Keranjang.java
        └── TesSoal4.java
```
## Cara Menjalankan Program
Prasyarat: Menggunakan Java Development Kit (JDK) versi 17 atau lebih baru, dan disarankan menggunakan code editor seperti Visual Studio Code (VS Code) atau IntelliJ IDEA.

Lewat IDE (VS Code / IntelliJ):
Buka file TesSoal1.java (atau file Test di soal lainnya), lalu klik tombol Run / Debug kecil yang berada di atas method public static void main. Extension IDE akan otomatis mengompilasi dan mengeksekusi program.

Lewat Command Line (CLI):
Buka terminal, masuk ke direktori tempat source code berada, lalu jalankan perintah kompilasi seluruh package:
```text
cd src/soal1
javac *.java
java TesSoal1
```
## Jawaban Soal dan Analisis Konsep
### Jawaban Soal 1
Jika modifier variabel harga pada superclass Perangkat diubah menjadi private, maka akan memicu error saat tahap kompilasi (Compile-time error) pada kelas Laptop yang berbunyi harga has private access in Perangkat. Error ini terjadi karena sifat dari modifier private yang membatasi akses variabel agar hanya dikenali di dalam kelas tempat ia dideklarasikan (enkapsulasi ketat). Subclass Laptop tidak memiliki izin akses langsung ke dalam privasi superclass-nya.

### Jawaban Soal 2
#### Bagian A:

1. Output lengkap program:Hewan dibuat: TomTom makanmeongKucing dibuatTom memanjat

2. Jika komentar pada baris h.panjat(); dihapus, program akan mengalami Compile-time error. Alasannya, referensi dari variabel h bertipe Hewan (Tipe Statis). Kompiler hanya mendeteksi method yang tersedia di dalam kelas referensi Hewan. Karena method panjat() tidak pernah dideklarasikan di dalam kelas Hewan, kompilasi akan digagalkan, meskipun tipe dinamisnya (objek aslinya) adalah Kucing.**

3. Error ClassCastException disebabkan oleh baris: Kucing k2 = (Kucing) h2;. Solusi perbaikan:
```text
Java
if (h2 instanceof Kucing) {
    Kucing k2 = (Kucing) h2;
    k2.panjat();
}
```
4. Pada eksekusi h.makan(), method suara() yang dijalankan adalah milik kelas Kucing. Tipe statis variabel h memang Hewan, namun tipe dinamisnya di memori adalah Kucing. Melalui prinsip dynamic method dispatch (polimorfisme), Java akan selalu mengeksekusi implementasi overridden paling spesifik dari objek aslinya saat runtime.

#### Bagian B:
5. Prediksi Output: A dibuat -> init B, nilai=0 -> B dibuat, nilai=5.Penjelasan: Angka 0 muncul di awal karena saat objek B dipanggil, rantai konstruksi mengeksekusi constructor superclass A terlebih dahulu. Di dalam constructor A, terdapat panggilan method init() yang bersifat polimorfik, sehingga memicu method init() milik kelas B berjalan. Namun, pada fase ini, variabel instansiasi di subclass (variabel nilai=5) belum sempat diinisialisasi oleh sistem. Risikonya, program dapat memanipulasi objek yang status/nilainya cacat (belum siap sedia) karena tereksekusi secara prematur.

#### Bagian C:
6. l3.luas() menghasilkan 0.0 karena terjadinya polimorfisme (dynamic method dispatch); meskipun referensinya Lingkaran, objek aktual yang diinstansiasi adalah Titik.
Relasi "Titik adalah sebuah Lingkaran" sangat tidak masuk akal. Desain ini melanggar Liskov Substitution Principle (LSP) karena titik cacat secara perilaku jika disubstitusi sebagai lingkaran. Konsekuensinya fatal: jika sebuah method fungsi matematika memakan parameter Lingkaran sebagai pembagi (dengan asumsi luas selalu > 0), ia akan mogok (Divide by Zero Exception) jika tanpa sengaja menerima asupan objek Titik.

### Jawaban Soal 3
1. Prediksi Output: (100.0, 1.0)-(5.0, 5.0). Hal ini terjadi akibat aliasing (referensi memori). Kelas Garis menyimpan alamat memori yang persis sama dengan objek t. Jika t di luar diubah, isi di dalam Garis ikut terdampak seketika.

2. Perbaikan Defensive Copy: Mengubah constructor di kelas Garis menjadi this.awal = new Titik(awal.getX(), awal.getY());. Setelah diperbaiki, output akan mengamankan nilai aslinya, tercetak: (1.0, 1.0)-(5.0, 5.0).

3. Perilaku pertama (aliasing) tepat digunakan untuk perangkat lunak pemodelan 3D, fisika dinamika, atau aplikasi desain CAD, di mana garis yang menempel pada sebuah titik simpul harus mengikuti secara otomatis bila titik tersebut digeser (tersinkronisasi). Perilaku kedua (defensive copy) lebih cocok untuk aplikasi riwayat log, sistem penyimpanan, atau garis penunjuk statis yang bersyarat immutable (sekali terbuat, komponennya tidak boleh dicemari intervensi eksternal).

4. Jika Garis men-extends Titik, hierarki logika dasar berorientasi objek rusak berantakan. Garis memiliki kumpulan dua titik ujung, bukan garis adalah sejenis titik tunggal raksasa. Penggunaan relasi is-a (extends) di skenario ini akan membingungkan programmer lain akibat mewariskan atribut yang tidak seharusnya diturunkan.

#### Analisis Konsep
1. Perbedaan Method Overriding dan Overloading:Overriding adalah mekanisme menimpa (mendefinisikan ulang) perilaku method superclass di dalam subclass dengan menggunakan kerangka parameter yang 100% sama persis (contoh: @Override deskripsi() pada kelas ProdukFisik). Hal ini merepresentasikan fondasi dari polimorfisme dinamis (runtime). Sebaliknya, Overloading berarti membikin method bernama serupa namun dibedakan oleh struktur jumlah/tipe parameter di dalam satu kelas yang sama (contoh: Constructor kelas Garis yang memiliki 2 opsi asupan). Ini merupakan penerapan polimorfisme pasif (compile-time).

2. Kapan memilih Inheritance dan kapan memilih Composition:
Konsep Inheritance mutlak dipakai ketika dua entitas memiliki ikatan "adalah spesies/cabang spesifik dari" (is-a relationship), contohnya: LaptopGaming mewarisi Laptop di Soal 1, karena laptop gaming secara mutlak masih dihitung sebagai laptop seutuhnya. Namun, Composition lebih cerdas dipilih untuk menjahit relasi "memiliki komponen berupa" (has-a relationship), contoh: Keranjang menampung kelas koleksi Produk. Keranjang bukanlah turunan dari produk itu sendiri, melainkan wadah yang merangkai komponen.

3. Analisis instanceof di Soal 4:
Method cetakStruk() bersifat buta tipe (type-blind) dan tidak butuh instanceof karena beban komputasinya diserahkan pada polymorphism. JVM otomatis me-routing eksekusi hitungHargaAkhir() ke subclass aktual produk masing-masing secara swadaya. Di sisi lain, method hitungPerJenis() wajib menggunakan instanceof karena tugas khususnya murni menyortir dan melakukan sensus tipe referensi memori (type checking), bukan menyuruh objek bertindak. Praktik downcasting selalu rawan secara fundamental karena ia memaksa kompilator mempercayai janji programmer atas asimilasi hierarki, dan JVM akan seketika melempar ClassCastException jika janji kesesuaian cetakan aslinya terbukti fiktif di memori.

## Batasan dan Pengembangan Lanjutan
Batasan: Model data belum terintegrasi secara persisten dengan Database (seperti Oracle/PostgreSQL) sehingga seluruh daftar Keranjang berpotensi lenyap jika sesi program dimatikan.

Pengembangan Opsional: Ke depannya, toko digital mampu diekspansi untuk mengakomodasi fitur ProdukBundel (menyimpan rekursif List Produk) guna memberikan bonus dan persentase kombinasi diskon ganda (bundling promo) berdasarkan jumlah item lintas subclass.

