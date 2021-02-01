package ua.com.juja.core.crow;

public class WhiteCrowTest4 {
    public static void main(String[] args) {
        int[] nums  = {};
        int position = WhiteCrow2.find(nums);
        int expected = -1;
        if(position == expected){
            System.out.println("ok");
        } else {
            System.out.println("was: " + position + "but expected " + expected);
            System.out.println("fail");
        }
    }
}
