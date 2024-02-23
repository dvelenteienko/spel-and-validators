package my.dvelenteienko.SpeLAndPropsValidator;

public class AlgorithmTest {

    public static void main(String[] args) {

        long[] arr = {10, 12, 566, 54, 33, 23};

        ArrayMList arrayMList = new ArrayMList(5);
        arrayMList.insert(235);
        arrayMList.insert(12);
        arrayMList.insert(45);
        arrayMList.insert(2);
        arrayMList.insert(500);
        arrayMList.display();
        arrayMList.display();
        System.out.println(arrayMList.linearSearch(500));
        System.out.println(arrayMList.binarySearch(500));
//        arrayMList.bubbleSort();
        arrayMList.selectionSort();
        arrayMList.display();

    }

    static class ArrayMList {
        private long[] a;
        private int nElems;
        private final int max;

        public ArrayMList(int max) {
            this.max = max;
            a = new long[this.max];
            nElems = 0;
        }

        public void selectionSort() {
            int out, in ,min;
            for (out = 0; out < nElems - 1; out++) {
                min = out;
                for (in = out+1; in < nElems; in++) {
                    if (a[in] < a[min]) {
                        min = in;
                    }
                }
                swap(out, min);
            }
        }

        public void bubbleSort() {
            int in, out;
            for (out = nElems - 1; out > 1; out--) {
                for (in = 0; in < out; in++) {
                    if (a[in] > a[in + 1]) {
                        swap(in, in+1);
                    }
                }
            }
        }

        private void swap(int one, int two) {
            long temp = a[one];
            a[one] = a[two];
            a[two] = temp;
        }

        public boolean linearSearch(long searchKey) {
            int j;
            for (j = 0; j < nElems; j++) {
                if (this.a[j] == searchKey) {
                    return true;
                }
            }
            return false;
        }

        public int binarySearch(int searchValue) {
            int curPos;
            int upperBound = nElems - 1;
            int lowerBound = 0;

            while(true) {
                curPos = (lowerBound + upperBound) / 2;
                if (a[curPos] == searchValue) {
                    return curPos;
                } else if (lowerBound > upperBound) {
                    return nElems;
                } else {
                    if (a[curPos] < searchValue) {
                        lowerBound = curPos + 1;
                    } else {
                        upperBound = curPos - 1;
                    }
                }
            }
        }

        public void insert(long value) {
            if (this.nElems == this.max) {
                System.out.println("Cannot insert more than " + max + " elements");
                return;
            }
            this.a[nElems] = value;
            nElems++;
        }

        public boolean delete(long value) {
            int j;
            for(j=0; j<nElems; j++) {
                if (value == a[j])
                    break;
            }
            if(j==nElems) {
                return false;
            } else {
                nElems--;
                for(int k=j; k<nElems; k++) {
                    a[k] = a[k + 1];
                }
                return true;
            }
        }

        public void display(){
            for(int j=0; j<nElems; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }

    }


}
