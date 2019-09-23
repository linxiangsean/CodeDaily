import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;

//import java.util.*;

class mostCommonWord{
    public static void main(String[] args) {

        String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println(mostCommonWord(p,banned));
        
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
          
        String[] words = paragraph.toLowerCase().split("\\W+");
        
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        
        Map<String, Integer> count = new HashMap<>();
        
        for(String word : words){
            if(! ban.contains(word)){
                count.put(word, count.getOrDefault(word,0) +1);
            }
        }
        
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
        
      
    }



}