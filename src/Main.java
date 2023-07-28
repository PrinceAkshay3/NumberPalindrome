public class Main {
    public static void main(String[] args) {
        int number = -121;
        System.out.println((isPalindrome(number) ? number + " is ": number + " is not ") + "Palindrome");
    }

    public static boolean isPalindrome(int number){

        int reverse =0;
        int copyNumber = number;

        while (number !=0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /=10;
        }
        return copyNumber == reverse;
    }
}
