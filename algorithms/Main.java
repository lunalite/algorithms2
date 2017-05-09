package algorithms;

import algorithms.misc.NumGen;
import algorithms.search.BinarySearch;
import algorithms.search.BinarySearch.SEARCHABLE;
import algorithms.sort.MergeSort;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] t = NumGen.randG(100);
        printArray(t);
        MergeSort mergeSort = new MergeSort(t);
        mergeSort.sort();
        printArray(t);
        BinarySearch binarySearch = new BinarySearch(t);
        int x = binarySearch.search(12, SEARCHABLE.RECURSIVE);
        System.out.println(x);
    }

    public static void printArray(int[] _array) {
        int[] var1 = _array;
        int var2 = _array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int a = var1[var3];
            System.out.print(a + " ");
        }

        System.out.println("");
    }
}
