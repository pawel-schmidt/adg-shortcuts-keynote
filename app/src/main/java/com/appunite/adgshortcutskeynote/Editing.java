package com.appunite.adgshortcutskeynote;

public class Editing {

    final String JSON = "{\n" +
            "    \"id\": 1,\n" +
            "    \"name\": \"A green door\",\n" +
            "    \"price\": 12.50,\n" +
            "    \"tags\": [\"home\", \"green\"]\n" +
            "}";

    public static final String EMAIL_ADDRESS =
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+";


    // Alt + Arrow up

    // Alt, Alt (hold) + Arrow up / Arrow down - duplicate cursor

    // Alt + Shift + Click - duplicate cursor

    // Cmd + Shift + Arrow up / Arrow down - move line up/down

    // Ctrl + Shift + J - join lines (declaration + init; xml)

    // Shift + Enter - go to new line

    // Cmd + D - duplicate line

    // Cmd + Alt + Shift + C - copy path

    // Cmd + Shift + U - convert case

    // Code completion: Enter vs Tab

    void copyAndPaste() {
        // Cmd + C (with no text selected)
        final String copy = "copy";

        // Cmd + X (with no text selected)
        final String cut = "cut";

        // Cmd + Shift + V
        final String copy2 = "copy";
        final String cut2 = "cut";
    }

    // Cmd + Shift + Enter - complete code
    void completeCode() {
        final String[] myArray;
//        System.out.println(String.format("myArray %s", myArray
    }

}
