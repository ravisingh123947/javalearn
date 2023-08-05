package algorithm;

public class ReverseStringUsingRecursion {
    public static String reverseString(String str) {
        if(str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0,str.length() - 1));
    }
    public static void main(String[] args) {
        String str = "raviranjan";
        String result = reverseString(str);
        System.out.println(result);
        StringBuilder  stringBuilder = new StringBuilder();
        stringBuilder.append(result);
        System.out.println("reverse String using string builder: " + stringBuilder.reverse());
        System.out.println(str);
        System.out.println("String got reversed: " + stringBuilder.reverse().equals(str));
    }
}
