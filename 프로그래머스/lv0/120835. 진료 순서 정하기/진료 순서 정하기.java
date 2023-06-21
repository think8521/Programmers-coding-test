class Solution {
    public int[] solution(int[] emergency) {
        
        int[] sort = emergency;
        int[] em2 = new int[emergency.length];
        // for (int i = 0; i < emergency.length; i++) {
        //     for (int j = i; j < emergency.length; j++) {
        //         if (sort[j]<sort[i]) {
        //             int temp = sort[i];
        //             sort[i] = sort[j];
        //             sort[j] = temp;
        //         }
        //     }
        // }
        
        for (int i = 0; i < emergency.length; i++) {
            int count = emergency.length;
            for (int j = 0; j < emergency.length; j++) {
                if (i != j && emergency[j] < emergency[i]) {
                    count--;
                }
            }
                em2[i] = count;
            
        }
        
        int[] answer = em2;
        
        return answer;
    }
}