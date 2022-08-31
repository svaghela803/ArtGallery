package Package;

import java.util.ArrayList;

public class Gallery {

    private ArrayList<Artwork> artwork;
    double till;
    String galleryName;


    public Gallery(double till, String galleryName){
        this.till = 0;
        this.galleryName = galleryName;
        this.artwork = new ArrayList<Artwork>();
    }

    public void sellArtwork(Customer customer, Artwork artwork){
        if(customer.canBuy(artwork) == true){
            customer.buyArtwork(artwork);
            this.stock.remove(artwork);
            setTill(this.till + artwork.getPrice());
        }
    }

    public int artworkCount(){
        return this.stock.size();
    }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }



    public double calculateArtworkValue(){
        double total = 0;
        for(Artwork artwork : this.stock){
            total += artwork.getPrice();
        }
        return total;
    }

//    Getters and setters

    public double gettill(){
        return till;
    }

    public void settill(double till){
        this.till = till;
    }

    public String getgalleryName(String galleryName){
        return galleryName;
    }

    public void setGalleryName(String galleryName){
    this.galleryName = galleryName;
    }

    public void payGallery(){

    }




}
