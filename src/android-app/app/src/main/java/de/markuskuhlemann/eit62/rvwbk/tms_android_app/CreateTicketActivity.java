package de.markuskuhlemann.eit62.rvwbk.tms_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class CreateTicketActivity extends AppCompatActivity
{
    //PlainText
    private EditText txtTicketName = null;
    private EditText txtTicketDescription = null;

    //Button
    private Spinner spnTicketEditor = null;

    //Listener
    private View.OnClickListener createTicketActivityListener = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_ticket);

        this.txtTicketName = (EditText) findViewById(R.id.txtTicketName);
        this.txtTicketDescription = (EditText) findViewById(R.id.txtTicketDescription);
        this.spnTicketEditor = (Spinner) findViewById(R.id.spnTicketEditor);
    }
}
