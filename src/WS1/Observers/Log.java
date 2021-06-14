package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class Log {
    private WeatherMonitoringSystem ws;

    public  Log(WeatherMonitoringSystem ws){
        this.ws = ws;
    }

    public void displayPressure(int pressure){
        System.out.println("Log: pressure = " + pressure + "millibars");
    }

    public void displayPressureTrend(int pressureTrend){
        System.out.println("Log: pressure trend = " + pressureTrend);
    }
}