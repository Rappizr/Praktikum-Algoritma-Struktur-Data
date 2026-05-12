package p1jobsheet10;

public class mahasiswaK24 {
 String nim, nama, prodi, kelas;

    public mahasiswaK24(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " | " + nama + " | " + prodi + " | " + kelas);
    }
}