package jobsheet6;

public class mahasiswa24 {
    String nim, nama, kelas;
    double ipk;

    public mahasiswa24() {
    }

    public mahasiswa24(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilkanInformasi(){
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Kelas : "+kelas);
        System.out.println("Ipk : "+ipk);
    } 
}
