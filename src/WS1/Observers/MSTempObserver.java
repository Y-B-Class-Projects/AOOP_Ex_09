package WS1.Observers;

public class MSTempObserver implements Observer{
    private MonitoringScreen monitoringScreen;

    public MSTempObserver(MonitoringScreen screen){
        System.out.println(getClass().getSimpleName() +  " was created");

        this.monitoringScreen = screen;
    }

    @Override
    public void update(int data) {
        monitoringScreen.displayTemperature(data);
    }
}
