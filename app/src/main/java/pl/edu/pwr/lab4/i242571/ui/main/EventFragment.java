package pl.edu.pwr.lab4.i242571.ui.main;



import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

import pl.edu.pwr.lab4.i242571.Data;
import pl.edu.pwr.lab4.i242571.EventActivity;
import pl.edu.pwr.lab4.i242571.EventModel;
import pl.edu.pwr.lab4.i242571.MainActivity;
import pl.edu.pwr.lab4.i242571.R;

public class EventFragment extends Fragment implements OnEventClickListener {

    public static final String EventPosMessage = "pl.edu.pwr.lab1.i242571.EVENTPOSMESSAGE";

    private RecyclerView recyclerview;
    private List<EventModel> mEventModel;
    private EventRVAdapter adapter;
    String lang;

    public EventFragment(String lang) {
        this.lang = lang;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_event, container, false);

        recyclerview = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mEventModel = new ArrayList<>();

        mEventModel = Data.generateEvents(lang);

        adapter = new EventRVAdapter(mEventModel);
        adapter.setListener(this);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public void onEventClick(EventModel eventModel) {
        Intent intent = new Intent(this.getContext(), EventActivity.class);
        intent.putExtra(EventPosMessage, eventModel);
        startActivity(intent);
    }
}