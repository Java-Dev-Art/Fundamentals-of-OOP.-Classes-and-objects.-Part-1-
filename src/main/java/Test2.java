public class Test2 {
    private int valueFirst;
    private int valueSecond;

    public Test2(int valueFirst, int valueSecond) {
        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
    }

    public Test2() {
        valueFirst = 0;
        valueSecond = 1;
    }

    public int getValueFirst() {
        return valueFirst;
    }

    public void setValueFirst(int valueFirst) {
        this.valueFirst = valueFirst;
    }

    public int getValueSecond() {
        return valueSecond;
    }

    public void setValueSecond(int valueSecond) {
        this.valueSecond = valueSecond;
    }
}
