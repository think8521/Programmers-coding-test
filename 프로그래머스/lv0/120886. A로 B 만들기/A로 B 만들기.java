class Solution {
    public int solution(String before, String after) {
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        
        for (int i=0; i<be.length; i++) {
            for (int j = i; j<be.length; j++) {
                if (be[j]<be[i]) {
                    char temp = be[i];
                    be[i] = be[j];
                    be[j] = temp;
                }
                if (af[j]<af[i]) {
                    char temp2 = af[i];
                    af[i] = af[j];
                    af[j] = temp2;
                }
            }
        }
        
        int answer = 0;
        for (int i=0; i<be.length; i++) {
            if (be[i] != af[i]) {
                return 0;
            } else {
                answer = 1;
            }
        }
        return answer;
    }
}