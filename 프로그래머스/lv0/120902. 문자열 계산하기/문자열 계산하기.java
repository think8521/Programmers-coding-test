class Solution {
    public int solution(String my_string) {
        

        String my_str = my_string.replace(" ", "");
        int count = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == ' ') {
                count++;
            }
        }
       
        
        int[] arrI = new int[my_string.length()-count];
        StringBuilder str = new StringBuilder();
        char[] arr = my_str.toCharArray();
        int j = 0;
   
        for (int i = 0; i < my_str.length(); i++) {
            if (arr[i] != '+' && arr[i] != '-') {
                str.append(arr[i]);
                if (i == my_str.length()-1) {
                    arrI[j++] = Integer.parseInt(str.toString());
                }
            }
            if (arr[i] == '+' || arr[i] == '-') {
                arrI[j++] = Integer.parseInt(str.toString());
                str.setLength(0);
            }
        }
        
        int answer = arrI[0];
        int k = 1;
        for (int i = 0; i < my_str.length(); i++) {
            if (arr[i] == '+') {
                if (k == arrI.length-1) {
                    answer += arrI[k];
                    return answer;
                }
                answer += arrI[k];
                k++;
            }
            if (arr[i] == '-') {
                if (k == arrI.length-1) {
                    answer -= arrI[k];
                    return answer;
                }
                answer -= arrI[k];
                k++;
            }
        }
        
        System.out.println(String.valueOf(arrI[1]));
        return answer;
    }
}