package pl.edu.pwr.lab4.i242571.ui.main;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pl.edu.pwr.lab4.i242571.AccommodationModel;
import pl.edu.pwr.lab4.i242571.R;

public class AccommodationRVAdapter extends RecyclerView.Adapter<AccommodationItemViewHolder> {
    private OnAccommodationClickListener listener;

    public void setListener(OnAccommodationClickListener listener) {
        this.listener = listener;
    }

    private List<AccommodationModel> mAccommodationModel;

    public AccommodationRVAdapter(List<AccommodationModel> mAccommodationModel) {
        this.mAccommodationModel = mAccommodationModel;
    }

    @Override
    public void onBindViewHolder(AccommodationItemViewHolder itemViewHolder, int i) {
        final AccommodationModel model = mAccommodationModel.get(i);
        itemViewHolder.bind(model);
        itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null) {
                    listener.onAccommodationClick(model);
                }
            }
        });
    }

    @Override
    public AccommodationItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.accommodation_item, viewGroup, false);
        return new AccommodationItemViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mAccommodationModel.size();
    }

}
