package java_question;

import java.util.Stack;

public class BodmassProblem {
    public static void main(String[] args) {
        String listOfSupportedOperator = "+/-*";
        String questionToBeSolved = "24+2*2/";
        Stack<String> stack = new Stack<>();

        char[] questionToBeSolvedInCharArray = questionToBeSolved.toCharArray();
        for(char c : questionToBeSolvedInCharArray) {
            if(listOfSupportedOperator.contains(String.valueOf(c))) {
                int index = listOfSupportedOperator.indexOf(c);
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch (index) {
                    case 0 :
                        stack.push(String.valueOf(a + b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b/a));
                        break;
                    case 2:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 3:
                        stack.push(String.valueOf(a*b));
                        break;
                }
            }else{
                stack.push(String.valueOf(c));
            }
        }
        System.out.println("final computation after solving expression: " + stack.pop());
    }
}
