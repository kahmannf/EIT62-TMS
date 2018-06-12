package de.markuskuhlemann.eit62.rvwbk.tms_android_app.APIClient.Model;

public class TicketPage {
    Integer offset;
    Integer limit;
    Integer total;
    Ticket[] items;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Ticket[] getItems() {
        return items;
    }

    public void setItems(Ticket[] items) {
        this.items = items;
    }
}
