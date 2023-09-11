import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            int win = map.get(call);
            String temp = players[win];
            players[win] = players[win-1];
            players[win-1] = temp;
            map.put(players[win], win);
            map.put(players[win-1], win-1);
        }

        
        return players;
    }
}

//  String[] answer = new String[players.length];
        
//         LinkedList<String> list = new LinkedList<>();
        
//         for (String player : players) {
//             list.add(player);
//         }
        
//         for (int i = 0; i < callings.length; i++) {
//             for (int j = 0; j < list.size(); j++) {
//                 if (callings[i].equals(list.get(j))) {
//                     list.set(j, list.get(j-1));
//                     list.set(j-1, callings[i]);
//                 }
//             }
//         }
        
//         for (int i = 0; i < players.length; i++) {
//             answer[i] = list.get(i);
//         }
        
//         return answer;


// String[] answer = new String[players.length];
        
//         HashMap<Integer, String> map = new HashMap<>();
        
//         for (int i = 0; i < players.length; i++) {
//             map.put(i, players[i]);
//         }
        
//         for (int i = 0; i < callings.length; i++) {
//             for (int j = 0; j < players.length; j++) {
//                 if (map.get(j).equals(callings[i])) {
//                     map.put(j, map.get(j-1));
//                     map.put(j-1, callings[i]);
//                 }
//             }
//         }
        
//         for (int i = 0; i < players.length; i++) {
//             answer[i] = map.get(i);
//         }

        
//         return answer;