class Solution {
    public int[] solution(int[] numbers, String direction) {
        if(direction.equals("right")) {
            int temp = numbers[0];
            for (int i=1; i<numbers.length; i++) {
                int temp2 = numbers[i];
                numbers[i] = temp;
                temp = temp2;
            } 
            numbers[0] = temp;
        } else {
            int temp = numbers[0];
            for (int i=0; i<numbers.length-1; i++) {
                numbers[i] = numbers[i+1];
            }
            numbers[numbers.length-1] = temp;
        }
        int[] answer = numbers;
        return answer;
    }
}