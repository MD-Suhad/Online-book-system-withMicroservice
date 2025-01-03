package bjit.ursa.bookservice.leetcode.array;

public class MovesZeros {
    public void movesZeroes(int[] nums){
        if(nums == null || nums.length == 0) return;
        int insertPos = 0;
        for(int num: nums){
            if(num != 0) nums[insertPos++] = num;
        }
        while (insertPos < nums.length){
            nums[insertPos++] = 0;
        }
    }
}
