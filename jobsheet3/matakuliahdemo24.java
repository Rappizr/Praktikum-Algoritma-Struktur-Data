package jobsheet3;
import java.util.Scanner;

public class matakuliahdemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matakuliah24[] arrayOfMatakuliah = new matakuliah24[3];

        System.out.print("Masukkan jumlah matkul : ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            
            arrayOfMatakuliah[i] = new matakuliah24(); 
            
            arrayOfMatakuliah[i].tambahdata(sc);
            sc.nextLine(); 
        }

        System.out.println("\n========== DAFTAR MATAKULIAH ==========");
        for (int i = 0; i < jml; i++) {
            System.out.println("Data matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakinfo();
        }
        sc.close();
    }
}
