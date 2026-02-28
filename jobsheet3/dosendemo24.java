package jobsheet3;

import java.util.Scanner;

public class dosendemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dosen24 [] arrayofdaftardosen = new dosen24[3];

        for (int i = 0;i < arrayofdaftardosen.length;i++){
            System.out.println("Masukkan data dosen ke- "+(i+1));
            System.out.print("masukkan kode : ");
            String kode = sc.nextLine();
            System.out.print("masukkan nama : ");
            String nama = sc.nextLine();
            System.out.print("masukkan jenis kelamin (pria/wanita): ");
            String jk = sc.nextLine();
            System.out.print("masukkan usia : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------");

            boolean jenisKelamin = jk.equalsIgnoreCase("pria");
            arrayofdaftardosen[i] = new dosen24(kode, nama, usia, jenisKelamin);
        }

        datadosen24.datasemuadosen(arrayofdaftardosen);
        datadosen24.jumlahdosenperjeniskelamin(arrayofdaftardosen);
        datadosen24.reratadosenperjeniskelamin(arrayofdaftardosen);
        datadosen24.infoDosenPalingTua(arrayofdaftardosen);
        datadosen24.infoDosenPalingMuda(arrayofdaftardosen);
        sc.close();
    }
    
}
