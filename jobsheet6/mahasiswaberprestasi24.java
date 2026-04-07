package jobsheet6;

public class mahasiswaberprestasi24 {
    
mahasiswa24 [] listMhs; 
public mahasiswaberprestasi24(int kuota) {
    listMhs = new mahasiswa24[kuota];
}
    int idx;

  
    void tambah (mahasiswa24 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

  
    void tampil (){
        for (mahasiswa24 m : listMhs){
            if (m != null) {
                m.tampilInformasi();
                System.out.println("------------------------------------");
            }
        }
    }

  
    void bubbleSort(){
        for (int i = 0; i < listMhs.length - 1; i++){
            for (int j = 1; j < listMhs.length - i; j++){
                if (listMhs[j] != null && listMhs[j-1] != null) {
                    if (listMhs[j].ipk > listMhs[j-1].ipk){
                        mahasiswa24 tmp = listMhs[j];
                        listMhs[j] = listMhs[j-1];
                        listMhs[j-1] = tmp;
                    }
                }
            }
        }
    }

    void selectionSort(){
        for (int i=0; i<listMhs.length-1;i++){
            int idxmin=i;
            for (int j=i+1; j<listMhs.length;j++){
                if (listMhs[j].ipk<listMhs[idxmin].ipk){
                    idxmin=j;
                }
            }
            mahasiswa24 tmp = listMhs[idxmin];
            listMhs[idxmin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i=1; i<listMhs.length; i++){
            mahasiswa24 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk){
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
}
    
