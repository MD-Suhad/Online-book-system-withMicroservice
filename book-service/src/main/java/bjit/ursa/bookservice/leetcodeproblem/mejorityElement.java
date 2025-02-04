package bjit.ursa.bookservice.leetcodeproblem;

public class mejorityElement {
    public int majorityElement(int[] nums){
        int majorityElementOne = 0;
        int c = 0;
        for(int n: nums){
            if(majorityElementOne == c) c++;
            else if(c == 0) majorityElementOne= n;
            else c--;
        }
        return majorityElementOne;
    }
}
