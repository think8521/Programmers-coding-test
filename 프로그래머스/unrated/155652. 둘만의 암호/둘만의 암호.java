class Solution {
    public String solution(String s, String skip, int index) {
        
        StringBuilder str = new StringBuilder();
        String abc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        
        char[] abcarr = abc.toCharArray();
        char[] sarr = s.toCharArray();
        char[] skips = skip.toCharArray();
        
        // for (int i = 0; i < abc.length(); i++) {
        //     for (char sk : skips) {
        //         if (abcarr[i] != sk) {
        //             str.append(abcarr[i]);
        //             break;
        //         }
        //     }
        // }
        for (char sk : skips) {
            if (abc.contains(String.valueOf(sk))) {
                abc = abc.replace(String.valueOf(sk), "");
            }
        }
        
        // String abc2 = str.toString();
        // str.setLength(0);
        System.out.println(abc);
        
        for (char sa : sarr) {
            for (int i = 0; i < abc.length(); i++) {
                if (sa == abc.charAt(i)) {
                    sa = abc.charAt(i+index);
                    str.append(sa);
                    break;
                }
            }
        }
        
         
        String answer = str.toString();
        return answer;
    }
}