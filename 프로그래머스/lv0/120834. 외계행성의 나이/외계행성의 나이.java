class Solution {
    public String solution(int age) {
        char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String len = String.valueOf(age);
        String[] arr = new String[len.length()];
        
        if (len.length()==3) {
            arr[0] = String.valueOf(abc[age/100]);
            arr[1] = String.valueOf(abc[(age - 100 * (age/100)) / 10]);
            arr[2] = String.valueOf(abc[age%10]);
        } else if (len.length()==2) {
            arr[0] = String.valueOf(abc[age/10]);
            arr[1] = String.valueOf(abc[age%10]);
        } else if (age == 1000){
            String answer = "baaa";
            return answer;
        } else {
            arr[0] = String.valueOf(abc[age%10]);
        }
        
        String answer = String.join("", arr);
        return answer;
    }
}