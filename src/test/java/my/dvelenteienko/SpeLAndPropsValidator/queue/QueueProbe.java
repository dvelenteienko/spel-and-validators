package my.dvelenteienko.SpeLAndPropsValidator.queue;

public class QueueProbe {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(10);
        queue.insert(3);
        queue.insert(12);
        queue.insert(1);
        queue.insert(55);
        queue.insert(13);
        queue.insert(3);
        queue.insert(44);
        queue.insert(34);
        queue.insert(100);
        queue.insert(1);
    }
}
