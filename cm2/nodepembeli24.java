package cm2;

public class nodepembeli24 {
    pembeli24 data;
    nodepembeli24 prev, next;

    public nodepembeli24(nodepembeli24 prev, pembeli24 data, nodepembeli24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
