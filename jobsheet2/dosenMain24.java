package jobsheet2;

public class dosenMain24 {
    public static void main(String[] args) {
        dosen24 dosen1 = new dosen24();
        dosen1.idDosen = "123";
        dosen1.nama = "Ariel";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Network";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("programmer");
        dosen1.tampilkanInformasi();
        System.out.println();

        dosen24 dosen2 = new dosen24("342", "Galih", "UI/UX", false, 2015);
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahKeahlian("Network");
        dosen2.tampilkanInformasi();
    }
    
}
