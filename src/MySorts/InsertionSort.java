package MySorts;

import interfaces.SortInterface;

public class InsertionSort implements SortInterface {
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currElem = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey] > currElem) {
                arr[prevKey + 1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey+1] = currElem;

        }
    }

    @Override
    public String toString() {
        return "Insertion Sort";
    }
}
