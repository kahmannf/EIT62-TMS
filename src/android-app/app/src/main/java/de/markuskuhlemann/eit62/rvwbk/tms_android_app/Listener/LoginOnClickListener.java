package de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener;


import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.R;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.activity_login;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.activity_register;
public class LoginOnClickListener implements View.OnClickListener{
    public static activity_login login = null;
    String loginUser = null;
    String loginPasswort = null;
    @Override
    public void onClick(View v) {
        login = (activity_login) v.getContext();
        generateWidgetReference();
        switch(v.getId())
        {
            case R.id.ButtonLoginSubmit:
                String test = null;
                break;
            case R.id.ButtonLoginCreate:
                Intent intent = new Intent(login,activity_register.class);
                login.startActivity(intent);
                break;
        }

    }
    void generateWidgetReference()
    {
        this.loginUser = ((EditText) login.findViewById(R.id.InputLoginUser)).getText().toString();
        this.loginPasswort = ((EditText) login.findViewById(R.id.InputLoginPasswort)).getText().toString();

    }
}
