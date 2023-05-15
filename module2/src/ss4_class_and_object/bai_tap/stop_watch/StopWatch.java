package ss4_class_and_object.bai_tap.stop_watch;

import java.util.Date;

public class StopWatch {
    long millisecondStart;
    long millisecondEnd;



    public void start() {
        this.millisecondStart = System.currentTimeMillis();
        System.out.println(millisecondStart);

    }

    public void stop() {
        this.millisecondEnd = System.currentTimeMillis();
        System.out.println(millisecondEnd);
    }

    public long getElapsedTime() {
        return this.millisecondEnd - this.millisecondStart;
    }
    @Override
  
    public String toString() {
        return "StopWatch{" +
                "millisecondStart=" + millisecondStart +
                ", millisecondEnd=" + millisecondEnd +
                '}';
    }
}

