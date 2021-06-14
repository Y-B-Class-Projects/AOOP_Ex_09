package WS1.Observers;

public class LogPressTrendObserver implements Observer{
    private Log log;

    public LogPressTrendObserver(Log log){
        System.out.println(getClass().getSimpleName() +  " was created");

        this.log = log;
    }

    @Override
    public void update(int data) {
        String txt = "";

        if(data < 0)
            txt = "FALLING";
        else if(data > 0)
            txt = "RISING";
        else
            txt = "STABLE";

        log.displayPressureTrend(txt);
    }
}
