package components;

import cars.Car;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class CarTest {

    private Car mycar;

    @Before
    public void setUp(){
        mycar = new Car("green",300,EngineType.ELECTRIC,true);
    }

    @Test
    public void electricCarHasOneElectricEngine(){
        mycar = new Car("green",300,EngineType.ELECTRIC,true);
        assertEquals(1,mycar.getEngines().size());
    }

    @Test
    public void petrolCarHasOnePetrolEngine(){
        mycar = new Car("green",300,EngineType.PETROL,true);
        assertEquals(1,mycar.getEngines().size());
    }

    @Test
    public void hybridCarHasTwoEngines(){
        mycar = new Car("green",300,EngineType.HYBRID,true);
        assertEquals(2,mycar.getEngines().size());
    }

    @Test
    public void autoCarDoesNotHaveClutch(){
        assertNull(mycar.getClutchPedal());
    }

    @Test
    public void manualCarDoesHaveClutch(){
        mycar = new Car("green",300,EngineType.HYBRID,false);
        assertNotNull(mycar.getClutchPedal());
    }

    @Test
    public void electricCarCanTurnOn(){
        assertEquals("vroooom. the engine turned on with not much energy", mycar.turnOnEngine());
    }

    @Test
    public void electricCarCannotTurnOnIfNoEnergy(){
        assertEquals("vroooom. the engine turned on with not much energy", mycar.turnOnEngine());
    }

}
