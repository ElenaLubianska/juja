package ua.com.juja.core.AlgoritmSort;

public class Test {
    public static void fun(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] < data[k + 1]) {
                swap(data, k, k + 1);
            }
        }
    }
    public static void swap(int[] array, int first, int second){
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
