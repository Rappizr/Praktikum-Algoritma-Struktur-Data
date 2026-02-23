package jobsheet2;

public class mahasiswa24 {

  String nama, nim, kelas;
        double ipk;
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
      ipk = ipkBaru;
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
