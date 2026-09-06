public class Mobil05 { //digunakan untuk mendeklarasikan sebuah class bernama Mobil05 untuk membuat objek
    
    // Atribut (merupakan atribut yang digunakan untuk menyimpan data atau karakteristik dari objek Mobil05)
    String merk; //merk bertipe String digunakan untuk menyimpan merek mobil.
    String warna; //warna bertipe String digunakan untuk menyimpan warna mobil
    int jumlahPintu; //jumlahPintu bertipe int digunakan untuk menyimpan jumlah pintu mobil
    //atribut dapat dianggap sebagai state atau keadaan yang dimiliki oleh suatu objek.

    // Constructor tanpa parameter
    //Constructor memiliki nama yang sama dengan nama class, yaitu Mobil05, dan tidak memiliki nilai kembalian 
    //(return type).Constructor ini digunakan untuk memberikan nilai awal/default ketika objek Mobil05 dibuat 
    //tanpa memasukkan data.
    public Mobil05() {
        merk = "Tidak diketahui";// memberikan nilai awal "Tidak diketahui" pada atribut merk ketika objek 
        //dibuat tanpa parameter 
        warna = "Tidak diketahui"; //memberikan nilai awal "Tidak diketahui" pada atribut warna ketika objek 
        //dibuat tanpa parameter
        jumlahPintu = 0; //memberikan nilai awal 0 pada atribut jumlahPintu ketika objek dibuat tanpa parameter
    }

    // Constructor berparameter
    //digunakan untuk memberikan nilai atribut secara langsung ketika objek dibuat.
    public Mobil05(String merk, String warna, int jumlahPintu) {
        this.merk = merk; //berarti nilai merk yang diberikan melalui parameter akan disimpan ke atribut 
        //merk milik objek.
        this.warna = warna; //menyimpan nilai parameter warna ke dalam atribut warna milik objek Mobil05.
        this.jumlahPintu = jumlahPintu; //menyimpan nilai parameter jumlahPintu ke dalam atribut jumlahPintu 
        //milik objek Mobil05
    }
    // Method
    public void nyalakan() { //Bagian tersebut merupakan method bernama nyalakan(). Method digunakan untuk 
    //menggambarkan perilaku atau tindakan yang dapat dilakukan oleh objek mobil.
        System.out.println("Mobil dinyalakan."); //ketika method nyalakan() dipanggil, program akan menampilkan teks.
        //Method menggunakan kata kerja nyalakan sebagai nama karena method merepresentasikan suatu tindakan 
    }
    public void tampilkanData() { //Bagian tersebut merupakan method tampilkanData() yang digunakan untuk menampilkan 
    //seluruh data atau atribut objek mobil ke layar
        System.out.println("Merek        : " + merk); //digunakan untuk menampilkan nilai atribut merk
        System.out.println("Warna        : " + warna); //digunakan untuk menampilkan nilai atribut warna
        System.out.println("Jumlah Pintu : " + jumlahPintu); //digunakan untuk menampilkan nilai atribut jumlahPintu
    }
}