# Proyek Akhir Pemrograman Berbasis Objek 1

# Sistem Manajemen Travel Umrah dan Haji

## Deskripsi

Aplikasi **Sistem Manajemen Travel Umrah dan Haji** merupakan program berbasis Java yang dibuat untuk membantu pengelolaan data jamaah. Program ini dapat menerima input data jamaah seperti nama, NIK, jenis paket (Umrah atau Haji), dan lama perjalanan. Setelah data dimasukkan, program akan menghitung biaya perjalanan, menentukan fasilitas yang diperoleh, serta menampilkan informasi lengkap setiap jamaah.

Program ini menerapkan konsep-konsep dasar **Pemrograman Berbasis Objek (Object Oriented Programming/OOP)** seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output, Array, dan Error Handling.

---

# Penjelasan Kode

## 1. Class

Class merupakan blueprint atau cetakan untuk membuat object.

Pada aplikasi ini terdapat tiga class yaitu:

* `Jamaah`
* `JamaahTravel`
* `MainTravel`

```java
public class Jamaah {

}

public class JamaahTravel extends Jamaah {

}

public class MainTravel {

}
```

---

## 2. Object

Object merupakan hasil pembuatan dari sebuah class.

Pada program ini object dibuat dari class `JamaahTravel`.

```java
data[i] = new JamaahTravel(nama, nik, paket, hari);
```

---

## 3. Atribut

Atribut adalah variabel yang dimiliki oleh sebuah class.

Pada class `Jamaah` terdapat atribut:

```java
private String nama;
private String nik;
private String paket;
private int lamaHari;
```

---

## 4. Constructor

Constructor dijalankan ketika object dibuat.

```java
public Jamaah(String nama, String nik, String paket, int lamaHari) {
    this.nama = nama;
    this.nik = nik;
    this.paket = paket;
    this.lamaHari = lamaHari;
}
```

Pada class turunan:

```java
public JamaahTravel(String nama, String nik, String paket, int lamaHari) {
    super(nama, nik, paket, lamaHari);
}
```

---

## 5. Mutator (Setter)

Mutator digunakan untuk mengubah nilai atribut.

```java
public void setNama(String nama) {
    this.nama = nama;
}

public void setNik(String nik) {
    this.nik = nik;
}
```

---

## 6. Accessor (Getter)

Accessor digunakan untuk mengambil nilai atribut.

```java
public String getNama() {
    return nama;
}

public String getNik() {
    return nik;
}
```

---

## 7. Encapsulation

Encapsulation dilakukan dengan membuat atribut menjadi `private`, sehingga data hanya dapat diakses melalui method getter dan setter.

```java
private String nama;
private String nik;
private String paket;
private int lamaHari;
```

---

## 8. Inheritance

Class `JamaahTravel` mewarisi class `Jamaah` menggunakan keyword `extends`.

```java
public class JamaahTravel extends Jamaah {

}
```

Dengan inheritance, class `JamaahTravel` dapat menggunakan atribut dan method dari class `Jamaah`.

---

## 9. Polymorphism

### Overloading

Method memiliki nama yang sama tetapi parameter berbeda.

```java
public String tampilInfo() {

}

public String tampilInfo(String pembimbing) {

}
```

### Overriding

Method `tampilInfo()` pada class `JamaahTravel` menggantikan method dari class `Jamaah`.

```java
@Override
public String tampilInfo() {

}
```

---

## 10. Seleksi

Program menggunakan `if-else` untuk menentukan biaya berdasarkan paket yang dipilih.

```java
if (paket.equalsIgnoreCase("Umrah")) {
    return 35000000;
} else if (paket.equalsIgnoreCase("Haji")) {
    return 75000000;
} else {
    return 0;
}
```

Program juga menggunakan `switch` untuk menentukan fasilitas.

```java
switch (getPaket().toLowerCase()) {
    case "umrah":
        return "Hotel Bintang 4 + Bus + Makan";
    case "haji":
        return "Hotel Bintang 5 + Bus + Makan + Tenda Mina";
    default:
        return "Belum tersedia";
}
```

---

## 11. Perulangan

Program menggunakan perulangan `for` untuk menginput dan menampilkan data jamaah.

```java
for (int i = 0; i < data.length; i++) {

}
```

---

## 12. Input Output Sederhana

Input dilakukan menggunakan class `Scanner`, sedangkan output menggunakan `System.out.println()`.

```java
Scanner input = new Scanner(System.in);

System.out.print("Nama : ");
String nama = input.nextLine();

System.out.println(j.tampilInfo());
```

---

## 13. Array

Program menggunakan array object untuk menyimpan beberapa data jamaah.

```java
JamaahTravel[] data = new JamaahTravel[jumlah];
```

---

## 14. Error Handling

Program menggunakan `try-catch` untuk menangani kesalahan input.

```java
try {

    int jumlah = Integer.parseInt(input.nextLine());

} catch (Exception e) {

    System.out.println("Terjadi Kesalahan : " + e.getMessage());

}
```

---

# Usulan Nilai

|  No | Materi                 |  Nilai  |
| :-: | ---------------------- | :-----: |
|  1  | Class                  |    5    |
|  2  | Object                 |    5    |
|  3  | Atribut                |    5    |
|  4  | Constructor            |    5    |
|  5  | Mutator                |    5    |
|  6  | Accessor               |    5    |
|  7  | Encapsulation          |    5    |
|  8  | Inheritance            |    5    |
|  9  | Polymorphism           |    10   |
|  10 | Seleksi                |    5    |
|  11 | Perulangan             |    5    |
|  12 | Input Output Sederhana |    10   |
|  13 | Array                  |    15   |
|  14 | Error Handling         |    15   |
|     | **TOTAL**              | **100** |
