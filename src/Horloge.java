import java.util.Calendar;
import java.util.Observable;

public class Horloge extends Observable {
    private int hour, minute, second;

    public Horloge() {
        configureHorloge();
    }

    public void configureHorloge() {
        Calendar calendar = Calendar.getInstance();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
    }

    public void updateTime() throws InterruptedException {
        while (true) {
            setChanged();
            notifyObservers(this.getFullHour());
            Thread.sleep(1000);
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String getFullHour() {
        return hour + ":" + minute + ":" + second;
    }
}