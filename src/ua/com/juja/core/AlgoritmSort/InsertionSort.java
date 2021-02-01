package ua.com.juja.core.AlgoritmSort;

public class InsertionSort {
    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int current = array[i];
            int j = i - 1;
                while (j >= 0 && current < array[j]){
                array[j + 1] = array[j];
                j--;
                }
            array[j + 1] = current;
        }

    }

}
//for (int k = 1; k < arr.length; k++) {
//        int newElement = arr[k];
//        int location = k - 1;
//        while (location >= 0 && arr[location] > newElement) {
//        arr[location + 1] = arr[location];
//        location--;
//        }
//        arr[location + 1] = newElement;
//        }