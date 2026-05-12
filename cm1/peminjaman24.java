package cm1;

public class peminjaman24 {
    mahasiswa24 mhs;
    buku24 buku;
    int lamaPinjam, batasPinjam = 5, terlambat, denda;

    public peminjaman24(mahasiswa24 mhs, buku24 buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }


    public void hitungDenda(){
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        }else{
            terlambat = 0;
            denda = 0;
        }
    }
    
    public void tampilPeminjaman(){
       System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}
