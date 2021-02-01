package ua.com.juja.core.AlgoritmSearch;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] myArr = new int[10];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = new Random().nextInt(30);
        }
        System.out.println(Arrays.toString(myArr));
        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));

        int indexLine = LinearSearch.linearSearch(myArr, 1);
        System.out.println(indexLine);

//        int indexBinary = BinarySearch.binarySearch(myArr, 1);
//        System.out.println(indexBinary);

        //Arrays.binarySearch(myArr, 1);
    }
}
