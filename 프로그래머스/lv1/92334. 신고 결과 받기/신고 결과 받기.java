import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Set<String> unique = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, String> smap = new HashMap<>();
        
        for (int a: answer) {
            a = 0;
        }
            
        for (String re : report) {
            unique.add(re);
        }
        
        
        for (String re : unique) {
            String[] singo = re.split(" ");
            
            smap.put(re, singo[1]);

            if (map.containsKey(singo[1])) {
                map.put(singo[1], map.get(singo[1])+1);
            } else {
                map.put(singo[1], 1);
            }
            // System.out.println(map.get(singo[1]));
        }
        
        for (Map.Entry<String,String> sentry : smap.entrySet()) {
            if (map.get(sentry.getValue()) >= k) {
                String[] singo = sentry.getKey().split(" ");
                for (int i = 0; i < id_list.length; i++) {
                    if (id_list[i].equals(singo[0])) {
                        answer[i]++;
                    }
                }
            }
        }

        
//         for (Map.Entry<String,Integer> entry : map.entrySet()) {
//             // System.out.println(entry.getKey());
//             // System.out.println(entry.getValue());
//             if (entry.getValue() >= k) {
//                 for (Map.Entry<String,String> rentry : rmap.entrySet()) {
                    
//                     for (int i = 0; i < id_list.length; i++) {
//                     if (rmap.get(entry.getKey()).equals(id_list[i])) {
//                             answer[i]++;
//                         }
                        
//                     }
//                 }
                
                
// //                 for (String re : unique) {
// //                     String[] singo = re.split(" ");
                    
// //                     if (singo[1].equals(entry.getKey())) {
// //                         for (int i = 0; i < id_list.length; i++) {
// //                             if (id_list[i].equals(singo[0])) {
// //                                 answer[i]++;
// //                             }
// //                         }
// //                     }
// //                 }
//             }
//         }

        
        
        
        return answer;
    }
}



// if (smap.containsKey(singo[0])) {
//                 smap.put(singo[0], smap.get(singo[0])+1);
//             } else {
//                 smap.put(singo[0], 1);
//             }
            
//             if (map.get(singo[1]) >= k) {
//                 for (int i = 0; i < id_list.length; i++) {
//                     if (id_list[i].equals(singo[0])) {
//                         answer[i]++;
//                         // break;
//                     }
//                 }
//                 map.put(singo[1], map.get(singo[1]) - 1);
//             }