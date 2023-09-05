class Solution {
    public String solution(String new_id) {
        String xstring = "~!@#$%^&*()=+[{]}:?,<>/";
        char[] xarr = xstring.toCharArray();
        
        // 1
        new_id = new_id.toLowerCase();
        
        // 2
        for (char x : xarr) {
            if (new_id.contains(String.valueOf(x))) {
                new_id = new_id.replace(String.valueOf(x), "");
            }
        }
        
        // 3
        if (new_id.contains("..")) {
            while (new_id.contains("..")){
                new_id = new_id.replace("..", ".");
            }
        }
        
        // 4
        if (new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length() -1);
        }
        
        // 5
        if (new_id.length() == 0) {
            new_id = "a";
        }
        
        // 6
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
        }
        if (new_id.endsWith(".")) {
            new_id = new_id.substring(0, new_id.length()-1);
        }
        
        // 7
        if (new_id.length() < 3) {
            while (new_id.length() < 3) {
                new_id = new_id + new_id.substring(new_id.length() - 1);
            }
        }
        
        
        String answer = new_id;
        return answer;
    }
}