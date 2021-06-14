package WS1.Observables;

import java.util.List;

import java.util.List;

public class AlarmClockRecord {
    private int interval;
    private int intervalDecrement;
    private AlarmListener alarmListeners;

    public AlarmClockRecord(int interval, AlarmListener alarmListeners){
        this.interval = interval;
        intervalDecrement = interval;
        this.alarmListeners = alarmListeners;

    }

    public int getIntervalDecrement(){
        return intervalDecrement;
    }

    public AlarmListener getListener(){
        return alarmListeners;
    }

    public void setIntervalDecrement(int intervalDecrement){
        this.intervalDecrement = intervalDecrement;
    }

    public int getInterval(){
        return interval;
    }
}
