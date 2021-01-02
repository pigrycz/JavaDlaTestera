package model.computer;

public class Laptop extends Computer implements Music, Video {

    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low!");
        }
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    @Override
    public void switchOff(){
        System.out.println("Wyłączam laptopa: " + name);
        state = false;
    }

    @Override
    public int volumeUp(){
        volumeLevel +=5;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }


    @Override
    public int volumeDown(){
        volumeLevel -= 5;
        if(volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }

    @Override
    public int volumeUp(int increment) {
        if (increment < 0) {
            System.out.println("Volume change should be a positive number. Volume has not been changed");
        } else {
            volumeLevel += increment;
            if (volumeLevel > 100) {
                volumeLevel = 100;
            }
        }
        return volumeLevel;
    }

    @Override
    public int volumeDown(int increment){
        if (increment < 0) {
            System.out.println("Volume change should be a positive number. Volume has not been changed");
        } else {
            volumeLevel -= increment;
            if (volumeLevel < 0) {
                volumeLevel = 0;
            }
        }
        return volumeLevel;
    }

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause Music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");
    }

    @Override
    public void playVideo() {
        System.out.println("Play video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pause video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Stop video");
    }
}
