package jobsheet12;

import java.util.Scanner;

public class doublelinkedlist24 {
    node24 head;
    node24 tail;

    public doublelinkedlist24() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addfirst(mahasiswa24 data) {
        node24 newnode = new node24(data);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void addLast(mahasiswa24 data) {
        node24 newnode = new node24(data);
        if (isEmpty()) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void insertAfter(String keyNim, mahasiswa24 data) {
        node24 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        node24 newnode = new node24(data);

        if (current == tail) {
            newnode.prev = current;
            current.next = newnode;
            tail = newnode;
        } else {
            newnode.prev = current;
            newnode.next = current.next;
            current.next.prev = newnode;
            current.next = newnode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

public void print(){
    if (isEmpty()){
        System.out.println("linked list masih kosong");
        return;
    }

    node24 current = head;
    while(current !=null){
        current.data.tampil();
        current = current.next;
    }
}

public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked list masih kosong");
        return;
    }

    System.out.println("Menampilkan data dari belakang (Tail ke Head):");
    node24 current = tail; 
    
    while (current != null) {
        current.data.tampil();
        current = current.prev; 
    }
}

    // method ini saya buat sendirti karna di langkah" belumn ada
    public static mahasiswa24 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine(); 
        
        return new mahasiswa24(nim, nama, kelas, ipk);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        mahasiswa24 removedData = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data mahasiswa dengan NIM " + removedData.nim + " bernama " + removedData.nama + " berhasil dihapus.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        mahasiswa24 removedData = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data mahasiswa dengan NIM " + removedData.nim + " bernama " + removedData.nama + " berhasil dihapus.");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        doublelinkedlist24 list = new doublelinkedlist24();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data dari belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    mahasiswa24 mhsAwal = inputMahasiswa(scan);
                    list.addfirst(mhsAwal);
                    break;
                case 2:
                    mahasiswa24 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    mahasiswa24 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }
}