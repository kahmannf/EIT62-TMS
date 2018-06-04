package de.markuskuhlemann.eit62.rvwbk.tms_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener.LoginOnClickListener;

public class activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginOnClickListener listener =  new LoginOnClickListener();
        findViewById(R.id.ButtonLoginSubmit).setOnClickListener(listener);
     //   findViewById(R.id.ButtonLoginCreateSubmit).setOnClickListener(listener);
    }
}
