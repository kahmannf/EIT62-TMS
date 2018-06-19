package de.markuskuhlemann.eit62.rvwbk.tms_android_app.Wrapper;

import android.widget.TextView;

/**
 * Created by Oliver on 18.06.2018.
 */

public class TicketListViewItemWidgetWrapper
{
    //Widgets
    private TextView txtvTicketListViewLayoutUser = null;
    private TextView txtvTicketListViewLayoutCreateDate = null;
    private TextView txtvTicketListViewLayoutNote = null;

    public void TicketListViewItemWidgetWrapper()
    {

    }

    public void TicketListViewItemWidgetWrapper(TextView txtvTicketListViewLayoutUser, TextView txtvTicketListViewLayoutCreateDate, TextView txtvTicketListViewLayoutNote)
    {
        setTxtvTicketListViewLayoutUser(txtvTicketListViewLayoutUser);
        setTxtvTicketListViewLayoutCreateDate(txtvTicketListViewLayoutCreateDate);
        setTxtvTicketListViewLayoutNote(txtvTicketListViewLayoutNote);
    }

    public TextView getTxtvTicketListViewLayoutUser() {return txtvTicketListViewLayoutUser;}
    public TextView getTxtvTicketListViewLayoutCreateDate() {return txtvTicketListViewLayoutCreateDate;}
    public TextView getTxtvTicketListViewLayoutNote() {return txtvTicketListViewLayoutNote;}

    public void setTxtvTicketListViewLayoutUser(TextView txtvTicketListViewLayoutUser) {this.txtvTicketListViewLayoutUser = txtvTicketListViewLayoutUser;}
    public void setTxtvTicketListViewLayoutCreateDate(TextView txtvTicketListViewLayoutCreateDate) {this.txtvTicketListViewLayoutCreateDate = txtvTicketListViewLayoutCreateDate;}
    public void setTxtvTicketListViewLayoutNote(TextView txtvTicketListViewLayoutNote) {this.txtvTicketListViewLayoutNote = txtvTicketListViewLayoutNote;}


}
