import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_from_question = br.readLine();

        int num = Integer.parseInt(input_from_question);
        while(num>0) {
            num = num + 1;

            int temp = num;
            int remainder,reversed = 0;
            while (temp != 0) {
                remainder = temp % 10;
                reversed = reversed * 10 + remainder;
                temp /= 10;
            }
            if(num == reversed) {
                input_from_question = String.valueOf(reversed);
                break;
            }
        }

        System.out.println(input_from_question);
    }
}
