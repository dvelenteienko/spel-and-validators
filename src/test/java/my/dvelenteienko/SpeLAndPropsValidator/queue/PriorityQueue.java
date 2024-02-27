package my.dvelenteienko.SpeLAndPropsValidator.queue;

public class PriorityQueue {

    private int maxSize;
    private long[] qArray;
    private int nItems;

    public PriorityQueue(int maxSize) {
        maxSize = maxSize;
        qArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) {
        int j;
        if (nItems == 0) {
            qArray[nItems++] = item;
        } else {
            for (j = nItems - 1; j >=0; j--) {
                if (item > qArray[j]) {
                    qArray[j + 1] = qArray[j];
                } else {
                    break;
                }
            }
                qArray[j+1] = item;
                nItems++;
        }
    }
}
