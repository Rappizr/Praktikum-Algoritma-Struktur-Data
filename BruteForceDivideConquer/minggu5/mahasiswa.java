package BruteForceDivideConquer.minggu5;

public class mahasiswa {
  String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Divide and Conquer untuk nilai UTS tertinggi
    public static int maxUTS(mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int lmax = maxUTS(arr, l, mid);
        int rmax = maxUTS(arr, mid + 1, r);

        return Math.max(lmax, rmax);
    }

    // Divide and Conquer untuk nilai UTS terendah
    public static int minUTS(mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int lmin = minUTS(arr, l, mid);
        int rmin = minUTS(arr, mid + 1, r);

        return Math.min(lmin, rmin);
    }

    // Brute Force rata-rata UAS
    public static double rataUAS(mahasiswa[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }

        return (double) total / arr.length;
    }
}