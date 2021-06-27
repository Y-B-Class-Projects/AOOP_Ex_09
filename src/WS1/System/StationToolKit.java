package WS1.System;

import WS1.API.SensorImp;
import WS1.Observables.AlarmClock;
import WS1.Observables.AlarmClockImp;

public abstract class StationToolKit {

    public abstract SensorImp makeSensorImp(String type) throws ClassNotFoundException;
    public abstract AlarmClockImp getAlarmClock();
}