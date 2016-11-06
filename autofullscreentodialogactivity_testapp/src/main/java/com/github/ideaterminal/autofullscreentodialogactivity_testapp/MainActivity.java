package com.github.ideaterminal.autofullscreentodialogactivity_testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.ideaterminal.autofullscreentodialogactivity.AutoFullScreenToDialogActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn= (Button) findViewById(R.id.launch);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TestActivity.class);
                i.setAction("test");
                MainActivity.this.startActivity(i);
            }
        });
    }
}
