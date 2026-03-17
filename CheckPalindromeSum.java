public class CheckPalindromeSum {
    
   
    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    
    static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static void main(String[] args) {

        int num = 124;   
        while (true) {
            int rev = reverse(num);
            int sum = num + rev;

            if (isPalindrome(sum)) {
                System.out.println(sum);
                break;
            }

            num = sum;
        }
    }
}

