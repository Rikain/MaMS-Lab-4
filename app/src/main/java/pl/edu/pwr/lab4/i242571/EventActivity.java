package pl.edu.pwr.lab4.i242571;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


import pl.edu.pwr.lab4.i242571.ui.main.EventFragment;

public class EventActivity extends AppCompatActivity implements OnMapReadyCallback{

    private static final String MAPVIEW_BUNDLE_KEY = "EventMapViewBundleKey";
    private MapView mMapView;
    private String placeName;
    private LatLng coordinates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        TextView nameTv = findViewById(R.id.event_name_tv);
        TextView descTv = findViewById(R.id.event_description_tv);
        ImageView imageIv = findViewById(R.id.event_icon_iv);

        Intent intent = getIntent();
        EventModel event = (EventModel) intent.getSerializableExtra(EventFragment.EventPosMessage);

        placeName = event.getPlace();
        coordinates = event.getCoordinates();

        nameTv.setText(event.getName());
        descTv.setText(event.getDescription());
        imageIv.setImageResource(event.getImageResource());

        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }
        mMapView = (MapView) findViewById(R.id.mapView);
        mMapView.onCreate(mapViewBundle);
        mMapView.getMapAsync(this);
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
        MarkerOptions marker = new MarkerOptions().position(coordinates).title(placeName);
        map.addMarker(marker);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(coordinates, 15));
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