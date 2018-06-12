package de.markuskuhlemann.eit62.rvwbk.tms_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener.CreateTicketActivityListener;

public class CreateTicketActivity extends AppCompatActivity
{
    //Btton
    private Button btnTicketSave = null;

    //Listener
    private View.OnClickListener createTicketActivityListener = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_ticket);

        this.btnTicketSave = (Button) findViewById(R.id.btnTicketSave);

        this.createTicketActivityListener = new CreateTicketActivityListener();

        this.btnTicketSave.setOnClickListener(createTicketActivityListener);


        // Spinner fülllen
       /* ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, new State[] {
                new State( 1, "Minnesota", "MN" ),
                new State( 99, "Wisconsin", "WI" ),
                new State( 53, "Utah", "UT" ),
                new State( 153, "Texas", "TX" )
        });
        spnTicketEditor.setAdapter(spinnerArrayAdapter);*/


    }
}
