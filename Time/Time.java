public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 5;
        minute = 5;
        second = 27;
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour == 24) {
            hour = 0;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute == 60) {
            this.minute = 0;
            setHour(this.hour + 1);
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second == 60) {
            this.second = 0;
            setMinute(this.minute + 1);
        } else {
            this.second = second;
        }
    }

    public String toString() {
        return "The Time is " + String.format("%02d:%02d:%02d",this.getHour(),this.getMinute(),this.getSecond());
    }
}
