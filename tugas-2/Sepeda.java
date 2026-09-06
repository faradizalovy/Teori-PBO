public class Sepeda {
    // Atribut
    String merk; //mendeklarasikan atribut merk dengan tipe data String. Atribut ini digunakan untuk menyimpan merek sepeda
    String warna;//mendeklarasikan atribut warna dengan tipe data String. Atribut ini digunakan untuk menyimpan warna sepeda
    int jumlahGigi; //endeklarasikan atribut jumlahGigi dengan tipe data int. Atribut ini digunakan untuk menyimpan jumlah gigi 
    //atau tingkat percepatan yang dimiliki sepeda

    // Constructor tanpa parameter
    public Sepeda() { //mendeklarasikan constructor tanpa parameter untuk class Sepeda. Constructor memiliki nama yang sama dengan 
    //nama class, yaitu Sepeda, dan tidak memiliki parameter karena tidak menerima data dari luar saat objek dibuat.
        merk = "Tidak diketahui"; //memberikan nilai awal "Tidak diketahui" pada atribut merk. Nilai tersebut digunakan karena 
        //ketika objek dibuat menggunakan constructor tanpa parameter, merek sepeda belum diberikan, sehingga program menggunakan 
        //nilai default untuk menunjukkan bahwa merek belum diketahui
        warna = "Tidak diketahui"; //memberikan nilai awal "Tidak diketahui" pada atribut warna. Nilai tersebut digunakan karena 
        //warna sepeda belum ditentukan ketika objek dibuat tanpa parameter, sehingga digunakan nilai default sebagai penanda 
        //bahwa informasi warna belum tersediamemberikan nilai awal 0 pada atribut jumlahGigi. Nilai 0 digunakan karena jumlah gigi 
        //sepeda belum ditentukan ketika objek dibuat menggunakan constructor tanpa parameter. Angka tersebut menjadi nilai default 
        //sebelum data jumlah gigi diberikan
    }
    // Constructor berparameter
    public Sepeda(String merk, String warna, int jumlahGigi) { //mendeklarasikan constructor berparameter untuk class Sepeda. 
    //Constructor ini memiliki tiga parameter, yaitu merk untuk menerima merek sepeda, warna untuk menerima warna sepeda, dan jumlahGigi 
    //untuk menerima jumlah gigi sepeda. Dengan constructor ini, objek sepeda dapat langsung dibuat menggunakan data yang sudah ditentukan.
        this.merk = merk; //digunakan untuk menyimpan nilai parameter merk ke dalam atribut merk milik objek Sepeda. Keyword this digunakan 
        //untuk menunjukkan bahwa merk di sebelah kiri merupakan atribut milik objek, sedangkan merk di sebelah kanan merupakan parameter 
        //yang diterima constructor.
        this.warna = warna; //digunakan untuk menyimpan nilai parameter warna ke dalam atribut warna milik objek Sepeda. Keyword this 
        //menunjukkan bahwa warna di sebelah kiri merupakan atribut objek, sedangkan warna di sebelah kanan merupakan parameter yang 
        //diberikan ketika objek dibuat.
        this.jumlahGigi = jumlahGigi; //digunakan untuk menyimpan nilai parameter jumlahGigi ke dalam atribut jumlahGigi milik objek Sepeda. 
        //Jadi, jumlah gigi yang diberikan ketika objek dibuat akan menjadi data yang dimiliki oleh objek tersebut
    }
    // Method
    public void kayuh() { //mendeklarasikan method bernama kayuh(). Method tersebut digunakan untuk menggambarkan perilaku sepeda ketika 
    //mulai digunakan atau dikayuh. Keyword void menunjukkan bahwa method ini tidak mengembalikan nilai.
        System.out.println("Sepeda mulai dikayuh."); //digunakan untuk menampilkan pesan "Sepeda mulai dikayuh." ke layar ketika method 
        //kayuh() dijalankan. Pesan tersebut menjadi representasi sederhana dari tindakan atau perilaku objek sepeda ketika mulai dikayuh
    }
    public void tampilkanData() { //mendeklarasikan method bernama tampilkanData(). Method ini digunakan untuk menampilkan seluruh data yang 
    //dimiliki oleh objek Sepeda, yaitu merek, warna, dan jumlah gigi
        System.out.println("Merek       : " + merk); //digunakan untuk menampilkan label "Merek" beserta nilai yang tersimpan pada atribut merk
        System.out.println("Warna       : " + warna);//digunakan untuk menampilkan label "Warna" beserta nilai yang tersimpan pada atribut warna
        System.out.println("Jumlah Gigi : " + jumlahGigi);//digunakan untuk menampilkan label "Jumlah Gigi" beserta nilai yang tersimpan pada atribut jumlahGigi
    }
}