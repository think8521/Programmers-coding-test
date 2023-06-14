class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i)-'0' < 10) {
                count++;
            }
        }
        int[] intarr = new int[count];
        int j = 0;
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i)-'0' < 10) {
                intarr[j] = my_string.charAt(i)-'0';
                j++;
            }
        }
        for (int i=0; i<count; i++) {
            for (int k=i; k<count; k++) {
                if(intarr[k] < intarr[i]) {
                    int temp = intarr[i];
                    intarr[i] = intarr[k];
                    intarr[k] = temp;
                }
            }
        }
        
        int[] answer = intarr;
        return answer;
    }
}