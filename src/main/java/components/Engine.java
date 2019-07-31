package components;

public abstract class Engine {
    private String oompf;
    private String greenness;

    public Engine(String oompf,String greenness) {
        this.oompf = oompf;
        this.greenness=greenness;
    }

    public String revUp(){
        return "vrooooom. the engine revved up with "+greenness+" concern for the environment";
    }

    public String turnOn(){
        return "vroooom. the engine turned on with "+oompf+" energy";
    }

    public String turnOff(){
        return "the engine turned off and went to bed";
    }

    public abstract boolean hasEnergy();

    public abstract void setEnergy(int amount);
}
