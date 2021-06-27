package WS1.Nimbus1;

import WS1.API.SensorImp;
import WS1.Observables.PressureTrendSensor;
import WS1.Observables.Sensor;
import java.util.Random;

import java.util.Random;

public class Nimbus1PressureSensor implements SensorImp {
    private static Random rnd;

    public Nimbus1PressureSensor(){
        rnd = RandomSupplier.getRnd();
    }

    @Override
    public int read(){
        return  rnd.nextInt(1050 - 950 ) + 950;
    }
}
