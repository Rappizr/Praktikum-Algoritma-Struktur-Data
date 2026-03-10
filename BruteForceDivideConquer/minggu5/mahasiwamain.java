package BruteForceDivideConquer.minggu5;

public class mahasiwamain {
    public static void main(String[] args) {

        mahasiswa[] mhs = {
            new mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new mahasiswa("Budi", "220101002", 2022, 85, 88),
            new mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new mahasiswa("Dian", "220101004", 2021, 76, 79),
            new mahasiswa("Eko", "220101005", 2023, 92, 95),
            new mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new mahasiswa("Gina", "220101007", 2023, 80, 83),
            new mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        int max = mahasiswa.maxUTS(mhs, 0, mhs.length - 1);
        int min = mahasiswa.minUTS(mhs, 0, mhs.length - 1);
        double rata = mahasiswa.rataUAS(mhs);

        System.out.println("Nilai UTS tertinggi : " + max);
        System.out.println("Nilai UTS terendah : " + min);
        System.out.println("Rata-rata nilai UAS : " + rata);
    }
}

