package jobsheet11;

public class mahasiswa24 {
    String nim, nama, kelas;
    double ipk;

    public mahasiswa24() {
    }

    public mahasiswa24(String nim, String nama, String kls, double ip) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.print(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}