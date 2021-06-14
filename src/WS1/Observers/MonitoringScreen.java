package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {
    private WeatherMonitoringSystem ws;

    public MonitoringScreen(WeatherMonitoringSystem ws){
        this.ws = ws;
    }

    public void displayTemperature (int temperature){
        System.out.println("MonitoringScreen: temperature = " + temperature  + "Celsius");
    }

    public void displayPressure(int pressure){
        System.out.println("MonitoringScreen: pressure = " + pressure + "millibars");
    }
}
