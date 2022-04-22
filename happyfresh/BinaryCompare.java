package happyfresh;

import java.util.Arrays;
import java.util.Comparator;

public class BinaryCompare {
    public static void main(String args[]) {
        String[] cities = {"Bangalore", "Pune", "San fransisco", "New York City"};

        MySort ms = new MySort();
        Arrays.sort(cities, ms);
        System.out.println(Arrays.binarySearch(cities, "New York City"));
    }
    static class MySort implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
}
