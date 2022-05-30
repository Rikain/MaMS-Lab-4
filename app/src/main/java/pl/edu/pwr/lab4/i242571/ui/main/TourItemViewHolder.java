package pl.edu.pwr.lab4.i242571.ui.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import pl.edu.pwr.lab4.i242571.TourModel;
import pl.edu.pwr.lab4.i242571.R;


public class TourItemViewHolder extends RecyclerView.ViewHolder {

    public TextView tourNameTv;
    public ImageView tourImageView;


    public TourItemViewHolder(View itemView) {
        super(itemView);
        itemView.setClickable(true);
        tourNameTv = (TextView) itemView.findViewById(R.id.tour_name_tv);
        tourImageView = (ImageView) itemView.findViewById(R.id.tour_icon_iv);
    }

    public void bind(TourModel tourModel) {
        tourNameTv.setText(tourModel.getName());
        tourImageView.setImageResource(tourModel.getImageResource());
    }

}
