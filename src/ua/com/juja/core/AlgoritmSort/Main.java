package ua.com.juja.core.AlgoritmSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] Arr = {5, 0, 9, 3, 1};
      //  System.out.println(Arrays.toString(Arr));

//        BubbleSort.bubbleSort(Arr);

          InsertionSort.insertionSort(Arr);

//        Test.fun(Arr);

 //       SelectionSort.selectionSort(Arr);

//        Lab14.sort(Arr);

        Lab16.sort(Arr);
       System.out.println(Arrays.toString(Arr));
    }
}
