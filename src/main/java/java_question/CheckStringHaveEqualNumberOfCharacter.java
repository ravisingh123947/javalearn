package java_question;

import java.util.Arrays;

public class CheckStringHaveEqualNumberOfCharacter {
    public static void main(String[] args) {
        String str1 = "place";
        String str2 = "ecalp";
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();

        //convert string to charArrays
        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

        //convert back from charArray to String(now sorted)
        String str1InSortedOrder = new String(str1CharArray);
        String str2InSortedOrder = new String(str2CharArray);

        if(str1.length() != str2.length()) {
            System.out.println("not matched");
        }
        if(str1InSortedOrder.equals(str2InSortedOrder)) {
            System.out.println("string got matched");
        }else{
            System.out.println("not matched");
        }
    }
}
