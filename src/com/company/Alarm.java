package com.company;

public class Alarm {

    int alarmHour;
    int alarmMin;
    String alarmSound;
    boolean isActive;

    public Alarm() {
        this.alarmHour = 7;
        this.alarmMin = 30;
        this.alarmSound = "Ring";
        this.isActive = true;
    }

    public int getAlarmHour() {
        return alarmHour;
    }

    public void setAlarmHour(int alarmHour) {
        if (alarmHour >= 0 && alarmHour < 24) {
            this.alarmHour = alarmHour;
        } else {
            System.out.println("Not valid setting!");
        }
    }

    public int getAlarmMin() {
        return alarmMin;
    }

    public void setAlarmMin(int alarmMin) {
        if (alarmMin >= 0 && alarmMin < 60) {
            this.alarmMin = alarmMin;
        } else {
            System.out.println("Not valid setting!");
        }
    }

    public String getAlarmSound() {
        return alarmSound;
    }

    public void setAlarmSound(String alarmSound) {
        this.alarmSound = alarmSound;
    }

    public boolean isActive() {
        return isActive;
    }

    public void activeAlarm() {
        isActive = true;
    }

    public void deactiveAlarm() {
        isActive = false;
    }

    public String displayAlarm() {
        String hour;
        String min;
        if (this.getAlarmHour() < 10) {
            hour = "0" + String.valueOf(this.getAlarmHour());
        } else {
            hour = String.valueOf(this.getAlarmHour());
        }
        if (this.getAlarmMin() < 10) {
            min = "0" + String.valueOf(this.getAlarmMin());
        } else {
            min = String.valueOf(this.getAlarmMin());
        }
        return hour + "." + min;
    }

}
