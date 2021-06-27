package WS1.System;

import WS1.API.SensorImp;
import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemepratureSensor;
import WS1.Observables.AlarmClock;
import WS1.Observables.AlarmClockImp;

public class Nimbus1StationToolKit extends StationToolKit {
    public AlarmClockImp getAlarmClock() {
        return new Nimbus1Clock();
    }

    public SensorImp makeSensorImp(String type) throws ClassNotFoundException {
        try
        {
            if (type.equals("pressure")) return new Nimbus1PressureSensor();
            else if (type.equals("temperature")) return new Nimbus1TemepratureSensor();

        }
        catch (Exception e)
        {
            System.out.println("ERROR " + e);
        }

        return null;
    }
}