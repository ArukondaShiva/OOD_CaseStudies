package automatedcustomeraddisplayimpl;

import enumerationimpl.Status;

public class DisplayBoard {

    public Status status;

    public DisplayBoard(){
        this.status = Status.AVAILABLE;
    }

    public void update(Status newStatus){
        this.status = newStatus;
    }

}
