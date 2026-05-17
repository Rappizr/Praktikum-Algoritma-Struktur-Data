package cm2;

public class nodepesanan24 {
    pesanan24 data;
    nodepesanan24 prev, next;

    public nodepesanan24(nodepesanan24 prev, pesanan24 data, nodepesanan24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
