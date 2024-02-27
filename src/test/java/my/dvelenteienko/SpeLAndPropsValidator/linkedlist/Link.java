package my.dvelenteienko.SpeLAndPropsValidator.linkedlist;

public class Link {
    private int id;
    private double data;
    private Link next;

    public Link(int id, double data) {
        this.id = id;
        this.data = data;
        this.next = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public void displayLink() {
        System.out.println("{ID: " + id + ", data: " + data + "}");
    }
}
