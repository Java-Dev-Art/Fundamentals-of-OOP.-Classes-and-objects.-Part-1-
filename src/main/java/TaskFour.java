public class TaskFour {
    private long counter;
    private boolean flag;

    public TaskFour() {
        this.counter = 10;
        this.flag = false;
    }

    public long getCounter() {
        return counter;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void isStart() {
        setFlag(true);
    }

    public void isStop() {
        setFlag(false);
    }

    public void counterIncrease() {
        if (isFlag()) {
            setCounter(getCounter() + 1);
        }
    }

    public void counterDecrease() {
        if (!isFlag()) {
            setCounter(getCounter() - 1);
        }
    }
}
