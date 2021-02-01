package ua.com.juja.core.crow;

public class WhiteCrowTest2 {
    public static void main(String[] args) {
        int[] nums  = {1, 1};
        int position = WhiteCrow2.find(nums);
        int expected = -1;
        if(position == expected){
            System.out.println("ok");
        } else {
            System.out.println("fail");
        }
    }
}
