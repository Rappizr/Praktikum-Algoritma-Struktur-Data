package Jobsheet1;
import java.util.Scanner;

public class Tugas224 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[][] jadwal = new String[n][4];
        inputJadwal(jadwal);
        tampilkanSemua(jadwal);
        
        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hariCari = sc.nextLine();
        cariBerdasarkanHari(jadwal, hariCari);
    }

    public static void inputJadwal(String[][] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah: "); j[i][0] = sc.nextLine();
            System.out.print("Ruang      : "); j[i][1] = sc.nextLine();
            System.out.print("Hari       : "); j[i][2] = sc.nextLine();
            System.out.print("Jam        : "); j[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanSemua(String[][] j) {
        System.out.println("\nSeluruh Jadwal Kuliah:");
        System.out.println("MK\t\tRuang\tHari\tJam");
        for (String[] r : j) {
            System.out.println(r[0] + "\t\t" + r[1] + "\t" + r[2] + "\t" + r[3]);
        }
    }

    public static void cariBerdasarkanHari(String[][] j, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        for (String[] r : j) {
            if (r[2].equalsIgnoreCase(hari)) {
                System.out.println(r[0] + " | " + r[1] + " | " + r[3]);
            }
        }
    }
}