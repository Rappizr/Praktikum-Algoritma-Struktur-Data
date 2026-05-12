// package jobsheet12;

// import java.util.Scanner;

// public class sllmain24 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         singlelinkedlist24 sll = new singlelinkedlist24();

//         System.out.println("--- Input Data Mahasiswa ---");
//         for (int i = 0; i < 4; i++) {
//             System.out.println("Data ke-" + (i + 1));
//             System.out.print("NIM   : ");
//             String nim = sc.nextLine();
//             System.out.print("Nama  : ");
//             String nama = sc.nextLine();
//             System.out.print("Kelas : ");
//             String kelas = sc.nextLine();
//             System.out.print("IPK   : ");
//             double ipk = sc.nextDouble();
//             sc.nextLine(); 

//             mahasiswa24 mhs = new mahasiswa24(nim, nama, kelas, ipk);
//             sll.addLast(mhs); 
//             System.out.println("-------------------------");
//         }

//         System.out.println("\n--- Hasil Verifikasi Percobaan ---");
//         sll.print(); 
//         System.out.println();

//         System.out.println("data index 1 : ");
//         sll.getData(1); 
        
//         System.out.print("data mahasiswa an Bimon berada pada index : ");
//         System.out.println(sll.indexOf("Bimon"));
//         System.out.println();

//         System.out.println("--- Menghapus data pertama dan terakhir ---");
//         sll.removeFirst();
//         sll.removeLast();
//         sll.print();
//         System.out.println();

//         System.out.println("--- Menghapus data pada indeks 0 ---");
//         sll.removeAt(0);
//         sll.print();

//         sc.close();
//     }
// }
package jobsheet11;

public class sllmain24 {
    public static void main(String[] args) {
        singlelinkedlist24 sll = new singlelinkedlist24();

        mahasiswa24 mhs1 = new mahasiswa24("24212200", "Alvaro", "1A", 4.0);
        mahasiswa24 mhs2 = new mahasiswa24("22212202", "Cintia", "3C", 3.5);
        mahasiswa24 mhs3 = new mahasiswa24("23212201", "Bimon", "2B", 3.8);
        mahasiswa24 mhs4 = new mahasiswa24("21212203", "Dirga", "4D", 3.6);

        sll.addFirst(mhs4); 
        sll.addLast(mhs1); 
        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(1, mhs2); 

        System.out.println("data index 1 : ");
        sll.getData(1);
        
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print(); 
        System.out.println();

        sll.removeAt(0);
        sll.print();
    }
}