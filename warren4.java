// 906609
public class warren4 {
    //Largest Palindrome Product
    //  A palindromic number reads the same both ways. 
    //  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99
    //
    //  Find the largest palindrome made from the product of two 3-digit numbers.  
    public static void main(String[] args) {
        int biggestPalindrome = 0;
        for(int i = 999; i >= 800; i--) {
            for (int j = 999; j >= 800; j--) {
                int number = i * j;
                if(biggestPalindrome < number && isPalindrome(number)) {
                    biggestPalindrome = number;
                }
            }
        }
        System.out.println(biggestPalindrome);
    }

    private static boolean isPalindrome(int n) {
        String number = String.valueOf(n);
        String rev = "";
        for(int i = number.length() - 1; i >= 0; i--) {
            rev = rev + number.charAt(i);
        }
        if(rev.equals(number)) {
            return true;
        } else {
            return false;
        }
    }
}
