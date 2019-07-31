package components;

public class EngineElectric extends Engine{
    private int batteryPercentage;
    public EngineElectric(){
        super("not much","loads of");
        this.batteryPercentage=100;
    }

    public boolean hasEnergy() {
        if (batteryPercentage>0)
            return true;
        return false;
    }


    public void setEnergy(int amount){
        batteryPercentage=amount;
    }
}
