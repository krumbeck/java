public class JedliksToyCar {
    // fields
    private int drivenDistance;
    private int batteryPercentage = 100;

    public static JedliksToyCar buy() {
        // create new instance
        return new JedliksToyCar(); 
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", drivenDistance);
    }

    public String batteryDisplay() {
        if (batteryPercentage <= 0) {
            return "Battery empty";
        } else {
            return "Battery at " + batteryPercentage + "%";
        }
    }

    public void drive() {
        if (batteryPercentage > 0) {
            drivenDistance += 20;
            batteryPercentage -= 1;   
        } 
    }
}
