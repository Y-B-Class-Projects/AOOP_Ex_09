package WS1.Observables;


import WS1.Nimbus1.Nimbus1Clock;
import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemepratureSensor;


public class WeatherMonitoringSystem {

    private static WeatherMonitoringSystem single_instance = null;

    private Sensor temperatureSensor;
    private Sensor pressureSensor;
    private PressureTrendSensor pressureTrendSensor;


    public WeatherMonitoringSystem(){
        System.out.println(getClass().getSimpleName() +  " was created");

        //pressureTrendSensor = new PressureTrendSensor();
        //AlarmClock ac = new AlarmClock(Nimbus1Clock.theInstance());
        //pressureSensor = new Sensor(ac, "pressure", 1100 ,new Nimbus1PressureSensor());
        //temperatureSensor = new Sensor(ac, "temperature", 700, new Nimbus1TemepratureSensor());
        //pressureSensor.addObserve(pressureTrendSensor);

    }

    public static WeatherMonitoringSystem theInstance()
    {
        if (single_instance == null)
            single_instance = new WeatherMonitoringSystem();

        return single_instance;
    }

    public Sensor getTemperatureSensor() {
        return temperatureSensor;
    }

    public Sensor getPressureSensor() {
        return pressureSensor;
    }

    public PressureTrendSensor getPressureTrendSensor() {
        return pressureTrendSensor;
    }

    public void setTemperatureSensor(Sensor temperatureSensor) {
         this.temperatureSensor = temperatureSensor;
    }

    public void setPressureSensor(Sensor pressureSensor) {
        this.pressureSensor = pressureSensor;
    }

    public void setPressureTrendSensor(PressureTrendSensor pressureTrendSensor) {
        this.pressureTrendSensor = pressureTrendSensor;
    }
}
