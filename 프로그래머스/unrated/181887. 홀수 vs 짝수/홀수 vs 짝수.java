class Solution {
    public int solution(int[] num_list) {
        int single = 0;
        int couple = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i%2 == 0) {
                single += num_list[i];
            } else {
                couple += num_list[i];
            }
        }
        int answer = Math.max(single, couple);
        return answer;
    }
}