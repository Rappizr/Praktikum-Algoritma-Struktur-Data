package p1jobsheet10;

public class antrianKRS24 {
    mahasiswaK24[] data;
    int front, rear, size, max;
    int totalSudahKRS = 0;
    int totalKapasitasDPA = 30; 
    public antrianKRS24(int n) {
        max = n;
        data = new mahasiswaK24[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean IsEmpty() { return size == 0; }
    public boolean IsFull() { return size == max; }

    public void tambahAntrian(mahasiswaK24 mhs) {
        if (!IsFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil mendaftar antrean.");
        } else {
            System.out.println("Antrean penuh!");
        }
    }

    public void panggilAntrianKRS() {
        if (size >= 2) {
            for (int i = 0; i < 2; i++) {
                System.out.print("Memproses KRS untuk: ");
                data[front].tampilkanData();
                front = (front + 1) % max;
                size--;
                totalSudahKRS++;
            }
        } else if (size == 1) {
            System.out.print("Hanya ada 1 mahasiswa. Memproses: ");
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            totalSudahKRS++;
        } else {
            System.out.println("Antrean kosong, tidak ada yang diproses.");
        }
    }

    public void lihat2Terdepan() {
        if (!IsEmpty()) {
            System.out.println("--- 2 Antrean Terdepan ---");
            int limit = Math.min(size, 2);
            for (int i = 0; i < limit; i++) {
                data[(front + i) % max].tampilkanData();
            }
        } else {
            System.out.println("Antrean kosong.");
        }
    }

    public void lihatAkhir() {
        if (!IsEmpty()) {
            System.out.print("Antrean terakhir: ");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrean kosong.");
        }
    }

    public void tampilkanSemua() {
        if (!IsEmpty()) {
            for (int i = 0; i < size; i++) {
                data[(front + i) % max].tampilkanData();
            }
        } else {
            System.out.println("Antrean kosong.");
        }
    }

    public void clear() {
        front = 0; rear = -1; size = 0;
        System.out.println("Antrean dikosongkan.");
    }

    public void cetakStatus() {
        int belumKRS = totalKapasitasDPA - totalSudahKRS;
        System.out.println("Jumlah dalam antrean saat ini : " + size);
        System.out.println("Jumlah sudah proses KRS       : " + totalSudahKRS);
        System.out.println("Sisa kuota mahasiswa DPA      : " + belumKRS);
    }
}