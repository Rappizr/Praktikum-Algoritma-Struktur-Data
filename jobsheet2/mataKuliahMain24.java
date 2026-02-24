package jobsheet2;

public class mataKuliahMain24 {
    public static void main(String[] args) {
        mataKuliah24 matkul1 = new mataKuliah24();
        matkul1.nama = "Algoritma struktur data";
        matkul1.kodeMK = "ASD";
        matkul1.sks = 4;
        matkul1.jumlahJam = 8;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(2);
        matkul1.tambahJam(4);;
        matkul1.kurangjam(2);

        mataKuliah24 matkul2 = new mataKuliah24("kti", "konsep teknologi informasi", 2, 4);
        matkul2.tampilkanInformasi();
        matkul2.ubahSKS(4);
        matkul2.tambahJam(8);
        matkul2.kurangjam(4);
    }
}
