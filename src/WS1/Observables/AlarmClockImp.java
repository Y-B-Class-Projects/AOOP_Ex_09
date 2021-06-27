package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;

import java.util.ArrayList;

public class AlarmClockImp {
    protected final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClockImp instance = null;

    protected ArrayList<ClockListener> itsClockListeners;

    public AlarmClockImp(){
        itsClockListeners = new ArrayList<>();
    }

    public void addClockListener(ClockListener listener){
        itsClockListeners.add(listener);
    }

    public void notifyClockListeners(){
        for(ClockListener cl: itsClockListeners){
            cl.tic();
        }
    }

    public static AlarmClockImp theInstance()
    {
        if(null==instance)
            instance = new Nimbus1Clock();
        return instance;
    }
}