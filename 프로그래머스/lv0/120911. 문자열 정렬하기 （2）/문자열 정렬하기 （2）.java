class Solution {
    public String solution(String my_string) {
        char[] arr = new char[my_string.length()];
        for (int i=0; i<my_string.length(); i++) {
            arr[i] = my_string.charAt(i);
            if (arr[i] < 'a') {
                arr[i] += ' ';
            }
        }
        for (int i=0; i<my_string.length(); i++) {
            for (int j=i; j<my_string.length(); j++) {
                if (arr[j]<arr[i]) {
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        String[] my = new String[my_string.length()];
        for (int i=0; i<my_string.length(); i++) {
            my[i] = String.valueOf(arr[i]);
        }
        
        
        String answer = String.join("", my);
        return answer;
    }
}