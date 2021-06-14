package WS1.Observables;


public class WeatherMonitoringSystem {
    private static WeatherMonitoringSystem single_instance = null;

    public static WeatherMonitoringSystem theInstance()
    {
        if (single_instance == null)
            single_instance = new WeatherMonitoringSystem();

        return single_instance;
    }
}
