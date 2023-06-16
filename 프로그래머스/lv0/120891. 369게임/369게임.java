class Solution {
    public int solution(int order) {
        String orderS = String.valueOf(order);
        char[] arr = new char[orderS.length()];
        int count = 0;
        for (int i=0; i<orderS.length(); i++) {
            arr[i] = orderS.charAt(i);
            if ((arr[i]-'0')-3==0 || (arr[i]-'0')-6==0 || (arr[i]-'0')-9==0) {
                count++;
            }
        }
        
        int answer = count;
        return answer;
    }
}