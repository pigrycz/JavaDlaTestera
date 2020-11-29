package model.computer;

public class PC extends Computer {

    private boolean powerSupply;

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram);
        this.powerSupply = false;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (powerSupply == true) {
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
}
