package jobsheet3;

public class datadosen24 {

    public static void datasemuadosen(dosen24[] arrayofdosen) {
        System.out.println("=== data semua dosen ===");
        int i = 1;
        for(dosen24 dsn : arrayofdosen){
            System.out.println("dosen ke- "+i);
            System.out.println("kode : "+dsn.kode);
            System.out.println("nama : "+dsn.nama);
            System.out.println("jenis kelamin : "+dsn.jenisKelamin);
            System.out.println("usia : "+dsn.usia);
            System.out.println("-------------------");
            i++;
        }
    }

    public static void jumlahdosenperjeniskelamin(dosen24[] arrayofdosen) {
        int pria = 0, wanita = 0;
        for(dosen24 dsn : arrayofdosen){
            if (dsn.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("jumlah dosen pria : "+pria);
        System.out.println("jumlah dosen wanita : "+wanita);
        System.out.println();
    }

    public static void reratadosenperjeniskelamin(dosen24[] arrayofdosen) {
        int totalusiapria = 0, totalusiawanita = 0, jmlpria = 0, jmlwanita = 0;
        for(dosen24 dsn : arrayofdosen){
            if (dsn.jenisKelamin) {
                totalusiapria += dsn.usia;
                jmlpria++;
            }else{
                totalusiawanita += dsn.usia;
                jmlwanita++;
            }
        }
        double ratapria =0;
        if (jmlpria > 0) {
            ratapria = (double) totalusiapria / jmlpria;
        }
        double ratawanita = 0;
        if (jmlwanita > 0) {
            ratawanita = (double) totalusiawanita / jmlwanita;
        }
        System.out.println("rerata usia dosen pria : "+ratapria);
        System.out.println("rerata usia dosen wanita : "+ratawanita);
        System.out.println();
    }

    public static void infoDosenPalingTua(dosen24[] arrayofdosen) {
        dosen24 palingTua = arrayofdosen[0];
        for (dosen24 dsn : arrayofdosen) {
            if (dsn.usia > palingTua.usia) palingTua = dsn;
        }
        String jk = (palingTua.jenisKelamin) ? "pria" : "wanita";
        System.out.println("dosen paling tua");
        System.out.println("Kode Dosen Paling Tua : " + palingTua.kode);
        System.out.println("Nama Dosen Paling Tua : "+palingTua.nama);
        System.out.println("Jenis Kelamin Dosen Paling Tua : "+jk);
        System.out.println("Usia Dosen Paling Tua : "+palingTua.usia);
        System.out.println("-----------------------------------");
        
    }

    public static void infoDosenPalingMuda(dosen24[] arrayOfDosen) {
        dosen24 palingMuda = arrayOfDosen[0];
        for (dosen24 dsn : arrayOfDosen) {
            if (dsn.usia < palingMuda.usia) palingMuda = dsn;
        }
        String jk = (palingMuda.jenisKelamin) ? "pria" : "wanita";
        System.out.println("dosen paling muda");
        System.out.println("Kode Dosen Paling Muda : " + palingMuda.kode);
        System.out.println("Nama Dosen Paling Muda : "+palingMuda.nama);
        System.out.println("Jenis Kelamin Dosen Paling Muda : "+jk);
        System.out.println("Usia Dosen Paling Muda : "+palingMuda.usia);
        System.out.println("-----------------------------------");
    }
}

