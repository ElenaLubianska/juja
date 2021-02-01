package ua.com.juja.core.crow;

public class WhiteCrowTest5 {
    public static void main(String[] args) {
        int[] nums  = {4, 3, 2, 1, 3, 1, 2};
        int position = WhiteCrow2.find(nums);
        int expected = 0;
        if(position == expected){
            System.out.println("ok");
        } else {
            System.out.println("fail");
        }
    }
}
