package Dot;

import java.util.concurrent.locks.Condition;

public class Trigg {
    String _id;
    int _v;
    conditions []conditions= new conditions[4];
    time_period time_period  = new time_period();


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int get_v() {
        return _v;
    }

    public void set_v(int _v) {
        this._v = _v;
    }

    public Dot.conditions[] getConditions() {
        return conditions;
    }

    public void setConditions(Dot.conditions[] conditions) {
        this.conditions = conditions;
    }

    public Dot.time_period getTime_period() {
        return time_period;
    }

    public void setTime_period(Dot.time_period time_period) {
        this.time_period = time_period;
    }
}
