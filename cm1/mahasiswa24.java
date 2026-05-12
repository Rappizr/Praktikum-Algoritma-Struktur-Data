package cm1;

public class mahasiswa24 {
    String nim, nama, prodi;

    public mahasiswa24(){
    }

    public mahasiswa24 (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa(){
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }   
}
