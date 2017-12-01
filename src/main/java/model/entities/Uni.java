package model.entities;

public class Uni {

    private double aDouble;

    public Uni() {
    }

    public Uni(double aDouble) {
        this.aDouble = aDouble;
    }

    public Uni(int aInt) {
        this.aDouble = aInt;
    }

    public void increment(){
        this.aDouble ++;
    }

    public void decriment(){
        this.aDouble --;
    }

    public void change(){
        this.aDouble = -1 * this.aDouble;
    }

    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    @Override
    public String toString() {
        return "Uni{" +
                "aDouble=" + aDouble +
                '}';
    }
}
