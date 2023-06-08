class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int[] num = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            num[i] = num_list[i];
            if (num[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }
}