package GeeksForGeeks;

public class SumOfSquaresOfFirst_n_NaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfSquares(3));

    }

    public static int sumOfSquares(int number) {
        // code here
        int sum = 0;
        for (int i = 1; i<=number; i++){
            sum += i * i;

        }
        return sum;
    }
}
