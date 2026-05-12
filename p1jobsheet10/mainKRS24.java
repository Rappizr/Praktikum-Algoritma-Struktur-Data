package p1jobsheet10;

import java.util.Scanner;

public class mainKRS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianKRS24 antrian = new antrianKRS24(10); 
        int pilih;

        do {
            System.out.println("\n=== SISTEM ANTREAN KRS MAHASISWA ===");
            System.out.println("1. Tambah Antrean Mahasiswa");
            System.out.println("2. Panggil Antrean (Proses 2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrean");
            System.out.println("4. Lihat 2 Antrean Terdepan");
            System.out.println("5. Lihat Antrean Terakhir");
            System.out.println("6. Cetak Status & Jumlah");
            System.out.println("7. Kosongkan Antrean");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antrian.tambahAntrian(new mahasiswaK24(nim, nama, prodi, kelas));
                    break;
                case 2: antrian.panggilAntrianKRS(); break;
                case 3: antrian.tampilkanSemua(); break;
                case 4: antrian.lihat2Terdepan(); break;
                case 5: antrian.lihatAkhir(); break;
                case 6: antrian.cetakStatus(); break;
                case 7: antrian.clear(); break;
            }
        } while (pilih != 0);
    }
}