package com.appunite.adgshortcutskeynote;

import java.util.concurrent.TimeUnit;

// MyAltEnter -> Alt + Enter ->
public class AltEnter {

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

    private final int sideLength;
    private final float ratio;
    private final String name;

    public AltEnter(final int sideLength, final float ratio) {
        this(sideLength, ratio, null);
    }

    // public AltEnter| -> Alt + Enter -> [Bind constructor parameters to field]
    // public AltEnter| -> Alt + Enter -> [Generate overloaded constructor with default parameter values]
    public AltEnter(final int sideLength, final float ratio, final String name) {
        this.sideLength = sideLength;
        this.ratio = ratio;
        this.name = name;
    }

    AltEnter newInstance(final int sideLength, final float ratio, final String name) {
        // new AltEnter(sideLength, name, ratio)| -> Alt + Enter -> [Create constructor]
        return new AltEnter(sideLength, ratio, name);
    }

    void convertToOtherBase() {
        // 0x100 -> Alt + Enter -> [Introduce local variable
        final int i = 0x100;
        // 0x100| -> Alt + Enter -> [Convert to binary]
        final int j = 0b100000000;
        // 0b10000000|0 -> Alt + Enter -> [Insert underscores into literal]
        final int k = 0b1_0000_0000;
    }

    void createMissingSwitchStatements(final TimeUnit timeUnit) {
        // timeUnit.switch| -> Tab -> Alt + Enter -> [Create missing 'switch' branches]
        switch (timeUnit) {
            case DAYS:
                break;
            case HOURS:
                break;
            case MICROSECONDS:
                break;
            case MILLISECONDS:
                break;
            case MINUTES:
                break;
            case NANOSECONDS:
                break;
            case SECONDS:
                break;
        }
    }

    // Alt + Enter -> [Simplify]
    boolean simplify(final boolean prev, final boolean current, final boolean next) {
        if (prev == true && current == false) {
            return true;
        } else if (current == false && prev == true) {
            return false;
        }
        return true;
    }

    // Alt + Enter -> [
    void permuteArguments() {
        final double max = Math.max(2d, 1d);
    }

    // Ctrl + Enter -> [Constructor]
    // Alt + Enter -> [Replace '+' with 'String.format()'
    // Alt + Enter -> [Replace '+' with 'StringBuilder.append()'
    @Override
    public String toString() {
        return String.format("AltEnter{sideLength=%d, ratio=%s, name='%s'}", sideLength, ratio, name);
    }
}
