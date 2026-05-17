package cm2;

public class doublelinkedlistpesanan24 {
    nodepesanan24 head, tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(pesanan24 data) {
        if (isEmpty()) {
            head = tail = new nodepesanan24(null, data, null);
        } else {
            nodepesanan24 newNode = new nodepesanan24(tail, data, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void sortByName() {
        if (isEmpty() || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            nodepesanan24 current = head;
            while (current.next != null) {
                if (current.data.namapesanan.compareToIgnoreCase(current.next.data.namapesanan) > 0) {
                    pesanan24 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan24 yang masuk!");
            return;
        }
        
        sortByName();
        
        System.out.println("=====================================");
        System.out.println("LAPORAN pesanan24 (URUT NAMA pesanan24)");
        System.out.println("=====================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode pesanan24", "Nama pesanan24", "Harga");
        
        nodepesanan24 current = head;
        long totalPendapatan = 0;
        
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.data.kodepesanan, current.data.namapesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("=====================================");
        System.out.println("Total Pendapatan: Rp " + totalPendapatan);
    }
}
