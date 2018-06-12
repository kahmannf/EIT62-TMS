package de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.CreateProjectActivity;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.CreateTicketActivity;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.R;

/**
 * Created by Oliver on 12.06.2018.
 */

public class CreateProjectActivityListener implements View.OnClickListener
{

    private static CreateProjectActivity createProjectActivity = null;

    private static EditText txtProjectName = null;
    private static EditText txtProjectDescription = null;
    private static Spinner spnProjectEditor = null;
    private static Button btnProjectSave = null;

    @Override
    public void onClick(View v)
    {
        this.createProjectActivity = ((CreateProjectActivity) v.getContext());

        this.txtProjectName = (EditText) createProjectActivity.findViewById(R.id.txtProjectName);
        this.txtProjectDescription = (EditText) createProjectActivity.findViewById(R.id.txtProjectDescription);
        this.spnProjectEditor = (Spinner) createProjectActivity.findViewById(R.id.spnProjectEditor);
        this.btnProjectSave = (Button) createProjectActivity.findViewById(R.id.btnProjectSave);

        switch (v.getId())
        {
            case R.id.spnTicketEditor:
                //ToDo
                if (txtProjectName.getText().toString().matches("") || txtProjectDescription.getText().toString().matches(""))
                {
                    return;
                }



                break;
        }
    }
}
