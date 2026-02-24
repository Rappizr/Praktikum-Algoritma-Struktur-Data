package jobsheet2;

public class dosen24 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public dosen24() {
    }

    public dosen24(String idDosen, String nama, String bidangKeahlian, boolean statusAktif, int tahunBergabung) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
    }

    void tampilkanInformasi(){
        System.out.println("ID Dosen : "+idDosen);
        System.out.println("Nama : "+nama);
        System.out.println("Bidang keahlian : "+bidangKeahlian);
        System.out.println("Status aktif : "+statusAktif);
        System.out.println("Tahun bergabung : "+tahunBergabung);
    }

    void setStatusAktif(boolean Status){
         statusAktif=Status;
    }

    int hitungMasaKerja(int tahunSekarang){
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Lama berkerja : "+masaKerja+" tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
