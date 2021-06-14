package WS1.Observables;


import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemepratureSensor;


public class WeatherMonitoringSystem {

    private static WeatherMonitoringSystem single_instance = null;

    private Nimbus1TemepratureSensor temperatureSensor;
    private Nimbus1PressureSensor pressureSensor;
    private PressureTrendSensor pressureTrendSensor;


    public WeatherMonitoringSystem(){
        System.out.println(getClass().getSimpleName() +  " was created");

        AlarmClock clock = Nimbus1Clock.theInstance();

        pressureTrendSensor = new PressureTrendSensor();
        pressureSensor = new Nimbus1PressureSensor("pressure", 1100);
        temperatureSensor = new Nimbus1TemepratureSensor("temperature", 700);

        pressureSensor.addObserve(pressureTrendSensor);

    }

    public static WeatherMonitoringSystem theInstance()
    {
        if (single_instance == null)
            single_instance = new WeatherMonitoringSystem();

        return single_instance;
    }

    public Nimbus1TemepratureSensor getTemperatureSensor() {
        return temperatureSensor;
    }

    public Nimbus1PressureSensor getPressureSensor() {
        return pressureSensor;
    }

    public PressureTrendSensor getPressureTrendSensor() {
        return pressureTrendSensor;
    }
}
