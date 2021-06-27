package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Observables.AlarmClockRecord;
import WS1.Observables.AlarmListener;
import WS1.System.StationToolKit;

import java.util.ArrayList;



import java.util.ArrayList;

public class AlarmClock implements ClockListener
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();


    public AlarmClock(StationToolKit st) {
        st.getAlarmClock().addClockListener(this);
    }


    @Override
    public void tic() {
        for (AlarmClockRecord record : itsAlarmClockRecords) {
            if (record.getIntervalDecrement() - CLOCK_INTERVAL_MILLIS <= 0){
                record.getListener().wakeUp();
                record.setIntervalDecrement(record.getInterval());
            }
            else record.setIntervalDecrement(record.getIntervalDecrement() - CLOCK_INTERVAL_MILLIS);

        }
    }

    public void register(int interval, AlarmListener pal) {
        System.out.println(pal.getName() + " registered to clock");

        itsAlarmClockRecords.add(new AlarmClockRecord(interval, pal));
    }


}

