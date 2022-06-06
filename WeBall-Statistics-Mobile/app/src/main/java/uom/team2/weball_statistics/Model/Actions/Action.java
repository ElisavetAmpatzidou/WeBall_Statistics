package uom.team2.weball_statistics.Model.Actions;

public abstract class Action {
    protected int id; //Action id
    protected String actionDesc;
    protected String timeHappened;

    public Action (String timeHappened, int id) {
        this.id = id;
        this.timeHappened = timeHappened;
    }

    //Method that will set the value that we want to appear to the action ui
    //set value to the actionDesc field cause this will returned to appear
    protected abstract String formatActionDesc ();

    public String getActionDesc() {
        return this.actionDesc;
    };

    public String getTimeHappened() {
        return this.timeHappened;
    };

    public int getId() {
        return id;
    }
}
