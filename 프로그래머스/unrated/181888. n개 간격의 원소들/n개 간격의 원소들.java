class Solution {
    public int[] solution(int[] num_list, int n) {
        int a = 0;
        int[] answer = new int[a = (num_list.length%n == 0) ? num_list.length/n : num_list.length/n + 1];
        int b = 0;
        // answer[0] = num_list[0];
        for (int i = 0; i < num_list.length; i+=n) {
            // if ((i-1)%n == 0 && i > 0) {
                answer[b++] = num_list[i];
            // }
        }
        return answer;
    }
}