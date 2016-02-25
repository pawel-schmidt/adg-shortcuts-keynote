package com.appunite.adgshortcutskeynote;

public class Refactoring {

    // Ctrl + T

    void copyClass() {
        // F5
    }

    void moveClass() {
        // F6
    }

    void renameMe() {
        // Shift + F6
        final int qqq = 10;
        System.out.println(qqq);
    }

    void changeSignature() {
        // Cmd + F6
        complicatedMethod(1, 2f, "3", null);
        complicatedMethod(2, 4f, "6", null);
        complicatedMethod(3, 6f, "9", null);
        complicatedMethod(4, 8f, "2", null);
    }

    private void complicatedMethod(final int i, final float f, final String s, final Object o) {

    }

    void inlineMethod() {
        // Cmd + Alt + N
        printNothing();
    }

    private void printNothing() {
        System.out.println("Nothing.");
    }

    void extract() {
        // Cmd + Alt + F
        // Cmd + Alt + V
        // Cmd + Alt + C
        // Cmd + Alt + P
        Math.abs(-10);
    }
}
