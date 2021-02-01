package ua.com.juja.core.crow;

import java.util.Date;
import java.util.Random;

public class WhiteCrowTest1 {
    public static void main(String[] args) {
        long start = new Date().getTime();
        int[] nums  = new int[100000];
        for (int index = 0; index < nums.length; index++) {
            nums[index] = new Random().nextInt(100);
        }
        int position = WhiteCrow2.find(nums);
        int expected = 6;
        if(position == expected){
            System.out.println("ok");
        } else {
            System.out.println("was: " + position + "but expected " + expected);
            System.out.println("fail");
        }
        long now = new Date().getTime();
        System.out.println("time in mills: " + (now - start));
    }
}
