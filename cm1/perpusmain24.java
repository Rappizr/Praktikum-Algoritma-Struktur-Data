package cm1;

import java.util.Scanner;

public class perpusmain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //memanggil class ruang baca untuk kelola sistemnya
        ruangbaca24 sistemRuangBaca = new ruangbaca24();

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    sistemRuangBaca.tampilkanDaftarMahasiswa();
                    break;
                case 2:
                    sistemRuangBaca.tampilkanDaftarBuku();
                    break;
                case 3:
                    sistemRuangBaca.tampilkanDaftarPeminjaman();
                    break;
                case 4:
                    sistemRuangBaca.menampilkanDendaDiatasNol();
                    break;
                case 5:
                    System.out.print("\nMasukkan NIM : ");
                    String carinim = sc.next();
                    sistemRuangBaca.cariBerdasarkanNim(carinim);
                    break;
                case 0:
                System.out.println("Keluar dari sistem....");
                break;
                default:
                    System.out.println("pilihan tidak valid");
            }
    }while(pilihan !=0);
    sc.close();
}
}
