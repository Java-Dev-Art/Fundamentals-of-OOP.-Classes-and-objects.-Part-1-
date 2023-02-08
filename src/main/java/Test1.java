public class Test1 {
    private int numberFirst;
    private int numberSecond;

    public Test1(int numberFirst, int numberSecond) {
        this.numberFirst = numberFirst;
        this.numberSecond = numberSecond;
    }
    public int getNumberFirst() {
        return numberFirst;
    }

    public void setNumberFirst(int numberFirst) {
        this.numberFirst = numberFirst;
    }

    public int getNumberSecond() {
        return numberSecond;
    }

    public void setNumberSecond(int numberSecond) {
        this.numberSecond = numberSecond;
    }

    public void print(){
        System.out.println("numberFirst =" + getNumberFirst());
        System.out.println("secondNumber =" + getNumberSecond());
    }
    public void someLargerNumber(){
        System.out.println(numberIsLarger()+"is the largest");
    }
    public int numberIsLarger(){
        if (getNumberSecond() > getNumberFirst()){
            return getNumberSecond();
        }else {
            return getNumberFirst();
        }
    }
    public int changeNumber(){
        if (sum() <= 20){
            setNumberFirst(getNumberFirst() + 100);
          return getNumberFirst()  ;
        }else {
            setNumberSecond(getNumberSecond() + 21);
            return getNumberSecond();
        }
    }
    public int sum(){
        return getNumberFirst() + getNumberSecond();
    }
}
