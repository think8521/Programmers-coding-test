class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        
        for (int i = 0; i < n; i++) {
            students[i] = 1;
            for (int got2 : reserve) {
                if (i+1 == got2) {
                    students[i]++;
                }
            }
            for (int empty : lost) {
                if (i+1 == empty) {
                    students[i]--;
                }
            }
        }
        if (students[0] == 0 && students[1] == 2) {
            students[0] = 1;
            students[1] = 1;
        }
        if (students[n-1] == 0 && students[n-2] == 2) {
            students[n-1] = 1;
            students[n-2] = 1;
        }
        
        for (int i = 1; i < n-1; i++) {
            if (students[i] == 0 && students[i-1] == 2) {
                students[i] = 1;
                students[i-1] = 1;
            }
            if (students[i] == 0 && students[i+1] == 2) {
                students[i] = 1;
                students[i+1] = 1;
            }
        }
        
        for (int student : students) {
            if (student >= 1) {
                answer++;
            }
        }
        
        return answer;
    }
}