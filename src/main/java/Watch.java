import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Watch {
    private int hour;
    private int min;
    private int sec;

    public Watch(int hour, int min, int sec) {
        if (hour <= 60){
            this.hour = hour;
        }else {
            this.hour = 0;
        }
        if (min <= 60){
            this.min = min;
        }else {
            this.min = 0;
        }
        if (sec <= 60){
            this.sec = sec;
        }else {
            this.sec = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (sec <= 60){
            this.sec = sec;
        }else {
            this.sec = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (hour <= 60){
            this.hour = hour;
        }else {
            this.hour = 0;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (hour <= 60){
            this.hour = hour;
        }else {
            this.hour = 0;
        }
    }

    @Override
    public String toString() {
        return "Watch{" +
                "hour=" + hour +
                ", min=" + min +
                ", sec=" + sec +
                '}';
    }
}
