package GeeksForGeeks;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(findSum(3));
    }

    public static int findSum(int n) {
        // code here
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;

        }
        return sum;
    }
}
