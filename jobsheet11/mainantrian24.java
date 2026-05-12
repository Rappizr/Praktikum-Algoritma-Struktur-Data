package jobsheet11;

import java.util.Scanner;

public class mainantrian24 {
    public static void main(String[] args) {
        queuekemahasiswaan24 antrian = new queuekemahasiswaan24();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n--- MENU ANTRIAN KEMAHASISWAAN ---");
            System.out.println("1. Tambah Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Lihat Antrean Terdepan");
            System.out.println("4. Lihat Antrean Terakhir");
            System.out.println("5. Cek Jumlah Antrean");
            System.out.println("6. Kosongkan Semua");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            if (pilih == 1) {
                System.out.print("NIM  : "); String nim = sc.nextLine();
                System.out.print("Nama : "); String nama = sc.nextLine();
                antrian.enqueue(new mhs24(nim, nama));
            } else if (pilih == 2) {
                antrian.dequeue();
            } else if (pilih == 3) {
                antrian.peekFront();
            } else if (pilih == 4) {
                antrian.peekRear();
            } else if (pilih == 5) {
                antrian.displaySize();
            } else if (pilih == 6) {
                antrian.clear();
            }
        } while (pilih != 7);
        
        System.out.println("Program selesai.");
        sc.close();
    }
}