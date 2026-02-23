package jobsheet2;

public class mahasiswa24 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public mahasiswa24() {
    }

public mahasiswa24(String nm, String nim, double ipk, String kls){
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas  = kls;
}

    void tampilkanInformasi () {
    System.out.println("NAMA: "+nama);
    System.out.println("NIM: "+nim);
    System.out.println("IPK: "+ipk);
    System.out.println("KELAS: "+kelas);
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        }else{
            System.out.println("IPK tidak valid harus rentan antara 0.0 sampai 4.0");
        }
    }
    String nilaiKinerja(){
        if(ipk>=3.5){
            return "kinerja sangat baik";
        }else if (ipk>=3.0) {
            return  "kinerja baik";
        }else if (ipk>=2.5) {
            return "kinerja cukup";
        }else{
            return "kinerja kurang";
        }
    }
}
