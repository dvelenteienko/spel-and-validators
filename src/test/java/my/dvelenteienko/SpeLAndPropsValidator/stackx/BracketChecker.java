package my.dvelenteienko.SpeLAndPropsValidator.stackx;

import java.util.Stack;

public class BracketChecker {

    private final String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < stackSize; i++) {
            Character ch = input.charAt(i);
            switch (ch) {
                case '{', '[', '(' -> stack.push(ch);
                case '}', ']', ')' -> {
                    if (!stack.isEmpty()) {
                        Character chp = stack.pop();
                        if (ch == '}' && chp != '{' ||
                            ch == ']' && chp != '[' ||
                            ch == ')' && chp != '(') {
                            System.out.println("Error '"+ch+"' at " + i);
                        }
                    } else {
                        System.out.println("Error '"+ch+"' at " + i);
                    }
                }
                default -> {}
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error missing right delimeter");
        } else {
            System.out.println("Brackets pairs is OK!");
        }
    }
}
