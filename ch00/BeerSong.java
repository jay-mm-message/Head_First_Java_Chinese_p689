
public class BeerSong {

    private int beerNum = 99;
    private String word = "bottles";

    private void info() {
        System.out.println(beerNum + "  " + word + " of beer on the wall");
        System.out.println(beerNum + " " + word + " of beer.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");    
    }
    public static void main(String[] args) {

        BeerSong beerSong = new BeerSong();
        while(beerSong.beerNum > 0) {

            if (beerSong.beerNum == 1) {
                beerSong.word = "bottles";
            }

            beerSong.info();
            --beerSong.beerNum;

            if (beerSong.beerNum > 0) {
                System.out.println("beerNum" + " " + beerSong.word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }
}