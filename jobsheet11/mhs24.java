package jobsheet11;

public class mhs24 {
    
    String nim, nama;

    public mhs24(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getInfo() {
        return "NIM: " + nim + " | Nama: " + nama;
    }
}
