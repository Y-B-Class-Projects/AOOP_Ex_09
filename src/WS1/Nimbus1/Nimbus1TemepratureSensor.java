package WS1.Nimbus1;

import WS1.Observables.Sensor;
import WS1.Observables.WeatherMonitoringSystem;
import WS1.Observers.MSTempObserver;
import WS1.Observers.MonitoringScreen;

import java.util.Random;



import java.util.Random;

public class Nimbus1TemepratureSensor extends Sensor {
    private static Random rnd;

    public Nimbus1TemepratureSensor(String type, int interval){
        super(type, interval);
        rnd = RandomSupplier.getRnd();

    }

    @Override
    public int read(){
        return  rnd.nextInt(40);
    }
}
