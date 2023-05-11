package ss4_class_and_object.bai_tap.stop_watch;

import java.util.Date;

public class StopWatch {
    long millisecondStart;
    long millisecondEnd;
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
        this.endTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public void start(){
        this.millisecondStart = System.currentTimeMillis();
        this.startTime = new Date(millisecondStart);
        System.out.println(startTime);

    }
    public void  stop(){
        this.millisecondEnd = System.currentTimeMillis();
        this.endTime = new Date(millisecondEnd);
        System.out.println(endTime);
    }

    public long getElapsedTime(){
        long elapsedTime = this.millisecondEnd -this.millisecondStart;
        return  elapsedTime;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
