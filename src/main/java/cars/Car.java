package cars;

import components.*;

import java.util.ArrayList;

public class Car {

    private String colour;
    private int price;
    private ArrayList<Engine> engines;
    private Tyre[] tyres = new Tyre[4];
    private SteeringWheel steeringWheel;
    Pedal acceleratePedal;
    Pedal breakPedal;
    private Pedal clutchPedal;

    public Car(String colour, int price, EngineType type, boolean isAuto) {
        this.colour = colour;
        this.price = price;
        this.engines = new ArrayList<>();
        switch (type){
            case HYBRID:
                this.engines.add(new EngineElectric());
                this.engines.add(new EnginePetrol());
                break;
            case ELECTRIC:
                this.engines.add(new EngineElectric());
                break;
            case PETROL:
                this.engines.add(new EnginePetrol());
                break;
        }

        this.tyres[0] = new Tyre(true, 8);
        this.tyres[1] = new Tyre(true, 8);
        this.tyres[2] = new Tyre(false, 8);
        this.tyres[3] = new Tyre(false, 8);
        this.steeringWheel = new SteeringWheel("circle");
        acceleratePedal = new Pedal();
        breakPedal = new Pedal();
        clutchPedal = null;
        if (!isAuto)
            clutchPedal = new Pedal();
    }

    public ArrayList<Engine> getEngines() {
        return engines;
    }

    public Pedal getClutchPedal() {
        return clutchPedal;
    }

    public Engine chooseEngine(){
        if (engines.get(0).hasEnergy())
            return engines.get(0);
        if (engines.get(1).hasEnergy())
            return engines.get(1);
        return null;
    }

    public String turnOnEngine() {
        Engine engine = chooseEngine();
        if (engine==null)
            return "no, car won't start!!";

        return engine.turnOn();
    }
}
