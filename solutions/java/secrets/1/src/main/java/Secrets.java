public class Secrets {
    // task 1: shift back the bits
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }
    // task 2: set some bits to 1.
    public static int setBits(int value, int mask) {
        return value | mask;
    }
    // task 3: flip specific bits
    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }
    // task 4: clear specific bits
    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}