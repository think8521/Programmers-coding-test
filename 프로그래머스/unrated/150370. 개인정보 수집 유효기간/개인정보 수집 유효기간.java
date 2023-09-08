import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            StringBuilder str = new StringBuilder();
            
            for (int j = 0; j < terms.length; j++) {
                if (privacies[i].charAt(privacies[i].length()-1) == terms[j].charAt(0)) {
                    for (int k = 0; k < terms[j].length(); k++) {
                        if (Character.isDigit(terms[j].charAt(k))) {
                            str.append(terms[j].charAt(k));
                        }
                    }
                }
            }
            
            int term = Integer.parseInt(str.toString());
            int addMonth = month(privacies[i]) + term;
            int addYear = year(privacies[i]);
            int addDay = day(privacies[i]) - 1;
            
            if (addDay == 0) {
                addMonth = addMonth - 1;
                addDay = 28;
            }
            
            while (addMonth > 12) {
                addMonth -= 12;
                addYear += 1;
            }
            // if (addMonth > 12) {
            //     addMonth = addMonth - 12;
            //     addYear = addYear + 1;
            // }
            
            if (addMonth == 0) {
                addYear = addYear - 1;
                addMonth = 12;
            }
            
            
            System.out.println(addYear);
            System.out.println(addMonth);
            System.out.println(addDay);
            System.out.println(today);
            
            if (addYear > year(today)) {
                continue;
            } else if (addYear < year(today)) {
                arr.add(i+1);
                continue;
            }
            if (addMonth > month(today)) {
                continue;
            } else if (addMonth < month(today)) {
                arr.add(i+1);
                continue;
            }
            if (addDay >= day(today)) {
                continue;
            } else {
                arr.add(i+1);
            } 
                
        }
        
        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
    
    private int year (String a) {
        return Integer.parseInt(a.substring(0,4));
    }
    
    private int month (String a) {
        return Integer.parseInt(a.substring(5,7));
    } 
    
    private int day (String a) {
        return Integer.parseInt(a.substring(8, 10));
    } 

}