package components;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EngineElectricTest {

    EngineElectric engine1;

    @Before
    public void setUp(){
        engine1 = new EngineElectric();
    }

    @Test
    public void canRevUp(){
        assertEquals("vrooooom. the engine revved up with loads of concern for the environment",engine1.revUp());
    }


    @Test
    public void canTurnOn(){
        assertEquals("vroooom. the engine turned on with not much energy",engine1.turnOn());
    }

    @Test
    public void canTurnOff(){
        assertEquals("the engine turned off and went to bed",engine1.turnOff());
    }


}
