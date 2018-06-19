package de.markuskuhlemann.eit62.rvwbk.tms_android_app;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.Listener.TicketListViewOnItemClickListener;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.adapter.TicketListViewAdapter;

/**
 * Created by Oliver on 17.06.2018.
 */

public class TicketListViewActivity extends ListActivity
{

    //Adapter
    private static TicketListViewAdapter ticketListViewAdapter = null;

    //OnClickListener
    private static TicketListViewOnItemClickListener ticketListViewOnItemClickListener = null;

    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);

        //ToDo
        //if((nicht null) && (und nicht leer))
        //{
            ticketListViewAdapter = new TicketListViewAdapter(this);

            ticketListViewOnItemClickListener = new TicketListViewOnItemClickListener();
            getListView().setOnItemClickListener(ticketListViewOnItemClickListener);

            setListAdapter(ticketListViewAdapter);
        //}
    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if(ticketListViewAdapter != null)
        {
            ticketListViewAdapter = new TicketListViewAdapter(this);
            setListAdapter(ticketListViewAdapter);
        }
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }


}
