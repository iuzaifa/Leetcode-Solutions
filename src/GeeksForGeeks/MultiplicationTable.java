package GeeksForGeeks;

import java.util.ArrayList;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getTable(n));

    }

    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 1; i<= 10; i ++){
            list.add(i*n);
        }
        return list;
    }
}
