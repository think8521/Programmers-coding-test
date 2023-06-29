class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        
        int[] arr = {a, b, c, d};
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 3) {
                answer = 1111 * arr[i];
                return answer;
            } else if (count == 2) {
                for (int j = 0; j < 4; j++) {
                    if (i != j && arr[i] != arr[j]) {
                        answer = (10 * arr[i] + arr[j]) * (10 * arr[i] + arr[j]);
                        return answer;
                    }
                }
            } else if (count == 1) {
                for (int j = 0; j < 4; j++) {
                    if (i != j && arr[i] != arr[j]) {
                        str.append(arr[j]);
                    }
                }
                String ex = str.toString();
                if (ex.charAt(0) == ex.charAt(1)) {
                    answer = (arr[i] + (ex.charAt(0) - '0')) * Math.abs(arr[i] - (ex.charAt(0) - '0'));
                    return answer;
                } else {
                    answer = (ex.charAt(0) - '0') * (ex.charAt(1) - '0');
                    return answer;
                }
            }
            
            if (count == 0 && i == 3){

                answer = arr[0];
                for (int j = 1; j < 4; j++) {    
                    if (arr[j] < answer) {
                        answer = arr[j];
                    }
                }
                return answer;
            }
                     
            count = 0;
        }
        
        
        
        return answer;
    }
}