package de.markuskuhlemann.eit62.rvwbk.tms_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener.CreateTicketActivityListener;

public class CreateTicketActivity extends AppCompatActivity
{
    //Btton
    private Button btnTicketSave = null;

    //Listener
    private View.OnClickListener createTicketActivityListener = null;

    //Spinner
    private Spinner spnTicketEditor = null;

    //Textview
    private TextView txtTicketName = null;
    private TextView txtTicketDescription = null;
    private TextView txtTicketAcceptanceCriteria = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_ticket);

        this.btnTicketSave = (Button) findViewById(R.id.btnTicketSave);

        this.createTicketActivityListener = new CreateTicketActivityListener();

        this.btnTicketSave.setOnClickListener(createTicketActivityListener);

        //TextView
        txtTicketName = (EditText) findViewById(R.id.txtTicketName);
        txtTicketDescription = (EditText) findViewById(R.id.txtTicketDescription);
        txtTicketAcceptanceCriteria = (EditText) findViewById(R.id.txtTicketAcceptanceCriteria);

        this.spnTicketEditor = (Spinner) findViewById(R.id.spnTicketEditor);
        // Spinner fülllen
        //ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, HIER MUSS DER ARRAY STEHEN);
        //spnTicketEditor.setAdapter(spinnerArrayAdapter);

        //ToDo
        //Controls füllen mit Daten aus dem CurrentObject aus dem Filehandler
        /*if(Filehandler.getInstance().getCurrentObject() != null)
        {
            txtTicketName.setText("HIER KOMMT DER TEXT aus dem current object");
            txtTicketDescription.setText("HIER KOMMT DER TEXT aus dem current object");
            txtTicketAcceptanceCriteria.setText("HIER KOMMT DER TEXT aus dem current object");
        }*/

    }
}
