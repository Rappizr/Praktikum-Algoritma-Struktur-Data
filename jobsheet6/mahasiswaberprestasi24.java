package jobsheet6;

public class mahasiswaberprestasi24 {
    mahasiswa24[] listMhs = new mahasiswa24[5];
    int idx = 0;

    public mahasiswaberprestasi24(int jumlah){
        listMhs= new mahasiswa24[jumlah];
    }

    public void tambah(mahasiswa24 mhs){
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil(){
        for (int i = 0; i<idx;i++){
            listMhs[i].tampilkanInformasi();
            System.out.println("------------------------");
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0;j<listMhs.length;j++){
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return  posisi;
    }
    
    void tampilPosisi(double  x, int pos){
        if (pos!=-1) {
            System.out.println("Data mahasiswa dengan IPK : "+x+" Ditemukan pada indeks "+pos);
        }else{
            System.out.println("Data "+x+"tidak ditemukan");
        }
    }

    void tampilDataSetSearch(double x, int pos){
        if (pos !=-1){
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        }else{
            System.out.println("Data mahasiswa dengan IPK "+x+" Tidak ditemukan");
        }
    }

    int findBinarySearch(double  cari, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            }else if (listMhs[mid].ipk<cari) {
                return findBinarySearch(cari, left, right);
            }else {
                return  findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
   
}
