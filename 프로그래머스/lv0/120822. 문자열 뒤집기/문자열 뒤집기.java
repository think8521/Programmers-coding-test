
class Solution {
    public String solution(String my_string) {
        String my[] = new String[my_string.length()];
        int j = 0;
        for (int i=my_string.length()-1; i>-1; i--) {
            my[j]=String.valueOf(my_string.charAt(i));
            j++;
        }
      
        String answer = String.join("", my);;
        return answer;
    }
}