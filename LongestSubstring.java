import java.util.*;
public class LongestSubstring {
    

    public static void main(String[] args){
        String str = "abbac";
   String ans= longest(str);
   System.out.println(ans);
    }
private static String longest(String str){
    String longesttill = "";
    String overall  = "";
    HashSet<Character> set= new HashSet<>();
    for(int i = 0; i<str.length();i++){
        char c = str.charAt(i);
        if(set.contains(c)){
            longesttill ="";
            set.clear();
        }     
            longesttill+=c;
            set.add(c);
        if(longesttill.length()>overall.length()){
            overall=longesttill;
        }
    }
return overall;


    
}

}