package WS1.System;

import WS1.API.SensorImp;
import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Observables.AlarmClock;
import WS1.Observables.PressureTrendSensor;
import WS1.Observables.Sensor;
import WS1.Observables.WeatherMonitoringSystem;
import WS1.Observers.Log;
import WS1.Observers.MonitoringScreen;

import java.util.Scanner;

public class MainClassWS2
{

    public static void main(String[] args) {
        try
        {
            System.out.println("Please Enter the toolkit name:");

            Scanner in;
            in = new Scanner(System.in);

            String str = in.nextLine();


            Class tkClass = Class.forName(str);
            StationToolKit st = (StationToolKit) tkClass.newInstance();

            WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();
            AlarmClock ac = new AlarmClock(st);

            Sensor pressure_sensor = new Sensor(ac, st, "pressure", 1100);
            Sensor temperature_sensor = new Sensor(ac, st, "temperature", 700);
            PressureTrendSensor pressureTrendSensor = new PressureTrendSensor();

            pressure_sensor.addObserve(pressureTrendSensor);

            ws.setTemperatureSensor(temperature_sensor);
            ws.setPressureSensor(pressure_sensor);
            ws.setPressureTrendSensor(pressureTrendSensor);

            MonitoringScreen p_MonitorScreen = new MonitoringScreen(ws);
            Log p_log = new Log(ws);

        }
        catch (Exception e)
        {
            System.out.println("ERROR " + e);
        }
    }
}
