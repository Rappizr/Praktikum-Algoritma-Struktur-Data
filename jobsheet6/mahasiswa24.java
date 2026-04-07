package jobsheet6;

public class mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    mahasiswa24() {
    }

    // Konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    mahasiswa24(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.ipk = ip;
        this.kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
}
