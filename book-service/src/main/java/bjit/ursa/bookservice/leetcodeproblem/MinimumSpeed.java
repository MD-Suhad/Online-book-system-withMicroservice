package bjit.ursa.bookservice.leetcodeproblem;

public class MinimumSpeed {
    class Solution {

        static const int MAX_SPEED =INT_MAX/2;
        bool isReachable(vector<int> &dist,double hour, int currSpeed){
            double elapsed_time = 0.0;
            for(int i = 0; i < dist.size(); i++){
                if(i + 1 == dist.size()){
                    elapsed_time += 1.00*dist[i] / currSpeed;
                }else{
                    elapsed_time += (dist[i] + currSpeed-1) /currSpeed;
                }
            }
            return elapsed_time <= hour;
        }
        int minSpeedOnTime(vector<int>& dist, double hour) {

            int  L = 1;
            int R = INT_MAX/2;
            while(L<R){
                int M = L +(R -L)/2;
                if(isReachable(dist,hour,M) == false){
                    L = M +1;
                }else{
                    R = M;
                }
            }
            return L == MAX_SPEED ? -1:L;

        }
    };
}
