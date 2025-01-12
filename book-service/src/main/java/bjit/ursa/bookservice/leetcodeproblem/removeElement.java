package bjit.ursa.bookservice.leetcodeproblem;

public class removeElement {
    public int removeElement(int[] nums, int val){
        int index = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
