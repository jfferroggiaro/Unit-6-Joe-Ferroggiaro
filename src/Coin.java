public class Coin {
    private double value;
    private String name;

    public Coin(double value, String name){
        this.value = value;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name;
    }
}
