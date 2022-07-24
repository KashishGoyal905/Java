package _6_OOPS;

public class _4_car extends _4_vehicle {
    int numGears;
    boolean isConvertible;

    public void print() {
        System.out.println(" car color: " + color + ", car speed: " + getMaxSpeed());
        System.out.println(" car gears: " + numGears + ", car isConvertible: " + isConvertible);

    }
}
