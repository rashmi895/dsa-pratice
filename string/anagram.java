package string;

import java.util.Arrays;

public class anagram {
    public static boolean  ifanagarm(String a,String b){
if(a.length()!=b.length()){
    return false;
}
char[] firstarray=a.toCharArray();
char[] secondarray=b.toCharArray();
Arrays.sort(firstarray);
Arrays.sort(secondarray);
return Arrays.equals(firstarray, secondarray);
    }
    public static void main(String[] args) {
        String a="reace";
        String b="car";
        System.out.println(ifanagarm(a, b));
    }
}
