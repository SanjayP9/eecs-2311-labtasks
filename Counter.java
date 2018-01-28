
public class Counter {

    private int data;

    public Counter() {
        data = 0;
    }

    public int increment() {
        data++;
        return data;
    }

    public int increment(int inc) {
        data += inc;
        return data;
    }

    public int decrement() {
        data--;
        return data;
    }

    public int decrement(int dec) {
        data -= dec;
        return data;
    }

    public void reset() {
        data = 0;
    }

    public int getData() {
        return data;
    }
}