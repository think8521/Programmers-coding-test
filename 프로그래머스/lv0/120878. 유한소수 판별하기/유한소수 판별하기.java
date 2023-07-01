class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int min = Math.min(a, b);
        int count = 0;
        
        if (b == 5|| b == 2 || b == 1) {
            answer = 1;
            return answer;
        }
        
        for (int i = 2; i <= min; i++) {
            if (a%i == 0 && b%i == 0) {
                count++;
            }
        }
        
        if (count == 0) {   
            while (b%2 == 0) {
                b = b/2;
            }
            while (b%5 == 0) {
                b = b/5;
            }
            if (b == 1) {
                answer = 1;
                return answer;
            } else {
                answer = 2;
                return answer;
            }
        }
        
        int[] arr = new int[count];
        
        int j = 0;
        for (int i = 2; i <= min; i++) {
            if (a%i == 0 && b%i == 0) {
                arr[j++] = i;
            }    
        }
        
        int irr = b / arr[count-1];
        
        if (irr == 2 || irr == 1) {
            answer = 1;
            return answer;
        }
        
        if (irr >= 3) {
            while (irr%2 == 0) {
                irr = irr/2;
            }
            while (irr%5 == 0) {
                irr = irr/5;
            }
            if (irr == 1) {
                answer = 1;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}
