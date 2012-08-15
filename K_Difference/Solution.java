/*
 Enter your code here. Read input from STDIN. Print output to STDOUT
 Your class should be named Solution
*/

import java.io.*;
import java.util.*;
public class Solution {
    public static int k_difference_pair(int[] nums, int n, int k) {
        int pair = 0;
        Arrays.sort(nums);
        
        int j = 1, v;
        for (int i=0; i<n-1; i++) {
            v = nums[i];
            while (v + k > nums[j] && j < n-1) 
                j ++;
            
            if (v + k == nums[j]) {
                pair ++;
                j ++;
            }
            
            if (j > n-1) 
                break;
        }
        return pair;
    }
    
    
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().trim().split(" ");
        int N = Integer.parseInt(line[0]), K = Integer.parseInt(line[1]);
        
        line = br.readLine().trim().split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) 
            nums[i] = Integer.valueOf(line[i]);
        
        System.out.println(k_difference_pair(nums, N, K)); 
    }
}
