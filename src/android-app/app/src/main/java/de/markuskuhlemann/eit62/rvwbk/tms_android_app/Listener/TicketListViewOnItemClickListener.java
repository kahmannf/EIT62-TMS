package de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener;

import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.CreateTicketActivity;

/**
 * Created by Oliver on 17.06.2018.
 */

public class TicketListViewOnItemClickListener implements AdapterView.OnItemClickListener
{
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int index, long id)
    {
        //ToDo
        //Aktuelle Notiz zwischenspeichern
        ////FileHandler.getInstance().setCurrentDetailNoteBean(index);

        //Gernerieren eines Intents für die ListViewItemDetailsActivity zu wrappen
        Intent intentListViewItemDetailsActivity = new Intent(view.getContext(),CreateTicketActivity.class);

        //Aufruf der Activity
        view.getContext().startActivity(intentListViewItemDetailsActivity);
    }
}
