package WS1.System;

import WS1.Nimbus1.Nimbus1Clock;
import WS1.Observables.AlarmClock;
import WS1.Observables.WeatherMonitoringSystem;
import WS1.Observers.Log;
import WS1.Observers.MonitoringScreen;

public class MainClassWS1
{

    public static void main(String[] args) throws ClassNotFoundException {
        WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();

        MonitoringScreen p_MonitorScreen = new MonitoringScreen(ws);
        Log p_log = new Log(ws);

    }
}
