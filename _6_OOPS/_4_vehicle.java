package _6_OOPS;

public class _4_vehicle {
    String color;
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("vehicle color: " + color + ", vehicle speed: " + maxSpeed);
    }

}
