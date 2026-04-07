package jobsheet6;

import java.util.Scanner;

public class dosendemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        datadosen24 list = new datadosen24();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Semua Data");
            System.out.println("3. Sorting ASC (Usia Termuda - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia Tertua - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (P/W): ");
                    char jkChar = sc.next().charAt(0);
                    boolean jk = (jkChar == 'P' || jkChar == 'p');
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    
                    dosen24 d = new dosen24(kd, nm, jk, usia);
                    list.tambah(d);
                    break;
                case 2:
                    System.out.println("\nDaftar Dosen:");
                    list.tampil();
                    break;
                case 3:
                    list.sortingASC();
                    System.out.println("\nData berhasil diurutkan (ASC)!");
                    list.tampil();
                    break;
                case 4:
                    list.sortingDSC();
                    System.out.println("\nData berhasil diurutkan (DSC)!");
                    list.tampil();
                    break;
            }
        } while (pilih != 5);
        sc.close();
    }
    
}
