package WS1.Observables;

import WS1.Nimbus1.Nimbus1PressureSensor;
import WS1.Nimbus1.Nimbus1TemepratureSensor;
import WS1.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    protected List<Observer> itsObservers;

    public Observable(){

        itsObservers = new ArrayList<Observer>();
    }

    public void notifyObservers(int data){
        for (Observer observer: itsObservers)
        {
            observer.update(data);
        }
    }

    public void addObserve(Observer observer){
        itsObservers.add(observer);

        String name = "";

        if (this.getClass() == Nimbus1PressureSensor.class)
            name = "pressure";
        else if (this.getClass() == Nimbus1TemepratureSensor.class)
            name = "temperature";
        else
            name = "pressure trend";

        System.out.println(observer.getClass().getSimpleName()  + " observes " + name );
    }
}
