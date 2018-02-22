package com.company;

public class Main {

    public static void main(String[] args) {

        Clock kitchenClock = new Clock();

        kitchenClock.setClock(13,40);
        kitchenClock.setAlarm(4,30,"Bird song");

        System.out.println("The time is: " + kitchenClock.displayClock());
        System.out.println("Alarm is set for: " + kitchenClock.clockAlarm.displayAlarm());
        System.out.println("Alarm is active: " + kitchenClock.clockAlarm.isActive());
        System.out.println("Alarm sound is set for: " + kitchenClock.clockAlarm.getAlarmSound());

    }
}
