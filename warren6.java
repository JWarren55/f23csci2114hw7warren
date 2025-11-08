// 25164150
public class warren6 {
    //Sum Square Difference
    // The sum of the squares of the first ten natural numbers is,
    // 1^2 + 2^2 + 3^2 + ... + 10^2 = 385
    // The square of the sum of the first ten natural numbers is,
    // (1 + 2 + ... + 100)^2 = 55^2 = 3025
    // Hence the difference between the sum of the squares of the first ten natural numbers
    // and the square of the sum is 3025 - 385 = 2640
    //
    // Find the difference between the sum of the squares of the first one hundred natural numbers
    // and the square of the sum.
    public static void main(String[] args) {

        // get the sum of all squared numbers form 1 to 100
        int squareSum = 0;
        for(int i = 1; i <= 100; i++) {
            int square = i * i;
            squareSum += square;
        }

        // square the sum of 1 to 100
        int sum = 0; 
        for(int j = 1; j <= 100; j++) {
            sum += j;
        }
        int sumSquare = sum * sum;

        //Subtract the squareSum from sumSquare
        int ans = sumSquare - squareSum;
        System.out.println(ans);
    }
}
