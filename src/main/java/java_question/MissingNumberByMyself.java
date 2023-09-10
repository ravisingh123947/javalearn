package java_question;

public class MissingNumberByMyself {
    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23};

        int temp = 0;
        int i = 0;
        while(a[a.length - 1] + 1 > temp) {
            if(temp == a[i]){
                temp++;
                i++;
            }else {
                System.out.println(temp);
                temp++;
            }
        }
    }
}
