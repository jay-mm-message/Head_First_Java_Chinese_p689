public class DVDPlayerTestDrive {
    public static void main(String[] args) throws Exception {
        DVDPlayer d = new DVDPlayer();

        d.canRecord = true;
        d.playDVD();

        if (d.canRecord) {
            d.recordDVD();
        }
    }
}
