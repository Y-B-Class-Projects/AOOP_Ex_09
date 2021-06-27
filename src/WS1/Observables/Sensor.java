package WS1.Observables;

import WS1.API.SensorImp;
import WS1.System.StationToolKit;


public class Sensor extends Observable {
    private int lastReading;
    private int interval;
    public String type;
    protected SensorImp itsSensorImp;

    public Sensor(AlarmClock alarmClock, StationToolKit st , String type, int interval) throws ClassNotFoundException {
        this.type = type;
        this.interval = interval;
        this.itsSensorImp = st.makeSensorImp(type);


        alarmClock.register(interval,new SensorAlarmListener(this));
    }


    public int read(){
        return itsSensorImp.read();
    }

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
