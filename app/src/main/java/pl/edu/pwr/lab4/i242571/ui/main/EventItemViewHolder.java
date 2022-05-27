package pl.edu.pwr.lab4.i242571.ui.main;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import pl.edu.pwr.lab4.i242571.EventModel;
import pl.edu.pwr.lab4.i242571.R;


public class EventItemViewHolder extends RecyclerView.ViewHolder {

    public TextView eventNameTv;
    public TextView eventPlaceTv;
    public ImageView eventImageView;


    public EventItemViewHolder(View itemView) {
        super(itemView);
        itemView.setClickable(true);
        eventNameTv = (TextView) itemView.findViewById(R.id.event_name_tv);
        eventPlaceTv = (TextView) itemView.findViewById(R.id.event_place_tv);
        eventImageView = (ImageView) itemView.findViewById(R.id.event_icon_iv);

    }

    public void bind(EventModel eventModel) {
        eventNameTv.setText(eventModel.getName());
        eventPlaceTv.setText(eventModel.getPlace());
        eventImageView.setImageResource(eventModel.getImageResource());
    }


}