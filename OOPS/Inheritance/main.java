public class Main {
    public static void main(String[] args) {

        Car c = new Car("Maruti", "800", 4, 5, "Automatic");
        c.startengine();
        c.startAC();
        c.stopengine();
        c.transmissionType();
        c.noOfdoors();
        c.noOfTyres();

        motorCycle m = new motorCycle("GT", "650", 2, "U", "Soft");
        m.startengine();
        m.wheelie();
        m.stopengine();
        m.handlBarstyle();
        m.suspensionType();

    }
}
