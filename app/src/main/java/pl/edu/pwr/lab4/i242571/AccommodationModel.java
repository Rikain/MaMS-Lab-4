
package pl.edu.pwr.lab4.i242571;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

public class AccommodationModel implements Serializable {
    private String name;
    private String description;
    private String place;
    private int imgResource;
    private double latitude;
    private double longitude;

    public AccommodationModel(String name, String description, String place, int imgResource, double latitude, double longitude){
        this.name=name;
        this.description=description;
        this.place=place;
        this.imgResource=imgResource;
        this.latitude=latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPlace() {
        return place;
    }

    public int getImageResource() {
        return imgResource;
    }

    public LatLng getCoordinates(){
        return new LatLng(latitude, longitude);
    }
}


