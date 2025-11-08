// 837799
public class warren14 {
    // Longest Collatz Sequence
    // The following iterative sequence is defined for the set of positive integers:
    // n --> n/2 (n is even)
    // n --> 3n + 1 (n is odd)
    // Using the rule above and starting with 13,
    // we generate the following sequence:
    // 13 --> 40 --> 20 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2--> 1
    // It can be seen that this sequence (starting at 13 and finishing at 1)
    // contains 10 terms. Although it has not been proved yet (Collatz Problem),
    // it is thought that all starting numbers finish at 1
    //
    // Which starting number, under one million, produces the longest chain?
    // NOTE: Once the chain starts the terms are allowed to go above one million.

    public static void main(String[] args) {
        int ans = 0;
        int mostSteps = 0;
        for(int i = 1_000_000; i > 500_000; i--) {
            int step = 1;
            long number = i;
            while(number > 1) {
                step++;
                if(number % 2 == 0) {
                    number = number/2;
                } else {
                    number = 3*number + 1;
                }
            }

            if(mostSteps < step) {
                ans = i;
                mostSteps = step;
            }
        }
        System.out.println(ans);
    }
}
