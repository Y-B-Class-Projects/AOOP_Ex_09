package WS1.Observers;

public class MSPressObserver implements Observer{

    private MonitoringScreen monitoringScreen;

    public MSPressObserver(MonitoringScreen screen){
        System.out.println(getClass().getSimpleName() +  " was created");

        this.monitoringScreen = screen;
    }

    @Override
    public void update(int data) {
        monitoringScreen.displayPressure(data);
    }
}
