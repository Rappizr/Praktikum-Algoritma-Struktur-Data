package jobsheet11;

public class queuekemahasiswaan24 {
    node24 front, rear;
    int size;

    public queuekemahasiswaan24() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(mhs24 mhs) {
        node24 newNode = new node24(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
       
        System.out.println("Memanggil antrian: " + front.data.getInfo());
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }


public void peekFront() {
    if (isEmpty()) {
        System.out.println("Antrian kosong, tidak ada data terdepan.");
    } else {
        System.out.println("Mahasiswa Terdepan: " + front.data.getInfo());
    }
}


public void peekRear() {
    if (isEmpty()) {
        System.out.println("Antrian kosong, tidak ada data terakhir.");
    } else {
        System.out.println("Mahasiswa Terakhir: " + rear.data.getInfo());
    }
}

    public void displaySize() {
        System.out.println("Mahasiswa yang masih mengantre: " + size);
    }
}