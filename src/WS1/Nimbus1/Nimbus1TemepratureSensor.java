package WS1.Nimbus1;

import WS1.API.SensorImp;
import WS1.Observables.Sensor;

import java.util.Random;

public class Nimbus1TemepratureSensor implements SensorImp {
    private static Random rnd;

    public Nimbus1TemepratureSensor(){
        rnd = RandomSupplier.getRnd();
    }

    @Override
    public int read(){
        return  rnd.nextInt(40);
    }
}
