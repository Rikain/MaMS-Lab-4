package pl.edu.pwr.lab4.i242571;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Locale;

import pl.edu.pwr.lab4.i242571.ui.main.PlaceFragment;
import pl.edu.pwr.lab4.i242571.ui.main.TourFragment;

public class PlaceActivity extends AppCompatActivity implements TextToSpeech.OnInitListener, OnMapReadyCallback {
    private static final String MAPVIEW_BUNDLE_KEY = "PlaceMapViewBundleKey";
    String mParentActivity;
    TourModel prevTour;
    private TextToSpeech tts = null;
    private MapView mMapView;
    private String placeName;
    private LatLng coordinates;
    private String language = "en";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);

        TextView nameTv = findViewById(R.id.place_name_tv);
        TextView descTv = findViewById(R.id.place_description_tv);
        ImageView imageIv = findViewById(R.id.place_icon_iv);
        VideoView videoView = findViewById(R.id.videoView);
        Button tts_btn = findViewById(R.id.place_tts_btn);

        Intent intent = getIntent();
        mParentActivity = intent.getStringExtra("parent");
        PlaceModel place;
        if(mParentActivity.equals("MAIN")) {
            place = (PlaceModel) intent.getSerializableExtra(PlaceFragment.placePosMessage);
        } else{
            place = (PlaceModel) intent.getSerializableExtra(TourActivity.tourPlacePosMessage);
            prevTour = (TourModel) intent.getSerializableExtra(TourActivity.prevTourPosMessage);
        }

        int video;
        String desc;
        int img;
        String name;

        placeName = place.getName();
        coordinates = place.getCoordinates();
        video = place.getVideoResource();
        desc = place.getDescription();
        img = place.getImageResource();
        name = place.getName();
        language = place.getLanguage();

        nameTv.setText(name);
        descTv.setText(desc);
        imageIv.setImageResource(img);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + video);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        tts = new TextToSpeech(this, this);

        tts_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speak(desc);
            }
        });


        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }
        mMapView = (MapView) findViewById(R.id.mapView);
        mMapView.onCreate(mapViewBundle);
        mMapView.getMapAsync(this);
    }

    private void speak(String text){
        tts.speak(text,TextToSpeech.QUEUE_FLUSH, null,"");
    }

    @Override
    public void onInit(int i) {
        if (i == TextToSpeech.SUCCESS) {
            int result;
            if (this.language.equals("pl")) {
                result = tts.setLanguage(new Locale("pl_PL"));
            } else {
                result = tts.setLanguage(Locale.US);
            }
            if (result == TextToSpeech.LANG_MISSING_DATA) {
                Log.e("TTS", "The specified language is not supported!");
                result = tts.setLanguage(Locale.ENGLISH);
                if (result == TextToSpeech.LANG_MISSING_DATA) {
                    Log.e("TTS", "Failed to fall back to English!");
                }
            } else {
                Log.e("TTS", "Initialization failed!");

            }
        }
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
        if(tts != null){
            tts.stop();
            tts.shutdown();
        }
        mMapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }

    @Override
    public boolean onSupportNavigateUp() {
        if(mParentActivity.equals("MAIN")) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        } else if (mParentActivity.equals("TOUR")) {
            Intent intent = new Intent(this, TourActivity.class);
            intent.putExtra(TourFragment.tourPosMessage, prevTour);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        return super.onSupportNavigateUp();
    }

}
