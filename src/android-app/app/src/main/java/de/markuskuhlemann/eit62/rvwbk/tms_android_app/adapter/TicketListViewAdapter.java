package de.markuskuhlemann.eit62.rvwbk.tms_android_app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import de.markuskuhlemann.eit62.rvwbk.tms_android_app.R;
import de.markuskuhlemann.eit62.rvwbk.tms_android_app.Wrapper.TicketListViewItemWidgetWrapper;

/**
 * Created by Oliver on 17.06.2018.
 */

public class TicketListViewAdapter extends BaseAdapter
{

    private LayoutInflater layoutInflater = null;

    public TicketListViewAdapter(Context context)
    {
        this.layoutInflater = LayoutInflater.from(context);
    }

    //ToDo
    @Override
    public int getCount()
    {
        return 0;
    }

    @Override
    public Object getItem(int index)
    {
        return 0;
    }

    @Override
    public long getItemId(int id)
    {
        return 0;
    }

    @Override
    public View getView(int index, View currentView, ViewGroup parent)
    {
        if(currentView == null)
        {
            //ToDo NoteBean noteBean = (NoteBean) getItem(index)

            currentView = layoutInflater.inflate(R.layout.ticket_list_view_item_layout, parent, false);

            TicketListViewItemWidgetWrapper lvItemWidgetWrapper = new TicketListViewItemWidgetWrapper();

            lvItemWidgetWrapper.setTxtvTicketListViewLayoutUser((TextView) currentView.findViewById(R.id.txtvTicketListViewLayoutUser));
            lvItemWidgetWrapper.setTxtvTicketListViewLayoutCreateDate((TextView) currentView.findViewById(R.id.txtvTicketListViewLayoutCreateDate));
            lvItemWidgetWrapper.setTxtvTicketListViewLayoutNote((TextView) currentView.findViewById(R.id.txtvTicketListViewLayoutNote));


            //Befülle der einzelnen Widgets

            //Beispiel aus Notiz APP
            //lvItemWidgetWrapper.getTxtvFileName().setText(noteBean.getClearFileName());
            //lvItemWidgetWrapper.getTxtvStatusOfImportance().setText(noteBean.getStatusOfImportance());

            //ToDO
            //Unsere Controls
            //lvItemWidgetWrapper.getTxtvTicketListViewLayoutUser().setText(BENUTZER);
            //lvItemWidgetWrapper.getTxtvTicketListViewLayoutCreateDate().setText(ERSTELLUNGS DATUM);
            //lvItemWidgetWrapper.getTxtvTicketListViewLayoutNote().setText(NOTIZ SELBST);

            currentView.setTag(lvItemWidgetWrapper);
        }

        return  currentView;
    }
}
