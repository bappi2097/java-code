package digitalclock;

import java.util.Date;

public class ClockThread extends Thread {

    DigitalClock dc;
    String time;

    public ClockThread(DigitalClock dc) {
        this.dc = dc;
        start();
    }

    @Override
    public void run() {
        while (true) {
            time = "" + new Date().toLocaleString();
            dc.jlabClock.setText(time);
        }
    }
}
