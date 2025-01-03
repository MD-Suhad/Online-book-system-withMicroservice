package bjit.ursa.bookservice.leetcode.array;

import java.util.HashMap;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer,Integer> sum = new HashMap<>();
            for(int i = 0; i < nums.length;i++){
                int k = nums[i];
                int j = target - k;
                if(sum.containsKey(j)){
                    return new int[] {sum.get(j),i};
                }


                sum.put(k,i);
            }
            return new int[] {};









        }
    }
}
