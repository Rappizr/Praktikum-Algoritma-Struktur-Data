package Jobsheet1;

import java.util.Scanner;

public class praktikumPerulangan24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nim anda: ");
        long nim = sc.nextLong();

        int n = (int)(nim % 100);
        if (n<10){
            n += 10;
        }
        System.out.println("Hasil : " +n);

        for(int i = 1;i <= n;i++){
            if (i == 10 || i == 15){
                continue;
            }
            if(i % 3 == 0){
                System.out.print("# ");
            }else if (i % 2 != 0){
                System.out.print("* ");
            }else{
                System.out.print(i + " ");
            }
        }

    }
    
}
