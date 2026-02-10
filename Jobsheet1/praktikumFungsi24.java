package Jobsheet1;

public class praktikumFungsi24 {
     public static void main(String[] args) {
       
        String [] namaBunga = {"Aglonema","Keladi","Alocasia","Mawar"};
        int[] harga = {75000,50000,60000,10000};
        int[][] stock = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9},
        };

        System.out.println("==========================================================");
        System.out.println("Laporan Pendapatan Cabang (Jika Semua Bunga Terjual)");
        System.out.println("==========================================================");
        System.out.println("Cabang\t\t\tPendapatan\tStatus");
        System.out.println("--------------------------------------------------------");
        tampilkanPendapatan(stock, harga);
    }
    
    public static void tampilkanPendapatan(int[][] stock, int[] harga) {
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += (stock[i][j] * harga[j]);
            }
            String status = (totalPendapatan > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.println("RoyalGarden " + (i + 1) + "\t\tRp " + totalPendapatan + "\t" + status);
        }
        System.out.println("==========================================================");
    }
    
}
