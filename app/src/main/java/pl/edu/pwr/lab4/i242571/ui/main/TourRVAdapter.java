package pl.edu.pwr.lab4.i242571.ui.main;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pl.edu.pwr.lab4.i242571.TourModel;
import pl.edu.pwr.lab4.i242571.R;

public class TourRVAdapter extends RecyclerView.Adapter<TourItemViewHolder> {
    private OnTourClickListener listener;

    public void setListener(OnTourClickListener listener) {
        this.listener = listener;
    }

    private List<TourModel> mTourModel;

    public TourRVAdapter(List<TourModel> mTourModel) {
        this.mTourModel = mTourModel;
    }

    @Override
    public void onBindViewHolder(TourItemViewHolder itemViewHolder, int i) {
        final TourModel model = mTourModel.get(i);
        itemViewHolder.bind(model);
        itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null) {
                    listener.onTourClick(model);
                }
            }
        });
    }

    @Override
    public TourItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tour_item, viewGroup, false);
        return new TourItemViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mTourModel.size();
    }

}
