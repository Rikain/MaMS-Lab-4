package pl.edu.pwr.lab4.i242571.ui.main;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import pl.edu.pwr.lab4.i242571.AccommodationModel;
import pl.edu.pwr.lab4.i242571.R;


public class AccommodationItemViewHolder extends RecyclerView.ViewHolder {

    public TextView accommodationNameTv;
    public TextView accommodationPlaceTv;
    public ImageView accommodationImageView;


    public AccommodationItemViewHolder(View itemView) {
        super(itemView);
        itemView.setClickable(true);
        accommodationNameTv = (TextView) itemView.findViewById(R.id.accommodation_name_tv);
        accommodationPlaceTv = (TextView) itemView.findViewById(R.id.accommodation_place_tv);
        accommodationImageView = (ImageView) itemView.findViewById(R.id.accommodation_icon_iv);

    }

    public void bind(AccommodationModel accommodationModel) {
        accommodationNameTv.setText(accommodationModel.getName());
        accommodationPlaceTv.setText(accommodationModel.getPlace());
        accommodationImageView.setImageResource(accommodationModel.getImageResource());
    }


}