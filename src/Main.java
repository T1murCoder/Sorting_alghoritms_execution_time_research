import MySorts.BubbleSort;
import MySorts.InsertionSort;
import MySorts.QuickSort;
import interfaces.SortInterface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // int[] myArr = new int[]{1, 8, 6, 7, 5, 3, 4, 2, 9};



        System.out.println("100 Elements:" + "\n");

        int[] myArr100 = new int[100];
        fillArr(myArr100);

        sortTests(new BubbleSort(), Arrays.copyOf(myArr100, myArr100.length));
        sortTests(new InsertionSort(), Arrays.copyOf(myArr100, myArr100.length));
        sortTests(new QuickSort(), Arrays.copyOf(myArr100, myArr100.length));

        System.out.println("1000 Elements:" + "\n");

        int[] myArr1_000 = new int[1000];
        fillArr(myArr1_000);

        sortTests(new BubbleSort(), Arrays.copyOf(myArr1_000, myArr1_000.length));
        sortTests(new InsertionSort(), Arrays.copyOf(myArr1_000, myArr1_000.length));
        sortTests(new QuickSort(), Arrays.copyOf(myArr1_000, myArr1_000.length));

        System.out.println("10000 Elements:" + "\n");

        int[] myArr10_000 = new int[10000];
        fillArr(myArr10_000);

        sortTests(new BubbleSort(), Arrays.copyOf(myArr10_000, myArr10_000.length));
        sortTests(new InsertionSort(), Arrays.copyOf(myArr10_000, myArr10_000.length));
        sortTests(new QuickSort(), Arrays.copyOf(myArr10_000, myArr10_000.length));


    }

    public static void sortTests(SortInterface sortMethod, int[] arr) {
        System.out.println("Sort method: " + sortMethod);
        //printArr(arr);
        markExecutionTime(new BubbleSort(), arr);
        //printArr(arr);
        System.out.println();
    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandom();
        }
    }

    private static int getRandom() {
        return (int)(Math.random() * 100);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static long markExecutionTime(SortInterface sortMethod, int[] arr) {
        long start = System.nanoTime();
        sortMethod.sort(arr);
        long finish = System.nanoTime();
        System.out.println("Execution time: " + (finish - start));
        return finish - start;
    }
}