package _6_OOPS;

public class _4_vehicleUse {
    public static void main(String[] args) {
        // vehicle class object
        _4_vehicle v = new _4_vehicle();
        v.setMaxSpeed(12);
        v.color = "gray";
        v.print();

        // car class object
        _4_car c = new _4_car();
        c.numGears = 4;
        c.color="black";
        c.setMaxSpeed(20);
        // it's gonna check if car class has pirnt func or not otherwise go to parent class.
        c.print();
    }

}
