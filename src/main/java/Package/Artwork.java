package Package;

public class Artwork {

String title;
String artist;
private double price;
int nft;



public Artwork(String title, String artist, double price, int nft) {
    this.title = title;
    this.artist = artist;
    this.price = price;
    this.nft = nft;
}
//getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
    this.title = title;
    }

    public String getArtist() {
    return artist;
    }

    public void setArtist(String artist){
    this.artist = artist;
    }

    public double getPrice() {
    return price;
    }


    public int getNft() {
    return nft;
    }


public void acceptPayment(int payment) { price += payment;}



}



