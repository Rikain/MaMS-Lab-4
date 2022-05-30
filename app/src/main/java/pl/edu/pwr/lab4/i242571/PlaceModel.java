package pl.edu.pwr.lab4.i242571;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.media.Image;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

public class PlaceModel implements Serializable {
    private String name;
    private String description;
    private int imgResource;
    private int videoResource;
    private double latitude;
    private double longitude;
    private String language;

    public PlaceModel(String name, String description, int imgResource, int videoResource, double latitude, double longitude, String language){
        this.name=name;
        this.description=description;
        this.imgResource=imgResource;
        this.latitude=latitude;
        this.longitude = longitude;
        this.videoResource = videoResource;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResource() {
        return imgResource;
    }

    public int getVideoResource() {
        return videoResource;
    }

    public String getLanguage() {
        return language;
    }

    public LatLng getCoordinates(){
        return new LatLng(latitude, longitude);
    }
}


