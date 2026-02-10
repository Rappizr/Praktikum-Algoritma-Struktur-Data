package Jobsheet1;

import java.util.Scanner;

public class praktikumArray24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("==========================================");
        System.out.println("Program menghitung IP semester mahasiswa");
        System.out.println("==========================================");

        System.out.println("Masukkan jumlah matkul : ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();

        String[] namaMatkul = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        double[] nilaiAngka = new double[jumlahMatkul];
        String[] nilaiHuruf = new String[jumlahMatkul];
        double[] bobotNilai = new double[jumlahMatkul];

        for (int i =0;i <jumlahMatkul;i++){
            System.out.println("Data mata kuliah ke- " +(i+1));
            System.out.print("Nama mata kuliah : ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("Bobot sks : ");
            sks[i] = sc.nextInt();
            System.out.print("Masukkan nilai angka : ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100){
                nilaiHuruf[i] = "A";bobotNilai[i] = 4;
            }else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";bobotNilai[i] = 3.5;
            }else if (nilaiAngka[i] >65) {
                nilaiHuruf[i] = "B";bobotNilai[i] = 3;
            }else if (nilaiAngka[i] >60) {
                nilaiHuruf[i] = "C+";bobotNilai[i] = 2.5;
            }else if (nilaiAngka[i] >50) {
                nilaiHuruf[i] = "C";bobotNilai[i] = 2;
            }else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";bobotNilai[i] = 1;
            }else{
                 nilaiHuruf[i] = "E";bobotNilai[i] = 0;
            }
        }    

       System.out.println("\n==========================================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==========================================================================");
        System.out.println("MK\t\t\tSKS\tNilai Angka\tNilai Huruf\tBobot NIlai");

        double totalBobotSKS = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println(namaMatkul[i] + "\t\t\t" + sks[i] + "\t" + nilaiAngka[i] + "\t\t" + nilaiHuruf[i] + "\t\t" + bobotNilai[i]);
            
            totalBobotSKS += (bobotNilai[i] * sks[i]);
            totalSKS += sks[i];
        }

        double ip = totalBobotSKS / totalSKS;

        System.out.println("==========================================================================");
        System.out.println("Total SKS   : " + totalSKS);
        System.out.println("IP Semester : " + ip);
        System.out.println("==========================================================================");
    }
}
