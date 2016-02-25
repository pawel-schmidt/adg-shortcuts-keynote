package com.appunite.adgshortcutskeynote;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import javax.annotation.Nonnull;

import static com.google.common.base.Preconditions.checkNotNull;

public class LiveTemplatesActivity extends AppCompatActivity {

    private static final String TAG = "tag";

    void postfix() {
        // Math.random() * 10.cast| -> Tab
        final int limit = (int) (Math.random() * 10);
        // Alt + Enter -> [Introduce local variable]
        final ArrayList<Integer> ints = new ArrayList<>(limit);
        // fori| -> Tab
        for (int i = 0; i < limit; i++) {
            ints.add(i * limit);
        }
        // ints.isEmpty().if| -> Tab
        // if (ints.isEmpty()!|) -> Tab -> Cmd + Shift + Enter
        if (!ints.isEmpty()) {
            // 2 * ints.get(0).par| -> Tab -> (2 * ints.get(…))
            final int twoThird = (2 * ints.get(0)) / 3;

            final String[] strings = new String[twoThird];
            // twoThird.fori| -> Tab
            for (int i = 0; i < twoThird; i++) {
                strings[i] = ints.get(i).toString();
            }
            // lst| -> Tab
            final String last = strings[strings.length - 1];
            // logd| -> Tab
            // logi| -> Tab
            // logw| -> Tab
            // loge| -> Tab
            Log.d(TAG, "last: " + last);
            // sout| -> Tab
            System.out.println(last);
            // todo| -> Tab
            // TODO: 25/02/16 divide last by 0
            // fixme| -> Tab
            // FIXME: 25/02/16 catch exception
        }
    }

    @Nonnull
    public static Intent newIntent(@Nonnull final Context context) {
        return new Intent(checkNotNull(context), LiveTemplatesActivity.class);
    }

    void switchLiveTemplate() {
        final int myInt = (int) (Math.random() * 10);
        switch (myInt) {
            case 1:
                System.out.println("1");
                break;
            default:
                throw new RuntimeException("Unknown myInt: " + myInt);
        }
    }

    void checkForNullity(@Nonnull String isItNull) {
        final String notNullForSure = isItNull;
        System.out.println(notNullForSure);
    }

    void androidStuff() {
        // fbc| -> Tab
        final TextView textView = (TextView) findViewById(R.id.some_id);
        // visible| -> Tab
        // gone| -> Tab
        textView.setVisibility(View.VISIBLE);
        textView.setVisibility(View.GONE);
    }
}
