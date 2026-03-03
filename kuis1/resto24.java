package kuis1;

public class resto24 {
    String namamenu,kategori;
    Double harga;

    public resto24(String namamenu, String kategori, Double harga) {
        this.namamenu = namamenu;
        this.kategori = kategori;
        this.harga = harga;
    }
    
    String cetakInfo(){
        return "Nama Menu : " + namamenu + "\nKategori : " + kategori + "\nHarga : " + harga;
    }

     double diskon(double persen) {
        return harga - (harga * persen / 100);
    }

    // Method 2: Ubah harga
    boolean ubahHarga(double hargaBaru) {
        if (hargaBaru > 0) {
            harga = hargaBaru;
            return true;
        }
        return false;
    }

    // Method 3: Mengambil data dalam bentuk String
    String getData(String pemisah) {
        return namamenu + pemisah + kategori + pemisah + harga;
    }
}
