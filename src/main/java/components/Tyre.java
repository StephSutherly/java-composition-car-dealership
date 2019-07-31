package components;

public class Tyre {
    private boolean front;
    private int trendiness;

    public Tyre(boolean front, int trendiness) {
        this.front = front;
        this.trendiness = trendiness;
    }

    public boolean isFront() {
        return front;
    }

    public int getTrendiness() {
        return trendiness;
    }
}
