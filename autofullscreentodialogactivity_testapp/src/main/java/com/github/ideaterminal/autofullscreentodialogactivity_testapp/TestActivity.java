package com.github.ideaterminal.autofullscreentodialogactivity_testapp;

import android.os.Bundle;

import com.github.ideaterminal.autofullscreentodialogactivity.AutoFullScreenToDialogActivity;

/**
 * Created by ronga on 11/5/2016.
 */

public class TestActivity extends AutoFullScreenToDialogActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBottomButtonForDialog("Submit", null);
    }

}
