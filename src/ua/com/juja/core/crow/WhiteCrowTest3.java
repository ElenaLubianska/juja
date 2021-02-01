package ua.com.juja.core.crow;

public class WhiteCrowTest3 {
    public static void main(String[] args) {
        int[] nums  = {1, 3, 2};
        int position = WhiteCrow2.find(nums);
        int expected = 0;
        if(position == expected){
            System.out.println("ok");
        } else {
            System.out.println("fail");
        }
    }
}
