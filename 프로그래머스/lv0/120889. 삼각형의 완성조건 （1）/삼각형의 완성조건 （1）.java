class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int mid = 0;
        int sml = 0;
        // for (int i = 1; i < sides.length; i++) {
        //     if (max <= sides[i]) {
        //         mid = max;
        //         max = sides[i];
        //     } else {
        //         mid = sides[i];
        //     }
        // }
        
        if (max <= sides[1]) {
                mid = max;
                max = sides[1];
        } else {
            mid = sides[1];
        }
        
        if (max <= sides[2]) {
            mid = max;
            max = sides[2];
            sml = sides[0];
        } else {
            sml = sides[2];
        }
        
        
        if (max<mid+sml) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}