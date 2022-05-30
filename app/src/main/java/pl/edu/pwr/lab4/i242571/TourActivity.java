package pl.edu.pwr.lab4.i242571;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import pl.edu.pwr.lab4.i242571.ui.main.OnPlaceClickListener;
import pl.edu.pwr.lab4.i242571.ui.main.PlaceRVAdapter;
import pl.edu.pwr.lab4.i242571.ui.main.TourFragment;


public class TourActivity extends AppCompatActivity implements OnMapReadyCallback, OnPlaceClickListener {
    private static final String MAPVIEW_BUNDLE_KEY = "TourMapViewBundleKey";
    public static final String tourPlacePosMessage = "pl.edu.pwr.lab1.i242571.TOURPLACEPOSMESSAGE";
    public static final String prevTourPosMessage = "pl.edu.pwr.lab1.i242571.PREVTOURPOSMESSAGE";

    private MapView mMapView;
    private List<PlaceModel> places;
    private TourModel tour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);

        TextView nameTv = findViewById(R.id.tour_name_tv);
        TextView descTv = findViewById(R.id.tour_description_tv);

        Intent intent = getIntent();
        tour = (TourModel) intent.getSerializableExtra(TourFragment.tourPosMessage);

        nameTv.setText(tour.getName());
        descTv.setText(tour.getDescription());

        places = tour.getPlaces();

        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }
        mMapView = (MapView) findViewById(R.id.mapView);
        mMapView.onCreate(mapViewBundle);
        mMapView.getMapAsync(this);

        RecyclerView recyclerview = (RecyclerView) findViewById(R.id.places_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);
        PlaceRVAdapter adapter = new PlaceRVAdapter(places);
        adapter.setListener(this);
        recyclerview.setAdapter(adapter);
    }

    @Override
    public void onPlaceClick(PlaceModel placeModel) {
        Intent intent = new Intent(this, PlaceActivity.class);
        intent.putExtra(tourPlacePosMessage, placeModel);
        intent.putExtra(prevTourPosMessage, tour);
        intent.putExtra("parent", "TOUR");
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mMapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mMapView.onStop();
    }

    @Override
    public void onMapReady(GoogleMap map) {
        for(PlaceModel place : places){
            map.addMarker(new MarkerOptions().position(place.getCoordinates()).title(place.getName()));
        }
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(places.get(0).getCoordinates(), 12));
    }

    @Override
    protected void onPause() {
        mMapView.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }
}
