package pl.edu.pwr.lab4.i242571;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.media.Image;

import java.io.Serializable;

public class EventModel implements Serializable {
    String name;
    String description;
    String place;
    int imgResource;

    public EventModel(String name, String description, String place, int imgResource){
        this.name=name;
        this.description=description;
        this.place=place;
        this.imgResource=imgResource;
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
}


