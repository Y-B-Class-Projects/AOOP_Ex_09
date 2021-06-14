package WS1.Observables;

import WS1.Observers.Observer;

public class PressureTrendSensor extends Observable implements Observer{
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;
    int pressureState;
    int lastState;

    public PressureTrendSensor(){
        lastReading1 = 0;
        lastReading2 = 0;
        lastReading3 = 0;
        lastState = 0;

    }

    public int calc(){
        if(lastReading1 > lastReading2 && lastReading2 > lastReading3)
            return -1;
        else if(lastReading1 < lastReading2 && lastReading2 < lastReading3)
            return 1;
        else
            return 0;
    }

    public void check(){

        int trend = calc();
        if(trend != lastState){
            notifyObservers(trend);
        }
        lastState = trend;
    }


    @Override
    public void update(int data) {
        lastReading1 = lastReading2;
        lastReading2 = lastReading3;
        lastReading3 = data;

        check();
    }
}
