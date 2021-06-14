package WS1.Observables;

public class SensorAlarmListener implements AlarmListener{
    private Sensor itsTemperatureSensor;
    public SensorAlarmListener(Sensor sensor){
        itsTemperatureSensor = sensor;

    }

    @Override
    public void wakeUp() {
        itsTemperatureSensor.check();
    }

    @Override
    public String getName() {
        return itsTemperatureSensor.getType();
    }
}
