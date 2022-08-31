package Package;

import java.util.ArrayList;

public class Gallery {

    private ArrayList<Artwork> stock;
    double till;
    String galleryName;


    public Gallery(String galleryName){
        this.till = 0;
        this.galleryName = galleryName;
        this.stock = new ArrayList<Artwork>();
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

    public double getTill(){
        return till;
    }

    public void setTill(double till){
        this.till = till;
    }

    public String getGalleryName(String galleryName){
        return galleryName;
    }

    public void setGalleryName(String galleryName){
    this.galleryName = galleryName;
    }

    public void payGallery(){

    }




}
