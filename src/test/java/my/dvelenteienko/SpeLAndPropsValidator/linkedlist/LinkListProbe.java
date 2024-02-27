package my.dvelenteienko.SpeLAndPropsValidator.linkedlist;

public class LinkListProbe {

    public static void main(String[] args) {
        FirstLastLinkedList firstLastLinkedList = new FirstLastLinkedList();
        firstLastLinkedList.insertFirst(1,0.1);
        firstLastLinkedList.insertFirst(2,1.3);
        firstLastLinkedList.insertFirst(3,3.5);
        firstLastLinkedList.insertLast(4,4.8);
        firstLastLinkedList.displayList();

        LinkList linkList = new LinkList();
        linkList.insertFirst(1, 0.001);
        linkList.displayList();
    }
}
