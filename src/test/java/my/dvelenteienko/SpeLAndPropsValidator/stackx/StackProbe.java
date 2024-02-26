package my.dvelenteienko.SpeLAndPropsValidator.stackx;

import java.sql.SQLOutput;
import java.util.Stack;

public class StackProbe {

    public static void main(String[] args) {
        StackOnArray stack = new StackOnArray(4);
        stack.push(20L);
        stack.push(40L);
        stack.push(10L);
        stack.push(5L);

        var peek = stack.peek();
        System.out.println("Stack peek: "+peek);
        System.out.println("Stack pop: ");
        while (!stack.isEmpty()) {
            var value = stack.pop();
            System.out.println(value);
        }

        Stack<Integer> integers = new Stack<>();
//        palindrome
        long temp, potentialPalindrome = 1234511111154321L;
        temp = potentialPalindrome;
        // wow! Length number calculation
        int length = (int) (Math.log10(potentialPalindrome) + 1);
        int odd = length % 2;
        if (odd != 0) {
            System.out.println("The number "+ potentialPalindrome + " is not a palindrome");
            return;
        }
//        double decs = Math.pow(10.0, ((double) halfLength));
//        int fstPart = (int) (potentialPalindrome / decs);


//        long reversed_n = 0;
//        while (potentialPalindrome > 0) {
//            reversed_n = reversed_n * 10 + potentialPalindrome % 10;
//            potentialPalindrome = potentialPalindrome / 10;
//        }



        StackOnArray pstack = new StackOnArray(length);
        int powDesc = length - 1;
        for (int i = 0; i < length; i++) {
            double decs = Math.pow(10.0, ((double) powDesc));
            int digit = (int) ((temp / decs) % 10);
            pstack.push((int) digit);
            powDesc--;
        }

        System.out.println("Palindrome: " + potentialPalindrome);
        System.out.println("Call stack...");
        var result = 0L;
        while (!pstack.isEmpty()) {
            result = (result * 10) + (long) pstack.pop();
        }
//        result = (long) (fstPart * decs + result);
        var palindrome = potentialPalindrome == result;
        System.out.println("Popped from stack: " + result);
        System.out.println("Is palindrome? ["+palindrome+"]");

        String bracketsMess = "({}{}{[][][][][]}{}{}({([])}))";
        BracketChecker bracketChecker = new BracketChecker(bracketsMess);
        bracketChecker.check();
    }
}
