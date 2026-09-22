import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    // task 1 : generate random PlanetClass
    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    // task 2: generate random RegistryNumber
    String randomShipRegistryNumber() {
        int regNumber = 1000 + random.nextInt(9000);
        return "NCC-" + regNumber;
    }

    // task 3: Generate random stardate
    double randomStardate() {
        return 41000.0 + (1000.0 * random.nextDouble());
    }
}
