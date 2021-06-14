package WS1.Observables;

import WS1.Nimbus1.Nimbus1Clock;


public abstract class Sensor extends Observable {
    private int lastReading;
    private int interval;
    private String type;

    public Sensor(String type, int interval){
        this.type = type;
        this.interval = interval;

        (AlarmClock.theInstance()).register(interval,new SensorAlarmListener(this));
    }


    public abstract int read();

    public void check(){
        int pressure = read();
        if(pressure != lastReading)
            notifyObservers(pressure);
        lastReading = pressure;
    }

    public String getType() {
        return type;
    }

}
