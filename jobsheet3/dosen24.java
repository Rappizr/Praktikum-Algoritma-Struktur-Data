package jobsheet3;

public class dosen24 {
    public String kode, nama;
    public int usia;
    public boolean jenisKelamin;

    public dosen24(String kode,String nama,int usia,boolean jenisKelamin){
        this.kode = kode;
        this.nama = nama;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
    }

    void cetakInfo(){
        System.out.println("kode : "+kode);
        System.out.println("nama : "+nama);
        System.out.println("usia : "+usia);
        System.out.println("jenis kelamin : "+jenisKelamin);
        System.out.println("-------------------------");
    }
    
}
