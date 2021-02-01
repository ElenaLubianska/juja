package ua.com.juja.core;

public class ArrayUtils {
    public static int[] lookFor(int[] array) {
        int[] arr = {0, -1}; //не найден
        //int value = 0;

        int i_new;
        int k_new;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) { //{0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1}
                i_new = i;
                for (int k = i; k < array.length; k++) {
                    if (array[k] <= 0 | (k == array.length-1 && array[k] > 0)) {
                        k_new = array[k] <= 0 ? k-1 : k;
                        if (k_new - i_new > arr[1] - arr[0]) {
                            arr[0] = i_new;
                            arr[1] = k_new;
                        }
                        i = k;
                        break;
                    }
                }

            }
        }
        if (arr[1] == -1) {
            arr = new int[]{};
        }
        return arr;


//        break;
//            }
//            /*else if (array[i] < 0){
//                int[] arrSnd = {};
//                return arrSnd;
//            }*/
//        }
//        if (value == 0) {
//                int[] arrFst = {};
//                return arrFst;
//            }
//
//            arr[0] = 0;
//            arr[1] = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] > 0) {
//                    int size = 1;
//                    int p = 0;
//                    for (p = j + 1; (p < array.length) && (array[p] > 0); p++) {
//                        size++;
//                    }
//                    if (size > arr[1]) {
//                        arr[0] = j;
//                        arr[1] = p - 1;
//                        break;
//                    }
//                }
//            }
//            return arr;
//        }
    }
}


