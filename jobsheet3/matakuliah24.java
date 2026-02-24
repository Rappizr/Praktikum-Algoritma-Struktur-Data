package jobsheet3;

import java.util.Scanner;

public class matakuliah24 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public matakuliah24(){

    }

    public matakuliah24(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahdata(Scanner sc){
        System.out.print("Kode : ");
        this.kode = sc.nextLine();
        System.out.print("Nama : ");
        this.nama = sc.nextLine();
        System.out.print("Sks : ");
        this.sks = sc.nextInt();
        System.out.print("Jumlah jam : ");
        this.jumlahJam = sc.nextInt();
        System.out.println("----------------------");
    }

    public void cetakinfo(){
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("Sks        : " + this.sks);
        System.out.println("Jumlah jam : " + this.jumlahJam);
        System.out.println("-------------------------------");
    }
}
