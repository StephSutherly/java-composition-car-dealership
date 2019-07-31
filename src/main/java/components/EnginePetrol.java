package components;

public class EnginePetrol extends Engine{
    private int petrolTankPercentage;
    public EnginePetrol(){
        super("lots of","little");
        this.petrolTankPercentage=100;
    }

    public boolean hasEnergy() {
        if (petrolTankPercentage>0)
            return true;
        return false;
    }

    public void setEnergy(int amount){
        petrolTankPercentage=amount;
    }
}
