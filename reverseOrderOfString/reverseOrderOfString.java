import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class reverseOrderOfString {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
   String input = "Hip, hip, hooray! ";

   reverseSpell(input);

  // System.out.println(input);
  }

  public static void reverseSpell(String input) {

    String str = input;
    
    StringBuilder reverse =  new StringBuilder();
    for(int i = str.length() -1; i >=0; i-- ){
        if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))){
            reverse.append(str.charAt(i));
        }
    }
    String reverse1 = reverse.toString().toLowerCase();

    StringBuilder res = new StringBuilder();
    for(int i = 0; i <reverse1.length()-1 ; i++){
        res.append(reverse1.charAt(i)).append('-');
    }
    res.append(reverse1.charAt(reverse1.length()-1));

    System.out.println(res.toString());
  }



}