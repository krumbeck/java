class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // zumindest einer der Gruppe muss wach sein
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
        
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // prisoner muss wach sein und archer muss schlafen
        return !archerIsAwake && prisonerIsAwake;
        
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // zwei Wege
        if (petDogIsPresent && !archerIsAwake || !petDogIsPresent && !archerIsAwake && !knightIsAwake && prisonerIsAwake) {
            return true;
        } else {
            return false;
        }
    }
}
