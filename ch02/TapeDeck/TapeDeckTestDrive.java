public class TapeDeckTestDrive {
    public static void main(String[] args) {
        TapeDeck test = new TapeDeck();

        test.canRecord = true;
        test.playTape();

        if (test.canRecord) {
            test.recordTape();
        }
    }
}
