package cm1;

public class ruangbaca24 {
    mahasiswa24[] dafMahasiswa;
    buku24[] dafBuku;
    peminjaman24[] dafPeminjaman;

    public ruangbaca24(){
        dafMahasiswa = new mahasiswa24[]{
            new mahasiswa24("22001","Andi","Teknik Informatika"),
            new mahasiswa24("22002","Budi","Teknik Informatika"),
            new mahasiswa24("22003","Citra","Sistem Informasi Bisnis")
        };

        dafBuku = new buku24[]{
            new buku24("B001","Algoritma", 2020),
            new buku24("B002","Basis Data", 2019),
            new buku24("B003","Pemograman", 2021),
            new buku24("B004","Fisika", 2024)
        };

        dafPeminjaman = new peminjaman24[]{
            new peminjaman24(dafMahasiswa[0], dafBuku[0], 7),
            new peminjaman24(dafMahasiswa[1], dafBuku[1], 3),
            new peminjaman24(dafMahasiswa[2], dafBuku[2], 10),
            new peminjaman24(dafMahasiswa[2], dafBuku[3], 6),
            new peminjaman24(dafMahasiswa[0], dafBuku[1], 4)
        };
    }

    public  void tampilkanDaftarMahasiswa(){
        System.out.println("\nDaftar Mahasiswa : ");
        for (mahasiswa24 maha : dafMahasiswa) maha.tampilMahasiswa();
    }

    public void tampilkanDaftarBuku(){
        System.out.println("\nDaftar Buku : ");
        for (buku24 book : dafBuku) book.tampilBuku();
    }

    public  void tampilkanDaftarPeminjaman(){
        System.out.println("\nDaftar Peminjaman : ");
        for (peminjaman24 pemin : dafPeminjaman) pemin.tampilPeminjaman();
    }

    // algoritma insertion sort (denda terbesar)
    public void menampilkanDendaDiatasNol(){
        for (int i = 1;i<dafPeminjaman.length;i++){
            peminjaman24 key = dafPeminjaman[i];
            int j = i -1;
            while (j >= 0 && dafPeminjaman[j].denda < key.denda){
                dafPeminjaman[j+1] = dafPeminjaman[j];
                j = j -1;
            }
            dafPeminjaman[j +1] = key;
        }
        System.out.println("\nMenampilkan denda diatas Nol : ");
        for (peminjaman24 pemin : dafPeminjaman) {
            if (pemin.denda > 0) {
                pemin.tampilPeminjaman();
            }
        }
    }

    // metode untuk mengurutkan nim sebelum melakukan binary search
    private void urutkanBerdasarkanNim(){
        for (int i = 1;i<dafPeminjaman.length;i++){
            peminjaman24 key = dafPeminjaman[i];
            int j = i -1;
            while (j >= 0 && dafPeminjaman[j].mhs.nim.compareTo(key.mhs.nim) > 0){
                dafPeminjaman[j+1] = dafPeminjaman[j];
                j = j-1;
            }
            dafPeminjaman[j + 1] = key;
        }
    }

    //algoritma binary search untuk mencari nim
    public  void cariBerdasarkanNim(String nim){
        urutkanBerdasarkanNim();

        int left = 0, right = dafPeminjaman.length -1, ditemukanIndeks = -1;

        while (left <= right){
            int mid = left + (right - left)/2;
            int cmp = dafPeminjaman[mid].mhs.nim.compareTo(nim);

            if (cmp == 0){
                ditemukanIndeks = mid;
                break;
            }else if (cmp < 0) {
                left = mid +1;
            }else {
                right = mid -1;
            }
        }

        if (ditemukanIndeks != -1){
            int start = ditemukanIndeks;
            while (start > 0 && dafPeminjaman[start -1].mhs.nim.equals(nim)) start--;

            int end = ditemukanIndeks;
            while (end < dafPeminjaman.length -1 && dafPeminjaman[end +1].mhs.nim.equals(nim)) end++;
            System.out.println("Data ditemukan:");
            for (int i = start; i<=end;i++){
                dafPeminjaman[i].tampilPeminjaman();
            }
        }else{
            System.out.println("Data peminjaman dengan Nim "+nim+" tidak ditemukan.");
        }
    }
}
