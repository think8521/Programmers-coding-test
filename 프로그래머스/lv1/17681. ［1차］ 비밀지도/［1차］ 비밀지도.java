class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            
            int[] temp1 = new int[n];
            int[] temp2 = new int[n];
            for (int j = 0;  j < n; j++) {
                int arr11 = arr1[i];
                int arr22 = arr2[i];
                int k = n-1;
                while (-1 < k) {
                    temp1[k] = arr11 % 2;
                    arr11 = arr11/2;
                    temp2[k] = arr22 % 2;
                    arr22 = arr22/2;
                    k--;
                }
                char a = (temp1[j] == 1 || temp2[j] == 1) ? '#' : ' ';
                str.append(a);
            }
            answer[i] = str.toString();
            str.setLength(0);
        }
        return answer;
    }
}