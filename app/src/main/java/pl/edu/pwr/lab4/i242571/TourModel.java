package pl.edu.pwr.lab4.i242571;

import java.io.Serializable;
import java.util.List;

public class TourModel implements Serializable {

    private String name;
    private String description;
    private int imgResource;
    private List<PlaceModel> places;

    public TourModel(String name, String description, List<PlaceModel> places, int imgResource){
        this.name=name;
        this.description=description;
        this.places=places;
        this.imgResource = imgResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<PlaceModel> getPlaces() {
        return places;
    }

    public int getImageResource() {
        return imgResource;
    }

}