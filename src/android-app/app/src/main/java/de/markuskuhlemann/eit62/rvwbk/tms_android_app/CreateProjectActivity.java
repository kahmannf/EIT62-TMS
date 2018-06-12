package de.markuskuhlemann.eit62.rvwbk.tms_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener.CreateProjectActivityListener;

public class CreateProjectActivity extends AppCompatActivity {

    private View.OnClickListener createProjectActivityListener = null;

    private Button btnProjectSave = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);

        this.btnProjectSave = (Button) findViewById(R.id.btnProjectSave);

        this.createProjectActivityListener = new CreateProjectActivityListener();

        this.btnProjectSave.setOnClickListener(createProjectActivityListener);
    }
}
