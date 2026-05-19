package cm2;

public class doublelinkedlistpembeli24 {
    nodepembeli24 head, tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(pembeli24 data) {
        if (isEmpty()) {
            head = tail = new nodepembeli24(null, data, null);
        } else {
            nodepembeli24 newNode = new nodepembeli24(tail, data, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(pembeli24 data) {
        if (isEmpty()) {
            head = tail = new nodepembeli24(null, data, null);
        } else {
            nodepembeli24 newNode = new nodepembeli24(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addAt(int index, pembeli24 data) {
        if (index <= 1 || isEmpty()) {
            addFirst(data);
            return;
        }
        if (index > size) {
            addLast(data);
            return;
        }
        nodepembeli24 current = head;
        for (int i = 1; i < index - 1; i++) {
            current = current.next;
        }
        if (current == tail) {
            addLast(data);
        } else {
            nodepembeli24 newNode = new nodepembeli24(current, data, current.next);
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void addEvenPriority(pembeli24 data) {
        addAt(3, data);
    }

    public pembeli24 removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian Kosong!");
        }
        pembeli24 data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return data;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
            return;
        }
        System.out.println("=====================================");
        System.out.println("Daftar Antrian pembeli24");
        System.out.println("=====================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        nodepembeli24 current = head;
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s\n", current.data.noantrian, current.data.namapembeli, current.data.nohp);
            current = current.next;
        }
    }
}
