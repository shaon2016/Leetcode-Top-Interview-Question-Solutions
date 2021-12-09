package test_turing;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static int calPoints(String[] ops) {
        int result = 0;

        ArrayList<Integer> records = new ArrayList<>();

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C") ) {
                records.remove(records.size() - 1);
            } else if (ops[i].equals("D")) {
                records.add(records.get(records.size() - 1) * 2);
            } else if (ops[i].equals("+")) {
                records.add(records.get(records.size() - 1) + records.get(records.size() - 2));
            } else
                records.add(Integer.valueOf(ops[i]));
        }

        for (int item: records) {
            result +=item;
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] ops = sc.nextLine().split(" ");

        System.out.println(Solution.calPoints(ops));
    }
}
//
//public class Main {
//
//}