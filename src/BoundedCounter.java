
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperBound;

    public BoundedCounter(int upperBoundAtStart) {
        this.value = 0;
        this.upperBound = upperBoundAtStart;
    }
    public BoundedCounter(int startValue, int upperBoundAtStart) {
        this.value = startValue;
        this.upperBound = upperBoundAtStart;
    }

    public void next() {
        if (value < upperBound) {
            value++;
        } else {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= upperBound) {
            this.value = newValue;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
}
