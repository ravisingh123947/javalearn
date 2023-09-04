package com.springbootdemo.dsa;

import java.util.Stack;

public class TextEditor1 {
    String currentText = "";

    Stack<String> undo = new Stack<>();
    Stack<String> redo = new Stack<>();

    public void type(String typeWord) {
        undo.push(currentText);
        currentText = currentText + " ";
        currentText = currentText + typeWord;
    }

    public String getCurrentText() {
        return  currentText;
    }

    public void undo() {
        redo.push(currentText);
        currentText = undo.pop();
    }

    public void redo() {
        currentText = redo.pop();
    }
}
