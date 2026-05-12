package p1jobsheet10;

public class mahasiswa24 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public mahasiswa24(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}