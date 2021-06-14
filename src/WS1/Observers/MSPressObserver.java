package WS1.Observers;

public class MSPressObserver implements Observer{

    private MonitoringScreen monitoringScreen;

    public MSPressObserver(MonitoringScreen screen){
        this.monitoringScreen = screen;
    }

    @Override
    public void update(int data) {
        monitoringScreen.displayPressure(data);
    }
}
