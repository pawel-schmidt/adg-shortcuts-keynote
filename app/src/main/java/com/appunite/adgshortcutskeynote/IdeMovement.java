package com.appunite.adgshortcutskeynote;

import android.view.View;

import java.io.FileWriter;
import java.io.IOException;

// Cmd + Shift + F7 on "implements"
public class IdeMovement implements View.OnClickListener {

    @Override
    public void onClick(final View v) {
        try {
            final String something = "Something";
            System.out.println(something);
            final FileWriter fileWriter = new FileWriter("");
            fileWriter.write(something);
            // Cmd + Shift + F7 on "catch"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cmd + F9 - build project
    // Cmd + Alt + Arrow up / Arrow down
    // Cmd + Alt + Arrow left / Arrow right
    void buggyMethod() {
//        Math.max(1f);
//
//        Math.max(2f);
//
//        Math.max(3f);
//
//        Math.max(4f);
//
//        Math.max(5f);
//
//        Math.max(6f);
    }

    // Shift, Shift - search everywhere

    // F1 - show doc

    // F1, F1 - display doc in big window

    // Ctrl + Space -> show code completion box

    // Ctrl + Space -> F1 - display doc in code completion box

    // Ctrl + Space, Ctrl + Space - code completion box with deeper search

    // Ctrl + Shift + Space - code completion box only with type-matched suggestions

    // Cmd + 1 -> Esc - focus on Project panel -> go back to editor

    // Cmd + 6 -> Shift + Esc - open bottom panel -> close bottom panel

    // Cmd + F12, type something - find class method, variable, constant, etc.

    // Cmd + O - open class

    // Cmd + Shift + O - open file

    // Cmd + Shift + O, type something, Alt + Cmd + F7 - find usages

    // Cmd + Alt + O - open symbol

    // Ctrl + Left arrow / Right arrow - go to left/right tab

    // Ctrl + Up arrow / Down arrow - go to method above/below

    // Alt + Left arrow / Right arrow - move cursor left/right to next "special" char

    // Alt + Up arrow / Down arrow - extend selection to next scope

    // Cmd + E - recent files

    // Cmd + B - go to declaration / find usages

    // Cmd + Alt + B - search for implementation (use on interfaces)

    // Ctrl + G - when no text selected: select whole word
    // Ctrl + G - when text selected: select next selection occurrence

    // Cmd + Ctrl + G - select all occurrences
}
