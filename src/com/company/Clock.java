package com.company;

public class Clock {

    int clockHour;
    int clockMin;
    Alarm clockAlarm;

    public Clock() {
        this.clockHour = 0;
        this.clockMin = 0;
        this.clockAlarm = new Alarm();
    }

    public int getClockHour() {
        return clockHour;
    }

    public void setClockHour(int clockHour) {
        if (clockHour >= 0 && clockHour < 24) {
            this.clockHour = clockHour;
        } else {
            System.out.println("Not valid setting!");
        }
    }

    public int getClockMin() {
        return clockMin;
    }

    public void setClockMin(int clockMin) {
        if (clockMin >= 0 && clockMin < 60) {
            this.clockMin = clockMin;
        } else {
            System.out.println("Not valid setting!");
        }
    }

    public String displayClock() {
        String hour;
        String min;
        if (this.getClockHour() < 10) {
            hour = "0" + String.valueOf(this.getClockHour());
        } else {
            hour = String.valueOf(this.getClockHour());
        }
        if (this.getClockMin() < 10) {
            min = "0" + String.valueOf(this.getClockMin());
        } else {
            min = String.valueOf(this.getClockMin());
        }
        return hour + "." + min;
    }

    public void setClock(int hour, int min) {
        this.setClockHour(hour);
        this.setClockMin(min);
    }

    public void setAlarm(int hour, int min, String sound) {
        this.clockAlarm.setAlarmHour(hour);
        this.clockAlarm.setAlarmMin(min);
        this.clockAlarm.setAlarmSound(sound);
    }

}
