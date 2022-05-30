package pl.edu.pwr.lab4.i242571.ui.main;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pl.edu.pwr.lab4.i242571.EventModel;
import pl.edu.pwr.lab4.i242571.R;

public class EventRVAdapter extends RecyclerView.Adapter<EventItemViewHolder> {
    private OnEventClickListener listener;

    public void setListener(OnEventClickListener listener) {
        this.listener = listener;
    }

    private List<EventModel> mEventModel;

    public EventRVAdapter(List<EventModel> mEventModel) {
        this.mEventModel = mEventModel;
    }

    @Override
    public void onBindViewHolder(EventItemViewHolder itemViewHolder, int i) {
        final EventModel model = mEventModel.get(i);
        itemViewHolder.bind(model);
        itemViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null) {
                    listener.onEventClick(model);
                }
            }
        });
    }

    @Override
    public EventItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.event_item, viewGroup, false);
        return new EventItemViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mEventModel.size();
    }

}
