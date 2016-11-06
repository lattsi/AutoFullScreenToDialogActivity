package com.github.ideaterminal.autofullscreentodialogactivity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;

public class AutoFullScreenToDialogActivity extends Activity {

    boolean isTablet = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public final void setContentView(int layoutResId){
        isTablet = isTablet();
        if (isTablet) {
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            this.setTheme(R.style.afda_AppDialogTheme);
        } else {
            this.setTheme(R.style.afda_AppTheme);
        }
        super.setContentView(R.layout.afda_activity_main);
        if (layoutResId > 0) {
            LinearLayout layout = (LinearLayout) findViewById(R.id.afda_activity_main_placeholder);
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout.addView(inflater.inflate(layoutResId, null, false), 0);
        }
    }

    public Button setBottomButtonForDialog(String text, View.OnClickListener listener){
        Button btn = (Button) findViewById(R.id.afda_activity_main_bottombutton);
        if (listener != null) btn.setOnClickListener(listener);
        btn.setText(text);
        btn.setVisibility(isTablet ? View.VISIBLE : View.GONE);
        return btn;
    }

    public boolean isTablet() {
        return (this.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}
