package ua.com.juja.core.AlgoritmSort;

public class SelectionSort {
    public static void selectionSort (int[] arr){
        for (int barrier = 0; barrier < arr.length; barrier++) {
            int pos = barrier;
            int min = arr[barrier];
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[index] < min ) {
                    pos = index;
                    min = arr[index];
                }
            }
            arr[pos] = arr[barrier];
            arr[barrier] = min;
        }
    }
}
//for (int barrier = 0; barrier < arr.length - 1; barrier++) {
//        for (int index = barrier + 1; index < arr.length; index++) {
//        if (arr[barrier] > arr[index]) {
//        int tmp = arr[index];
//        arr[index] = arr[barrier];
//        arr[barrier] = tmp;