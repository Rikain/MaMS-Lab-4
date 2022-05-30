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

import pl.edu.pwr.lab4.i242571.AccommodationActivity;
import pl.edu.pwr.lab4.i242571.AccommodationModel;
import pl.edu.pwr.lab4.i242571.Data;
import pl.edu.pwr.lab4.i242571.R;


public class AccommodationFragment extends Fragment implements OnAccommodationClickListener {

    public static final String accommodationPosMessage = "pl.edu.pwr.lab1.i242571.ACCOMMODATIONPOSMESSAGE";


    private RecyclerView recyclerview;
    private List<AccommodationModel> mAccommodationModel;
    private AccommodationRVAdapter adapter;
    private String lang;

    public AccommodationFragment(String lang) {
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

        View view = inflater.inflate(R.layout.fragment_accommodation, container, false);

        recyclerview = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAccommodationModel = new ArrayList<>();

        mAccommodationModel = Data.generateAccommodation(lang);

        adapter = new AccommodationRVAdapter(mAccommodationModel);
        adapter.setListener(this);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public void onAccommodationClick(AccommodationModel accommodationModel) {
        Intent intent = new Intent(this.getContext(), AccommodationActivity.class);
        intent.putExtra(accommodationPosMessage, accommodationModel);
        startActivity(intent);
    }
}