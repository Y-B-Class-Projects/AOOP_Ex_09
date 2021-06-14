package WS1.Observers;

public class LogPressTrendObserver implements Observer{
    private Log log;

    public LogPressTrendObserver(Log log){
        this.log = log;
    }

    @Override
    public void update(int data) {
        log.displayPressureTrend(data);
    }
}
