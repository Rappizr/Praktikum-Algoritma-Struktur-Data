package kuis1;

import java.util.Scanner;

public class restodemo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah menu yang ingin diinput: ");
        int jumlah = input.nextInt();
        input.nextLine();

        resto24[] dataMenu = new resto24[jumlah];

        // Input data
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput Data Menu ke-" + (i + 1));
            System.out.print("Nama Menu : ");
            String nama = input.nextLine();
            System.out.print("Kategori  : ");
            String kategori = input.nextLine();
            System.out.print("Harga     : ");
            double harga = input.nextDouble();
            input.nextLine();

            dataMenu[i] = new resto24(nama, kategori, harga);
        }

        int pilih;
        do {
            System.out.println("\n===== MENU PROSES =====");
            System.out.println("1. Tampilkan Semua Menu");
            System.out.println("2. Hitung Diskon");
            System.out.println("3. Ubah Harga");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("\nData Menu ke-" + (i + 1));
                        System.out.println(dataMenu[i].cetakInfo());
                    }
                    break;

                case 2:
                    System.out.print("Pilih menu ke berapa: ");
                    int indexDiskon = input.nextInt() - 1;
                    System.out.print("Masukkan persen diskon: ");
                    double persen = input.nextDouble();
                    double hargaDiskon = dataMenu[indexDiskon].diskon(persen);
                    System.out.println("Harga setelah diskon: " + hargaDiskon);
                    break;

                case 3:
                    System.out.print("Pilih menu ke berapa: ");
                    int indexUbah = input.nextInt() - 1;
                    System.out.print("Masukkan harga baru: ");
                    double hargaBaru = input.nextDouble();
                    boolean berhasil = dataMenu[indexUbah].ubahHarga(hargaBaru);
                    if (berhasil) {
                        System.out.println("Harga berhasil diubah!");
                    } else {
                        System.out.println("Gagal! Harga harus lebih dari 0.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 4);

        input.close();
    }
}