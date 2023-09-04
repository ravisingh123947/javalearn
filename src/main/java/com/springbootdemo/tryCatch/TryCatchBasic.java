package com.springbootdemo.tryCatch;

import com.springbootdemo.stream.Student;

public class TryCatchBasic {
    public static void main(String[] args) {
       CallClass callClass = new CallClass();
      try{
          callClass.callMe();
      }catch (Exception e) {
          System.out.println(e.getMessage());
      }

        System.out.println("this line is important***it has to be executed any how");
    }
}
