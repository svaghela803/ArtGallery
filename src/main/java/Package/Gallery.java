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

//    public  getArtCollection(){
//    return artCollection;
//    }

//    public void setArtCollection(String artCollection){
//    this.artCollection = artCollection;
//    }


//    public void addArtwork (Artwork artwork){
//        this.artwork.add(artwork);
//    }
//
//    public ArrayList<Artwork> getArtwork(){
//        return this.artwork;
//    }
//



}
