package bjit.ursa.bookservice.leetcodeproblem;

public class mejorityElement {
    public int majorityElement(int[] nums){
        int m = 0;
        int c = 0;
        for(int n: nums){
            if(m == c) c++;
            else if(c == 0) m = n;
            else c--;
        }
        return m;
    }
}
