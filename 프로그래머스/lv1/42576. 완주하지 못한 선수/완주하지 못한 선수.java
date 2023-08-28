import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // ArrayList<String> plist = new ArrayList<>();
        // ArrayList<String> clist = new ArrayList<>();
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++) {
            // plist.add(participant[i]);
            // clist.add(completion[i];
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }
        answer = participant[participant.length-1];
        
        return answer;
    }
}