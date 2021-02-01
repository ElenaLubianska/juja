package ua.com.juja.core.AlgoritmSort;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        boolean sorted  = false;
        int tmp;
        while(!sorted){
            sorted  = true;
            for( int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false;
                }
            }

        }

    }
}
