package moven;

import java.util.HashMap;
import java.util.Map;

class GFG {

    public int returnMax(int[] nums) {
        int i;
        int max = nums[0];

        for (i = 1; i < nums.length; i++)
            if (nums[i] > max)
                max = nums[i];

        return max;
    }

    public static int findDuplicateDiff(String str) {
        int i;

        int countA = 0;
        int countB = 0;


        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') countA++;
            else countB++;
        }

        return Math.abs(countA - countB);
    }

    public static String findDuplicatedChar(String my_input) {
        StringBuilder duplicates = new StringBuilder();
        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (; i < my_input.length(); i++) {
            if (map.containsKey(my_input.charAt(i))) {
                int currentValue = map.get(my_input.charAt(i));
                currentValue++;
                map.put(my_input.charAt(i), currentValue);
            } else  map.put(my_input.charAt(i), 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            if(value > 1) {
                duplicates.append(key);
            }
        }

        return duplicates.toString();
    }

    public static void main(String args[]) {
        System.out.println(GFG.findDuplicatedChar("improper"));
    }

}



