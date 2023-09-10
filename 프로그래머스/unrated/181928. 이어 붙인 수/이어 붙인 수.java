class Solution {
    public int solution(int[] num_list) {
        
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        for (int num : num_list) {
            if (num % 2 != 0) {
               str.append(num);
            } else {
                str2.append(num);
            }
        }
        int answer =  Integer.parseInt(str.toString()) + Integer.parseInt(str2.toString());
        
        return answer;
    }
}