package cm2;

import java.util.Scanner;

public class main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublelinkedlistpembeli24 antrian = new doublelinkedlistpembeli24();
        doublelinkedlistpesanan24 daftarpesanan24 = new doublelinkedlistpesanan24();
        
        int counterAntrian = 1; 
        int menu;

        do {
            System.out.println("\n=====================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=====================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan pesanan24");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Nama pembeli24 : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    
                    pembeli24 p = new pembeli24(counterAntrian, nama, noHp);
                    antrian.addLast(p);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
                    counterAntrian++;
                    break;
                    
                case 2:
                    antrian.print();
                    break;
                    
                case 3:
                    try {
                        pembeli24 dipanggil = antrian.removeFirst();
                        System.out.println("\nPemanggilan Antrian atas nama " + dipanggil.namapembeli);
                        System.out.println("Silakan masukkan pesanan24:");
                        
                        System.out.print("Kode pesanan24 : ");
                        int kode = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Nama pesanan24 : ");
                        String namaPsn = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine(); 

                        pesanan24 psn = new pesanan24(kode, namaPsn, harga);
                        daftarpesanan24.addLast(psn);
                        
                        System.out.println(dipanggil.namapembeli + " telah memesan " + psn.namapesanan);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 4:
                    daftarpesanan24.printLaporan();
                    break;
                    
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Menu tidak valid. Silakan pilih kembali.");
            }
        } while (menu != 0);
        
        sc.close();
    }
}
