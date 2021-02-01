package ua.com.juja.core.crow;

public class WhiteCrow2 {

    public static final int ERROR_CODE = -1;

    public static int find(int[] array) {
        //создать массив такой же длины
        int[] second = new int [array.length];
        for (int index = 0; index < array.length; index++) {
           if (find(array, second, index)) {
               //инкрементить, когда пара нашлась
            } else {
               return index;
           }
        }
        return ERROR_CODE;
    }

    public static boolean find(int[] array, int[] second, int givenNumberPosition) {
        int findNumber = array[givenNumberPosition];
        boolean found = false;
        for (int index = 0; index < array.length; index++) {
            if (second[index] > 0 || givenNumberPosition == index) {
                continue;
            }
            if (array[index] == findNumber) {
                found = true;
                second[index] = 1;
            }
        }
        return found;
    }
}
