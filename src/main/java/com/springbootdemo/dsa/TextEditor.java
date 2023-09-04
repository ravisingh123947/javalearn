package com.springbootdemo.dsa;

import java.util.Stack;

public class TextEditor {
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();
    private String currentText = "";

    public void type(String text) {
        undoStack.push(currentText);
        currentText += text;
        redoStack.clear(); // Clear redo stack after typing new text.
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText);
            currentText = undoStack.pop();
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText);
            currentText = redoStack.pop();
        }
    }

    public String getText() {
        return currentText;
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello, ");
        editor.type("World!");
        System.out.println(editor.getText()); // Output: Hello, World!
        editor.undo();
        System.out.println(editor.getText()); // Output: Hello,
        editor.redo();
        System.out.println(editor.getText()); // Output: Hello, World!
    }
}

