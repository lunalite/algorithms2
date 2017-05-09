package algorithms.misc;

public class NumGen {
    public NumGen() {
    }

    public static int[] randG(int size) {
        int[] arr = new int[size];

        for(int i = 0; i < size; ++i) {
            arr[i] = (int)(Math.random() * (double)size + 1.0D);
        }

        return arr;
    }

    public static int[] gAsc(int size) {
        int[] arr = new int[size];

        for(int i = 0; i < size; ++i) {
            arr[i] = i + 1;
        }

        return arr;
    }

    public static int[] gDesc(int size) {
        int[] arr = new int[size];

        for(int i = 0; i < size; ++i) {
            arr[i] = size--;
        }

        return arr;
    }
}