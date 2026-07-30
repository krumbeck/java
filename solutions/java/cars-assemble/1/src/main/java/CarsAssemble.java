public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int productionBase = 221; // falls sich an der Produktionsrate etwas ändert

        if (speed == 0) {
            return 0.0;
        } else if (speed >= 1 && speed <=4) {
            return speed * productionBase;
        } else if (speed >= 5 && speed <= 8) {
            return speed * productionBase * 0.9;
        } else if (speed == 9) {
            return speed * productionBase * 0.8;
        } else if (speed == 10) {
            return speed * productionBase * 0.77;
        }
        return 0.0; // zur Sicherheit, falls ungültige Zahl übergeben wird
    }

    public int workingItemsPerMinute(int speed) {
        // productionRatePerHour/60 , dann runden
        
        double carsPerMinute = productionRatePerHour(speed) / 60;
        int workingCars = (int) carsPerMinute;
        return workingCars;
        
    }
}
