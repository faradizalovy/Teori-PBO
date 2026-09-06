public class KendaraanMain {

    public static void main(String[] args) { //Baris ini merupakan method main, yaitu bagian yang pertama kali dijalankan ketika program dijalankan
        
        // Membuat object Mobil dengan constructor tanpa parameter
        Mobil05 mobil1 = new Mobil05();//membuat sebuah objek bernama mobil1 dari class Mobil05.
        //bagian new Mobil05() memanggil constructor tanpa parameter yang ada di class Mobil05. 
        //Karena tidak ada data seperti merek, warna, dan jumlah pintu yang diberikan, maka objek mobil1 menggunakan nilai bawaan dari constructor

        // Membuat object Mobil dengan constructor berparameter
        Mobil05 mobil2 = new Mobil05("Toyota", "Hitam", 4); //embuat objek bernama mobil2 dari class Mobil05 menggunakan 
        //constructor berparameter Nilai tersebut kemudian disimpan ke atribut objek mobil2. Jadi, mobil2 memiliki data Toyota, warna Hitam, dan 4 pintu.

        // Membuat object Motor dengan constructor tanpa parameter
        Motor05 motor1 = new Motor05(); //membuat objek bernama motor1 dari class Motor05 dengan menggunakan constructor tanpa parameter. 
        //Karena tidak ada data yang diberikan saat objek dibuat, maka constructor menggunakan nilai bawaan

        // Membuat object Motor dengan constructor berparameter
        Motor05 motor2 = new Motor05("Honda", "Merah", 150); //embuat objek bernama motor2 dari class Motor05 menggunakan 
        //constructor berparameter. Jadi objek motor2 menyimpan data motor Honda berwarna merah dengan kapasitas mesin 150 cc

        // Membuat object Sepeda dengan constructor tanpa parameter
        Sepeda sepeda1 = new Sepeda(); //membuat objek bernama sepeda1 dari class Sepeda menggunakan constructor tanpa parameter

        // Membuat object Sepeda dengan constructor berparameter
        Sepeda sepeda2 = new Sepeda("Polygon", "Biru", 21); //Baris ini membuat objek bernama sepeda2 dari class Sepeda menggunakan 
        //constructor berparameter. Jadi objek sepeda2 memiliki data sepeda Polygon berwarna biru dengan 21 gigi.


        // Menampilkan data Mobil
        System.out.println("===== DATA MOBIL 1 =====");
        mobil1.tampilkanData(); //memanggil method tampilkanData() yang dimiliki oleh objek mobil1. Method tersebut akan menampilkan atribut mobil, yaitu
        //merk, warna, dan jumlah pintu
        mobil1.nyalakan();//memanggil method nyalakan() milik objek mobil1. Jadi, selain memiliki data, objek juga memiliki behavior/perilaku yang dapat 
        //dijalankan melalui method

        System.out.println();//digunakan untuk mencetak baris kosong pada output. Tujuannya agar hasil data mobil1 tidak langsung berdempetan dengan bagian 
        //data berikutnya sehingga output lebih mudah dibaca

        System.out.println("===== DATA MOBIL 2 =====");
        mobil2.tampilkanData(); //Baris ini memanggil method tampilkanData() dari objek mobil2
        mobil2.nyalakan(); //memanggil method nyalakan() milik objek mobil2. Program kemudian menampilkan pesan bahwa mobil dinyalakan

        System.out.println();

        // Menampilkan data Motor
        System.out.println("===== DATA MOTOR 1 =====");
        motor1.tampilkanData(); //memanggil method tampilkanData() dari objek motor1
        motor1.nyalakan(); //memanggil method nyalakan() milik objek motor1, sehingga program menampilkan pesan

        System.out.println();

        System.out.println("===== DATA MOTOR 2 =====");
        motor2.tampilkanData(); //memanggil method tampilkanData() milik motor2
        motor2.nyalakan();//memanggil method nyalakan() dari objek motor2. Program akan menampilkan pesan bahwa motor dinyalakan.

        System.out.println();

        // Menampilkan data Sepeda
        System.out.println("===== DATA SEPEDA 1 =====");
        sepeda1.tampilkanData(); //memanggil method tampilkanData() milik objek sepeda1
        sepeda1.kayuh();//memanggil method kayuh() milik objek sepeda1

        System.out.println();

        System.out.println("===== DATA SEPEDA 2 =====");
        sepeda2.tampilkanData();//memanggil method tampilkanData() milik objek sepeda2
        sepeda2.kayuh();//memanggil method kayuh() milik objek sepeda2
    }
}