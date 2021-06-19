package basic;

import java.util.Iterator;


public class InnerClass {

    private static final int SIZE = 15;
    private int[] arrayOfInt = new int[SIZE];


    public InnerClass() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInt[i] = i;
        }
    }

    public void printEvent() {
        dataTest customIterator = this.new EventIterate();

        while (customIterator.hasNext()) {
            System.out.print(customIterator.next()+" ");
        }
        System.out.println();

    }

    interface dataTest extends Iterator {

    }


    private class EventIterate implements dataTest {

        private int nextIndex = 0;


        @Override
        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {

            Integer retValue = Integer.valueOf(arrayOfInt[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        InnerClass inner = new InnerClass();
        inner.printEvent();
    }
}
