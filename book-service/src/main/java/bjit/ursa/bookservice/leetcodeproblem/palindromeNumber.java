package bjit.ursa.bookservice.leetcodeproblem;

public class palindromeNumber {
    public int reverse(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        if(x % 10 === 0){
            return false;
        }
        int str = String(x);
        int i = 0;
        int j = str.length-1;
        while(i<j){
            if(str[i] !== str[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
