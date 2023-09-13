package com.springbootdemo.stringTesting;

public class Main1 {
    public static void main(String[] args) {

       String name = "ravi";
       String name1 = "ravi";
        System.out.println(name1.hashCode());
        System.out.println(name.hashCode());

        System.out.println(name == name1);

        String name2 =new String("ravi");
        String name3 = new String("ravi");
        System.out.println(name2 == name3);

//
//     String name1 = "ravi";
//     String name2 = "ravi";
//     String name3 = new String("ravi");
//        System.out.println(name1.hashCode());
//        System.out.println(name2.hashCode());
//        System.out.println(name3.hashCode());
//
//        System.out.println(name1 == name2);
//        System.out.println(name1 == name3);
//        System.out.println(name2 == name3);

//        String name = "";
//       if(name != null && !name.isEmpty()) {
//           System.out.println("valid");
//       }
    }
}
