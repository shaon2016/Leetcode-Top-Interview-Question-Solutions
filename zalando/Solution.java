package zalando;

import java.util.*;
class Solution {
     
    public static void main(String[] args)
    {
        int arr[] = { 2,-2,3,0,4,-7};
        int k = 0;
        int n = arr.length;
        int res = 0;
         
        // calculate all subarrays
        for (int i = 0; i < n; i++) {
             
            int sum = 0;
            for (int j = i; j < n; j++) {
                 
                // calculate required sum
                sum += arr[j];
                 
                // check if sum is equal to
                // required sum
                if (sum == k)
                    res++;
            }
        }
        System.out.println(res);
    }
}