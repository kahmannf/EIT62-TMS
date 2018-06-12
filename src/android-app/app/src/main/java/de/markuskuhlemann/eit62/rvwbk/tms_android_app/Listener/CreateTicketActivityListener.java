package de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.CreateTicketActivity;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.R;

/**
 * Created by Oliver on 05.06.2018.
 */

public class CreateTicketActivityListener implements View.OnClickListener
{
    private static CreateTicketActivity createTicketActivity = null;

    private static EditText txtTicketName = null;
    private static EditText txtTicketDescription = null;
    private static EditText txtTicketAcceptanceCriteria = null;
    private static Spinner spnTicketEditor = null;
    private static Spinner spnStatus = null;

    @Override
    public  void onClick(View v)
    {
        createTicketActivity = ((CreateTicketActivity) v.getContext());

        this.txtTicketName = (EditText) createTicketActivity.findViewById(R.id.txtTicketName);
        this.txtTicketDescription = (EditText) createTicketActivity.findViewById(R.id.txtTicketDescription);
        this.txtTicketAcceptanceCriteria = (EditText) createTicketActivity.findViewById(R.id.txtTicketAcceptanceCriteria);
        this.spnTicketEditor = (Spinner) createTicketActivity.findViewById(R.id.spnTicketEditor);
        this.spnStatus = (Spinner) createTicketActivity.findViewById(R.id.spnTicketStatus);

        switch (v.getId())
        {
            case R.id.spnTicketEditor:
                //ToDo
                if (txtTicketName.getText().toString().matches("") || txtTicketDescription.getText().toString().matches(""))
                {
                    return;
                }



                break;
        }
    }
}
