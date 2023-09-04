package com.springbootdemo.dsa;

public class TestEditorCaller {
    public static void main(String[] args) {
        TextEditor1 textEditor1 = new TextEditor1();
        textEditor1.type("ravi");

        System.out.println(textEditor1.getCurrentText());

        textEditor1.type("ranjan");

        System.out.println(textEditor1.getCurrentText());

        textEditor1.undo();

        System.out.println(textEditor1.getCurrentText());

        textEditor1.redo();

        System.out.println(textEditor1.getCurrentText());

        textEditor1.type("kumar");

        System.out.println(textEditor1.getCurrentText());

        textEditor1.undo();

        System.out.println(textEditor1.getCurrentText());
    }
}
