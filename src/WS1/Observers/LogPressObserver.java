package WS1.Observers;

public class LogPressObserver implements Observer{
    private Log log;

    public LogPressObserver(Log log){
        this.log = log;
    }

    @Override
    public void update(int data) {
        log.displayPressure(data);
    }
}