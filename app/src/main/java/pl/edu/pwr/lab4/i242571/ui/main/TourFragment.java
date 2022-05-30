package pl.edu.pwr.lab4.i242571.ui.main;



import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

import pl.edu.pwr.lab4.i242571.Data;
import pl.edu.pwr.lab4.i242571.PlaceModel;
import pl.edu.pwr.lab4.i242571.TourActivity;
import pl.edu.pwr.lab4.i242571.TourModel;
import pl.edu.pwr.lab4.i242571.R;

public class TourFragment extends Fragment implements OnTourClickListener {

    public static final String tourPosMessage = "pl.edu.pwr.lab1.i242571.TOURPOSMESSAGE";


    private RecyclerView recyclerview;
    private List<TourModel> mTourModel;
    private TourRVAdapter adapter;
    private String lang;

    public TourFragment(String lang) {
        this.lang = lang;
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tour, container, false);

        recyclerview = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTourModel = new ArrayList<>();

        mTourModel = Data.generateTours(lang);

        adapter = new TourRVAdapter(mTourModel);
        adapter.setListener(this);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public void onTourClick(TourModel tourModel) {
        Intent intent = new Intent(this.getContext(), TourActivity.class);
        intent.putExtra(tourPosMessage, tourModel);
        startActivity(intent);
    }
}