package Jobsheet1;

import java.util.Scanner;

public class PraktikumPemilihan24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program menghitung nilai akhir mahasiswa");
        System.out.println("==========================================");

        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan nilai uts: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan nilai uas: ");
        double uas = sc.nextDouble();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai yang dimasukkan harus antara 0 sampai 100");
        }else{
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            String grade;
            if (nilaiAkhir > 80) grade = "A";
            else if (nilaiAkhir > 73) grade = "B+";
            else if (nilaiAkhir > 65) grade = "B";
            else if (nilaiAkhir > 60) grade = "C+";
            else if (nilaiAkhir > 50) grade = "C";
            else if (nilaiAkhir > 39) grade = "D";
            else grade = "E";

            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + grade);
            System.out.println("================================");

            if (grade.equals("D") || grade.equals("E")){
                System.out.println("Maaf, anda tidak lulus");
            }else{
                System.out.println("Selamat, anda lulus");
            }
        }
        sc.close();
    }
}
