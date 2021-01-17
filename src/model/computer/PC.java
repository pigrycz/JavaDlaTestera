package model.computer;

public class PC extends Computer {

    private boolean powerSupply;

    public PC(String name, String type, Hdd hdd, Ram ram) {
        super(name, type, hdd, ram);
        this.powerSupply = false;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (powerSupply) {
            super.switchOn();
        } else {
            System.out.println("Put the plug in the power outlet");
        }
    }

    public boolean getPowerSupply() {
        return powerSupply;
    }

    public void plugIn(){
        powerSupply = true;
    }

    public void plugOut(){
        powerSupply = false;
    }

    @Override
    public void switchOff(){
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }

    @Override
    public int volumeUp(){
        volumeLevel +=1;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
        }
        return volumeLevel;
    }


    @Override
    public int volumeDown(){
        volumeLevel -= 1;
        if(volumeLevel <= 0) {
            volumeLevel = 0;
        }
        return volumeLevel;
    }

    @Override
    public int volumeUp(int increment) {
        throw new UnsupportedOperationException("nie wspoierana metoda");
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
}
