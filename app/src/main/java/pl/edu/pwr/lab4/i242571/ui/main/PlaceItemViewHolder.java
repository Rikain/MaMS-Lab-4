package pl.edu.pwr.lab4.i242571.ui.main;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import pl.edu.pwr.lab4.i242571.PlaceModel;
import pl.edu.pwr.lab4.i242571.R;


public class PlaceItemViewHolder extends RecyclerView.ViewHolder {

    public TextView placeNameTv;
    public ImageView placeImageView;


    public PlaceItemViewHolder(View itemView) {
        super(itemView);
        itemView.setClickable(true);
        placeNameTv = (TextView) itemView.findViewById(R.id.place_name_tv);
        placeImageView = (ImageView) itemView.findViewById(R.id.place_icon_iv);

    }

    public void bind(PlaceModel placeModel) {
        placeNameTv.setText(placeModel.getName());
        placeImageView.setImageResource(placeModel.getImageResource());
    }


}