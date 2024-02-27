package my.dvelenteienko.SpeLAndPropsValidator.linkedlist;

import java.util.Random;
import java.util.UUID;

public class FirstLastLinkedList {

    private Link first;
    private Link last;

    public FirstLastLinkedList() {
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void insertFirst(int id, double data) {
        Link newLink = new Link(id, data);
        if (isEmpty()) {
            this.last = newLink;
        }
        newLink.setNext(this.first);
        this.first = newLink;
    }

    public void insertLast(int id, double data) {
        Link newLink = new Link(id, data);
        if (isEmpty()) {
            this.first = newLink;
        } else {
            this.last.setNext(newLink);
            this.last = newLink;
        }
    }

    public int deleteFirst() {
        int temp = this.first.getId();
        if(this.first.getNext() == null) {
            this.last = null;
        }
        this.first = this.first.getNext();
        return temp;
    }

    public void displayList()
    {
        System.out.println("List (first-->last): ");
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.getNext();
        }
        System.out.println();
    }
}
