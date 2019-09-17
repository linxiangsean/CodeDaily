import java.util.Comparator;

import java.util.Arrays;

public class reorderLogFile{
    public static void main(String[] args) {
        String[] log = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};

        showArray(log);
        showArray(reorderLogFiles(log));
    }
    public static void showArray(String[] log){
        for(int i = 0 ; i< log.length; i++){
            if(i == log.length-1){
                System.out.print("'"+log[i]+"'");
            }else{
                System.out.print("'" +log[i]+ "'" + ", ");
            }
        }
        System.out.println("");

    }

    public static String[] reorderLogFiles(String[] logs){
        
        Comparator<String> myComp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                //find the first ocuurance of space. we know where is the first word after the identifier
                int s1si = s1.indexOf(" ");
                int s2si = s2.indexOf(" ");
                //here we get the first char of each log content
                char s1fc = s1.charAt(s1si+1);
                char s2fc = s2.charAt(s2si+1);

                //compare
                // -1 means s1 < s2, 0 means s1=s2, 1 means s1 >s2


                //This is the situation either s1 or s2 is dig log, or both of them are dig log:

                //consider the first situation, s1 is a dig log
                if(s1fc <= '9' ){
                    //if s2 is a diglog as well, they dont change order.
                    if(s2fc <= '9'){
                        return 0;
                    }else{
                        //s2 is a letter log, it goes to the front of s1, we want s1>s2, so return 1
                        return 1;
                    }
                }
                //else if s1 is not a dig log but only s2 is a dig log:
                if(s2fc <= '9'){
                    //in this case s2: dig log, s1: letter log, we want s1 < s2, so return -1;
                    return -1;
                }


                //when neither s1 nor s2 is dig log, they are both letter logs.


                //this will compare the first letter of the letter log content, they will sort themselves.
                int compareLetter = s1.substring(s1si+1).compareTo(s2.substring(s2si+1));
                //however, if they are the same, we need to use identifier to compare.
                if(compareLetter == 0){
                    return s1.substring(0,s1si).compareTo(s2.substring(0,s2si));
                }

                return compareLetter;

            }
        };
        Arrays.sort(logs,myComp);
            return logs;

    }
}