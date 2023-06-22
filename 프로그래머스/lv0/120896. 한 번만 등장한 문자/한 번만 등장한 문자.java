class Solution {
    public String solution(String s) {
        
        char[] arrC = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arrC[i] = s.charAt(i);    
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j=i+1; j < s.length(); j++) {
                if (arrC[i] > arrC[j]) {
                    char temp = arrC[j];
                    arrC[j] = arrC[i];
                    arrC[i] = temp;
                }
            }
        }
        // System.out.println(arrC);
        
        char[] arrc = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arrc[i] = arrC[i];    
        }
        
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i != j && arrC[i] == arrc[j]) {
                    arrC[i] = ' ';
                }
            } 
                    str.append(arrC[i]);
        }
        
        s = str.toString();
        
        s = s.replace(" ", "");
        
        String answer = s;
        return answer;
    }
}