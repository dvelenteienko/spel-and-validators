package my.dvelenteienko.SpeLAndPropsValidator.linkedlist;

public class LinkList {

    private Link first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double data) {
        Link newLink = new Link(id, data);
        newLink.setNext(first);
        this.first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.getNext();
        return temp;
    }

    public Link findById(int id) {
        Link current = this.first;
        while (current.getId() != id) {
            if (current.getNext() == null) {
                return null;
            } else {
                current = current.getNext();
            }
        }
        return current;
    }

    public Link deleteById(int id) {
        Link current = this.first;
        Link previous = this.first;
        while (current.getId() != id) {
            if (current.getNext() == null) {
                return null;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        if (current == first) {
            first = first.getNext();
        } else {
            previous.setNext(current.getNext());
        }
        return current;
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
