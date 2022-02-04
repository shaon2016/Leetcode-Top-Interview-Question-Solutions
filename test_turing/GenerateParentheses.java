package test_turing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses {

    public String reverseOnlyLetters(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); ++i) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j)))
                    j--;
                ans.append(S.charAt(j--));
            } else {
                ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }

    public static List<String> generateParenthesis(int n) {
        // Resultant list
        List<String> result = new ArrayList<>();
        /// Recursively generate parentheses
        generateParenthesiss(result, "", 0, 0, n);
        return result;
    }

    private static void generateParenthesiss(List<String> result, String s, int open, int close, int n) {
        // Base case
        if (open == n && close == n) {
            result.add(s);
            return;
        }
        // If the number of open parentheses is less than the given n
        if (open < n) {
            generateParenthesiss(result, s + "(", open + 1, close, n);
        }
        // If we need more close parentheses to balance
        if (close < open) {
            generateParenthesiss(result, s + ")", open, close + 1, n);
        }
    }

    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String[] ops = sc.nextLine().split(" ");
//
//        System.out.println(Solution.calPoints(ops));

        System.out.println(new GenerateParentheses().generateParenthesis(3));
    }
}