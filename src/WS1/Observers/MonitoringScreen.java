package WS1.Observers;

import WS1.Observables.WeatherMonitoringSystem;

public class MonitoringScreen {

    public MonitoringScreen(WeatherMonitoringSystem ws){
        System.out.println(getClass().getSimpleName() +  " was created");

        ws.getTemperatureSensor().addObserve(new MSTempObserver(this));
        ws.getPressureSensor().addObserve(new MSPressObserver(this));
    }

    public void displayTemperature (int temperature){
        System.out.println("MonitoringScreen: temperature = " + temperature  + " Celsius");
    }

    public void displayPressure(int pressure){
        System.out.println("MonitoringScreen: pressure = " + pressure + " millibars");
    }
}

