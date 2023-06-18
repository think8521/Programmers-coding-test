class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        String[] word = letter.split(" ");
        
        for (int i = 0; i<word.length; i++) {
            for (int j = 0; j<morse.length; j++) {
                if (word[i].equals(morse[j])) {
                    word[i] = abc[j];
                }
            }
        }
        
//         int count = 1;
//         for (int i = 0; i<letter.length(); i++) {
//             if (String.valueOf(letter.charAt(i)).equals(" ")) {
//                 count++;
//             }
//         }
        
//         String[] word = new String[count];
        
//         int k = 0;
        
//         for (int i = 0; i<letter.length(); i++) {
//             int j = 0;
//             for (j = i; i<letter.length(); j++) {
//                if (!String.valueOf(letter.charAt(i)).equals(" ")) {
//                 word[k] += String.valueOf(letter.charAt(i));
//                 } else {
//                    break;
//                }
//             }
//             i = j;
//             k++;
//         }
        
//         for (int i = 0; i<count; i++) {
//             for (int j = 0; j < abc.length; j++) {
//                 if (word[i].equals(morse[j])) {
//                     word[i] = abc[j];
//                 }
//             }
//         }
        // 런타임 에러
        
        String answer = String.join("", word);
        return answer;
    }
}