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
import pl.edu.pwr.lab4.i242571.PlaceActivity;
import pl.edu.pwr.lab4.i242571.PlaceModel;
import pl.edu.pwr.lab4.i242571.R;

public class PlaceFragment extends Fragment implements OnPlaceClickListener {

    public static final String placePosMessage = "pl.edu.pwr.lab1.i242571.PLACEPOSMESSAGE";


    private RecyclerView recyclerview;
    private List<PlaceModel> mPlaceModel;
    private PlaceRVAdapter adapter;
    String lang;

    public PlaceFragment(String lang) {
        this.lang = lang;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_place, container, false);

        recyclerview = (RecyclerView) view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPlaceModel = new ArrayList<>();
        mPlaceModel = Data.generatePlaces(lang);

        adapter = new PlaceRVAdapter(mPlaceModel);
        adapter.setListener(this);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public void onPlaceClick(PlaceModel placeModel) {
        Intent intent = new Intent(this.getContext(), PlaceActivity.class);
        intent.putExtra(placePosMessage, placeModel);
        intent.putExtra("parent", "MAIN");
        startActivity(intent);
    }
}