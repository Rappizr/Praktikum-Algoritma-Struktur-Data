package jobsheet2;

public class mataKuliah24 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public mataKuliah24() {
    }

    public mataKuliah24(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi(){
        System.out.println("kode Matkul : " + kodeMK);
        System.out.println("Nama : "+nama);
        System.out.println("Sks : "+sks);
        System.out.println("Jumlah jam : "+jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("sks telah berubah");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangjam(int jam){
        if (jam > jumlahJam) {
            System.out.println("pengurangan jam tidak dapat dilakukan");
        }else {
            jumlahJam  -= jam;
            System.out.println("jumlah jam baru : "+jumlahJam);
        }
    }
}
