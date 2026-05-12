package cm1;

public class buku24 {
    String kodeBuku, judul;
    int tahunTerbit;

    public buku24(){
    }

    public buku24(String kodeBuku, String judul, int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilBuku(){
       System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
