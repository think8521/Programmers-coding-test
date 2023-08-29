class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int k = 0;
        for (String target : targets) {
            for (int i = 0; i < target.length(); i++) {
                int temp = 101;
                for (String key : keymap) {
                    for (int j = 0; j < key.length(); j++) {
                        if (target.charAt(i) == key.charAt(j)) {
                            if (j+1 < temp) {
                                temp = j + 1;
                            }
                        }
                    }
                }
                if (temp != 101) {
                    answer[k] += temp;
                } else {
                    answer[k] = -1;
                    break;
                }
            }
            k++;
        }
        
        
        return answer;
    }
}