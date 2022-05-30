package pl.edu.pwr.lab4.i242571.ui.main;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pl.edu.pwr.lab4.i242571.PlaceModel;
import pl.edu.pwr.lab4.i242571.R;

public class PlaceRVAdapter extends RecyclerView.Adapter<PlaceItemViewHolder> {
    private OnPlaceClickListener listener;

    public void setListener(OnPlaceClickListener listener) {
        this.listener = listener;
    }

    private List<PlaceModel> mPlaceModel;

    public PlaceRVAdapter(List<PlaceModel> mPlaceModel) {
        this.mPlaceModel = mPlaceModel;
    }

    @Override
    public void onBindViewHolder(PlaceItemViewHolder itemViewHolder, int i) {
        final PlaceModel model = mPlaceModel.get(i);
        itemViewHolder.bind(model);
        itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null) {
                    listener.onPlaceClick(model);
                }
            }
        });
    }

    @Override
    public PlaceItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_item, viewGroup, false);
        return new PlaceItemViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mPlaceModel.size();
    }

}
