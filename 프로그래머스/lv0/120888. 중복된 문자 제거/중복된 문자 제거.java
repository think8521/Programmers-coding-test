class Solution {
    public String solution(String my_string) {
        String[] arr = new String[my_string.length()];
        
        
        
        for (int i=0; i<my_string.length(); i++) {
            arr[i] = String.valueOf(my_string.charAt(i));
        }
        
        for (int i = 0; i<my_string.length(); i++) {
            for (int j = i+1; j<my_string.length(); j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = "";
                }
            }
        }
        
        String answer = String.join("", arr);
        return answer;
    }
}