package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;


public class Log {

    public Log(WeatherMonitoringSystem ws){
        System.out.println(getClass().getSimpleName() +  " was created");

        ws.getPressureSensor().addObserve(new LogPressObserver(this));
        ws.getPressureTrendSensor().addObserve(new LogPressTrendObserver(this));
    }

    public void displayPressure(int pressure){

        System.out.println("Log: pressure = " + pressure + " millibars");
    }

    public void displayPressureTrend(String pressureTrend){
        System.out.println("Log: pressure trend = " + pressureTrend);
    }
}