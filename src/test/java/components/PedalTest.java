package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PedalTest {

    Pedal pedal;

    @Before
    public void setUp(){
        pedal = new Pedal();
    }

    @Test
    public void canSlamPedal(){
        pedal.slam();
        assertEquals(true, pedal.getIsDown());
    }

    @Test
    public void canReleasePedal(){
        pedal.slam();
        pedal.release();
        assertEquals(false, pedal.getIsDown());
    }

}
