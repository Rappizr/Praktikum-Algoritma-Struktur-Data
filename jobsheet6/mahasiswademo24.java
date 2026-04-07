package jobsheet6;

import java.util.Scanner;

public class mahasiswademo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        mahasiswaberprestasi24 list = new mahasiswaberprestasi24(jml);
        
        for(int i = 0; i < jml; i++) {
            System.out.println("------------------------------------");
            System.out.println("Input Data Mahasiswa ke-" + (i+1));
            System.out.print("Nama  : ");
            sc.nextLine(); 
            String nama = sc.nextLine();
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            
            mahasiswa24 m = new mahasiswa24(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        sc.close();
    }
}