package components;

public class Pedal {

    private boolean isDown;

    public Pedal() {
        this.isDown = false;
    }

    public void slam(){
        this.isDown = true;
    }

    public void release(){
        this.isDown = false;
    }

    public boolean getIsDown() {
        return isDown;
    }

}
