import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
        
        Set set = new HashSet();
        
        for (int num : nums) {
            set.add(num);
        }
        
        int answer = (set.size() < nums.length/2) ? set.size() : nums.length/2;
        return answer;
    }
}