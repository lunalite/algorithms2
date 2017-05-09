package algorithms.sort;

import algorithms.misc.NumGen;

public class BubbleSort {
    int[] arr;

    public BubbleSort(int[] _arr) {
        this.arr = _arr;
    }

    public void sort() {
        int size = this.arr.length;

        for(int i = size - 1; i > 0; --i) {
            for(int j = size - 1; j > size - i - 1; --j) {
                if(this.arr[j - 1] > this.arr[j]) {
                    this.swap(j - 1, j);
                }
            }
        }

    }

    private void swap(int x, int y) {
        int temp = this.arr[y];
        this.arr[y] = this.arr[x];
        this.arr[x] = temp;
    }

    public static void main(String[] args) {
        int[] t = NumGen.randG(99999999);
        BubbleSort bubbleSort = new BubbleSort(t);
        bubbleSort.sort();
    }
}
