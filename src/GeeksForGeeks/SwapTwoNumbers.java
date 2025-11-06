package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        System.out.println(get(3, 4));
    }

    // a = 3 ; b = 4 swap => a => 4; b => 3
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> integers = new ArrayList<>();
        int temp = 0;

        temp = a; // 3

        a = b; // 4
        integers.add(a);
        b = temp; // 3
        integers.add(b);


        return integers;

    }
}
